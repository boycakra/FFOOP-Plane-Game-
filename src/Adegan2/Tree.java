package Adegan2;

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
public class Tree extends ObjekGame
{
	public int speed;
	
	public Tree() 
	{
		image=Starter2.tree;
		height=image.getHeight();
		width=image.getWidth();
		Random rand = new Random();
		y=-height;
		x=rand.nextInt(Starter2.WIDTH)+50;
		speed=5;
	}
	
	@Override
	public boolean OutOfBoder() {
		return y>Starter2.HEIGHT;
	}

	@Override
	public void step() {
		y+=speed;
	}

}
