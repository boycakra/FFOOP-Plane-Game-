package Adegan3;

//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Rectangle;
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
		image=Starter3.enemy;
		height=image.getHeight();
		width=image.getWidth();
		Random rand = new Random();
		y=200;
		x=rand.nextInt(Starter3.WIDTH-width);
		speed=rand.nextInt(3)+2;
	}
	
	@Override
	public boolean OutOfBoder() {
		return y>Starter3.HEIGHT;
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
