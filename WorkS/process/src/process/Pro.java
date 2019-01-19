package process;

import processing.core.PApplet;
import processing.core.PImage;


public class Pro extends PApplet{
	public static void main(String[] args){
		PApplet.main("process.Pro");
		System(EXIT_ON_CLOSE);
	}
	public void settings(){
		try{
        size(900,700);
        
		}catch(Exception e){
			size(900,700);
	        
		}
    }// setup

    public void draw(){
        PImage background = loadImage("Background.png");
        image(background,900,700);
    }// draw
	
}

