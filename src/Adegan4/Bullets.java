package Adegan4;

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
public class Bullets extends ObjekGame
{
	public int speed;
	
	public Bullets() 
	{
		image=Starter4.bullets;
		height=image.getHeight();
		width=image.getWidth();
		Random rand = new Random();
		y=-height;
		x=rand.nextInt(Starter4.WIDTH-width)+50;
		speed=10;
	}
	
	@Override
	public boolean OutOfBoder() {
		return y>Starter4.HEIGHT;
	}

	@Override
	public void step() {
		y+=speed;
	}

}
