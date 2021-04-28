package Adegan1;

import Menu.BackSound;


//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Rectangle;


/**
 *
 * @author RAISRINDO
 */

public class Player extends ObjekGame 
{
	private int isDoubleFire;
	private int Life;
       
	
	public Player() {
		
		Life=3;
		isDoubleFire=0;
		this.image=Starter.player;
		height=image.getHeight();
		width=image.getWidth();
		x=450;
		y=400;
      
	}
	
	public boolean isDoubleFired(){
		return isDoubleFire>0;
	}
	
	public void SetDoubleFire(){
		isDoubleFire=1;
	}
	
	public void deDoubleFire(){
		isDoubleFire=0;
	}
	
	public void addLife(){
		Life++;
	}
	
	public void decreaseLife() {
		Life--;
	}
	
	public int getLife(){
		return Life;
	}
	
	public void moveto(int x,int y){
		this.x=x-this.width/2;
		this.y=y-this.height/2;
	}
	
	@Override
	public boolean OutOfBoder() {
		return false;
	}
	
	public Bullet[] fire(){
		int xLoc=width/4;
		int yLoc=20;
		if(isDoubleFired()){
			Bullet [] bullets= new Bullet[2];
			bullets[0]=new Bullet(x+xLoc, y-yLoc);
			bullets[1]=new Bullet(x+3*xLoc, y-yLoc);
			return bullets;
		}
		else{
			Bullet [] bullets=new Bullet[1];
			bullets[0]=new Bullet(x+2*xLoc, y-yLoc);
			return bullets;
		}
	}
	@Override
	public void step() {
		
	}
	
	public boolean ishit(ObjekGame others){
		int otherLeftX=others.x-width/2;
		int otherRightX=others.x+width/2+others.width;
		int otherTopY=others.y-height/2;
		int otherBottomY=others.y+height/2+others.height;
		int thisX=x+width/2;
		int thisY=y+height/2;
		return thisX>otherLeftX&&thisX<otherRightX&&thisY>otherTopY&&thisY<otherBottomY;

	}
}
