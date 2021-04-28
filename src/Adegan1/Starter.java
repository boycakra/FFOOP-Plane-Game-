package Adegan1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author RAISRINDO
 */

public class Starter extends JPanel 
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static int WIDTH = 1000;
	public static int HEIGHT = 650;
	public int state = START;
	private static final int START = 1;
	private static final int RUNNING = 2;
	private static final int PAUSING = 3;
	private static final int GAMEOVER = 4;
	public static BufferedImage start;
	public static BufferedImage pause;
	public static BufferedImage gameover;
	public static BufferedImage background;
	public static BufferedImage player;
	public static BufferedImage bullet;
	public static BufferedImage award;
	public static BufferedImage enemy;
	private int loopTime = 0;
	private int BulletLoopTime = 0;
	
        
        private int score;
	ArrayList<ObjekGame> flyings = new ArrayList<ObjekGame>();
	ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	Player PlayerPlane = new Player();
	
	public void startGame() 
	{
            final int delay = 10;
            final int frequency = 10;
            MouseAdapter mouseAdapter = new MyMouseAdapter();
            this.addMouseListener(mouseAdapter);
            this.addMouseMotionListener(mouseAdapter);
            Timer timer = new Timer();
            
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    if (state == RUNNING) {
                        enterFlying();
                        takeAStep();
                        shootABullet();
                        isHit();
                        getReward();
                        checkOutofBorder();
                        checkGameOver();
                    }
                    repaint();
                }
            }, delay, frequency);
            
	}
	
	static 
	{
            try 
            {
                player = ImageIO.read(new File(".\\Image\\player.png"));
                background = ImageIO.read(new File(".\\Image\\background.png"));
                start = ImageIO.read(new File(".\\Image\\start.png"));
                pause = ImageIO.read(new File(".\\Image\\pause.png"));
                gameover = ImageIO.read(new File(".\\Image\\gameover.png"));
                enemy = ImageIO.read(new File(".\\Image\\enemy.png"));
                award = ImageIO.read(new File(".\\Image\\award.png"));
                bullet = ImageIO.read(new File(".\\Image\\bullet.png"));
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(background, 0, 0, null);
		paintMyPlane(g);
		paintBullet(g);
		paintFlyingObjects(g);
		paintScore(g);
		paintState(g);

	}

	public void paintMyPlane(Graphics g) {
		g.drawImage(PlayerPlane.image, PlayerPlane.getX(), PlayerPlane.getY(), null);
	}

	public void paintBullet(Graphics g) {
		for (int i = 0; i < bullets.size(); i++) {
			Bullet bullet = bullets.get(i);
			g.drawImage(bullet.GetImage(), bullet.getX() - bullet.getHeight(), bullet.getY(), null);
		}
	}

	public void paintFlyingObjects(Graphics g) {
		for (int i = 0; i < flyings.size(); i++) {
			ObjekGame flying = flyings.get(i);
			g.drawImage(flying.GetImage(), flying.getX(), flying.getY(), null);
		}
	}

	public void paintScore(Graphics g) {
		int x = 10;
		int y = 40;
		Font font = new Font(Font.MONOSPACED, Font.BOLD, 22);
		g.setColor(new Color(0xFF0000));
		g.setFont(font);
		g.drawString("SCORE : " + score, x, y);
		y += 30;
		g.drawString("LIFE : " + PlayerPlane.getLife(), x, y);
	}
	

	public void paintState(Graphics g) {
		switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
                        
			break;
		case PAUSING:
			g.drawImage(pause, 0, 0, null);
			break;
		case GAMEOVER:
			g.drawImage(gameover, 0, 0, null);
			break;
		}
	}
        

	public void enterFlying() {
		loopTime++;
		if (loopTime % 10 == 0) {
			ObjekGame newobj = nextFlyingObj();
			flyings.add(newobj);
		}
	}

	public void takeAStep() {
            
		for (ObjekGame obj : flyings) {
			obj.step();
		}
		for (Bullet bt : bullets) {
			bt.step();
		}
		PlayerPlane.step();
	}

	public void shootABullet() {
		BulletLoopTime++;
		if (BulletLoopTime % 25 == 0) {
			Bullet temp[] = PlayerPlane.fire();
			for (int i = 0; i < temp.length; i++)
				bullets.add(temp[i]);
		}
	}

	public void isHit() {
		for (int i = 0; i < bullets.size(); i++) {
			Bullet  b=bullets.get(i);
			if(isHitByBullet(b)){
				bullets.remove(b);
				i--;
			}
		}
	}

	public void getReward() {
		for (int i = 0; i < flyings.size(); i++) {
			ObjekGame obj = flyings.get(i);
			if (obj instanceof FlyingAwards) {
				Awards aw = (Awards) obj;
				if (obj.isPickByPlane(PlayerPlane)) {
					int type = aw.getAwardType();
					if (type == Awards.ADDLIFE) {
						PlayerPlane.addLife();
					} else if (type == Awards.DOUBLEFIRE) {
						PlayerPlane.SetDoubleFire();
					}
					flyings.remove(obj);
					i--;
				}
			}
		}
	}

	public void checkOutofBorder() {
		for (int i = 0; i < flyings.size(); i++) {
			if (flyings.get(i).OutOfBoder()) {
				flyings.remove(i);
				i--;
			}
		}
		for (int i = 0; i < bullets.size(); i++) {
			if (bullets.get(i).OutOfBoder()) {
				bullets.remove(i);
				i--;
			}
		}
	}

	public void checkGameOver() {
		if (isGameOver()) {
			state = GAMEOVER;
		}
	}


	public ObjekGame nextFlyingObj() {
		Random rand = new Random();
		int temp = rand.nextInt(60);
		if (temp < 5) {
			return new FlyingAwards();
		} else
			return new Enemy();
	}

	public boolean isGameOver() {
		for (int i = 0; i < flyings.size(); i++) {
			ObjekGame ob = flyings.get(i);
			if (PlayerPlane.ishit(ob)) {
				PlayerPlane.decreaseLife();
				PlayerPlane.deDoubleFire();
				flyings.remove(ob);
				i--;
			}
		}
		return PlayerPlane.getLife() <= 0;
	}

	
	public boolean isHitByBullet(Bullet b) {
		int flag=0;
		for (int i = 0; i < flyings.size(); i++) {
			ObjekGame obj = flyings.get(i);
			if (obj instanceof Enemys) {
				if (obj.IsGetHit(b)) {
					Enemys e = (Enemys) obj;
					score += e.getScore();
					flyings.remove(obj);
					i--;
					flag=1;
				}
			}
		}
		if(flag>0) return true;
		else return false;
	}
	

	public class MyMouseAdapter extends MouseAdapter 
	{
		@Override
		public void mouseClicked(MouseEvent e) {
			switch (state) {
			case START:
				state = RUNNING;
                                //String namaLagu = ".\\Sound\\Adegan1.wav";
                                //BackSound music = new BackSound();
                                //music.playMusic(namaLagu);
				break;

			case GAMEOVER:
				flyings.clear();
				bullets.clear();
				PlayerPlane = new Player();
				score = 0;
				state = START;
				loopTime = 0;
				BulletLoopTime = 0;
                                //music.stopMusic();
                                //new Story0().setVisible(true);
                                
                                
				break;
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (state == PAUSING) {
				state = RUNNING;
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (state == RUNNING) {
				state = PAUSING;
			}
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			if (state == RUNNING) {
                            
				int x = e.getX();
				int y = e.getY();
				PlayerPlane.moveto(x, y);
			}
		}


	}
	
	
	public static void main(String game1) {
		JFrame frame = new JFrame("GERILYA UDARA '47");
		Starter game = new Starter();
		frame.add(game);
		frame.setSize(WIDTH, HEIGHT);
		frame.setAlwaysOnTop(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setIconImage(new ImageIcon(".\\Image\\icon.png").getImage());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		game.startGame();
        
	}
	
	
}
