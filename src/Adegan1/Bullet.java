package Adegan1;

import Menu.BackSound;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.awt.Graphics;
// import java.awt.Image;
// import java.awt.Rectangle;
/**
 *
 * @author RAISRINDO
 */
public class Bullet extends ObjekGame {
	private int speed=3;
	
	String namaLagu = ".\\Sound\\damageSound.wav";
        BackSound music = new BackSound();
    
	public int GetSpeed(){
		return speed;
	}
	
	public void SetSpeed(int speed){
		this.speed=speed;
	}
	
	public Bullet(int x,int y) {
		this.x=x;
		this.y=y;
		this.image=Starter.bullet;
		music.playMusic(namaLagu);
	}
	
	@Override
	public boolean OutOfBoder() {
		return y<(-height);
	}

	@Override
	public void step() {
		 y-=speed;
	}
}
