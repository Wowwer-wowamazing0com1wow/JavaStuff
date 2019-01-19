package game_Number_1;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.lang.Math;

public class Main_Game_Programming {
	public static int RandomEvent;
	public static int Count;
	public static int TimePassed;
	
	public static void main(String[] args) throws InterruptedException {
		long startTime = System.nanoTime();
		long estimatedTime = 0;
		String U= "Hah";
		
		while (Count <= 100){	
			
			 // ... the code being measured ...
			 estimatedTime = System.nanoTime() - startTime - ((Count * 60) * 1000000000);
		RandomEventOccured Event = new RandomEventOccured(); 
		System.out.println(Count + " minute(s) have passed...");	 
		Count = Count + Event.EventChoosing();
		
		TimeUnit.SECONDS.sleep(60);
		if (Event.EventChoosing() < 0){
			System.out.println("Amazing! 1 minute has been subtracted from the time passed!");
			System.out.println("Now only " + Count + " minute(s) have passed!");
			TimePassed++;
		}
		Count++;
		
		
		TimePassed++;
		}
	System.out.println(Count + " minute timer complete!");
		
	}

}
