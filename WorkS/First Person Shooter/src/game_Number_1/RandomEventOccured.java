package game_Number_1;
import java.lang.Math;
import java.util.Random;


public class RandomEventOccured {
		
	public static Random RandomInt = new Random();
	public int EventChooser;
	public int Count = 0;
	
		
		public int EventChoosing() {
			this.EventChooser = RandomInt.nextInt(100);
		
			
			if (EventChooser >= 70 && EventChooser <= 75) {
				Count = -1;
				
			}return Count;
			
			
		}

}
