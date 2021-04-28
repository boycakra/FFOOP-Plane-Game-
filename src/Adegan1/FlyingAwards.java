package Adegan1;

import java.util.Random;

public class FlyingAwards extends ObjekGame implements Awards {
	private int xSpeed=1;
	private int ySpeed=2;
	private int awardType;
	public FlyingAwards() {
		this.image=Starter.award;
		height=image.getHeight();
		width=image.getWidth();
		y=-height;
		Random rand =new Random();
		x=rand.nextInt(Starter.WIDTH-width);
		awardType=rand.nextInt(2);
	}
	
	@Override
	public void step() {
		x+=xSpeed;
		y+=ySpeed;
		if(x>Starter.WIDTH-width){
			xSpeed=-1;
		}
		if(x<0){
			xSpeed=1;
		}
	}
	@Override
	public int getAwardType() {
		return awardType;
	}

	@Override
	public boolean OutOfBoder() {
		return y>Starter.HEIGHT;
	}



}
