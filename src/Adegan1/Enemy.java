package Adegan1;

//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Rectangle;
import Menu.BackSound;
import java.util.Random;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAISRINDO
 */
public class Enemy extends ObjekGame implements Enemys 
{
	public int speed;
       
	
	
	public Enemy() 
	{
		image=Starter.enemy;
		height=image.getHeight();
		width=image.getWidth();
		Random rand = new Random();
		y=-height;
		x=rand.nextInt(Starter.WIDTH-width);
		speed=rand.nextInt(3)+2;
                
	}
	
	@Override
	public boolean OutOfBoder() {
		return y>Starter.HEIGHT;
	}

	@Override
	public void step() {
		y+=speed;
	}
	@Override
	public int getScore() {
		return 5;
	}

}
