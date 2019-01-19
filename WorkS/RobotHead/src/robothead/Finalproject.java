package robothead;

import java.util.Scanner;
import processing.core.PApplet;
import java.util.Random;
import java.lang.Math;
public class Finalproject {
	static char[][] user = {
	        { '#', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	        { '#', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	        { '.', '#', '#', '#', '#', '#', '.', '.', '.', '.' },
	        { '.', '.', '.', '.', '.', 'O', 'O', '.', '.', '.' },
	        { '.', '.', '.', '.', 'o', 'o', 'O', '.', '.', '.' },
	        { '.', '.', '.', '.', '.', 'o', '.', '.', '.', '.' },
	        { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	        { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	        { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	        { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' }
	    }; 
	public static void print(char[][] grid) {
		/*
        System.out.println(" 0123456789");
        for(int i=0; i<10; i+=1) {
            System.out.print(i);
            for (int j=0; j<10; j+=1) {
                System.out.print(grid[i][j]);
                if(j == 9) {
                    System.out.println();
                }
            }
            System.out.println(); 
        }*/
    }
	
    public static void main(String[] args) {
        
        
        print(user);
        Begin();
    }
    
    
        
    public static void Begin() {
    	Random randomGenerator = new Random();
        int playerLevel = 1;
        String playerName = "AGenericPlayerName";
        double playerHealth = 100.0;
        @SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
        System.out.println("What is your character's name?");
        playerName = userInput.nextLine();
        System.out.println("Welcome " + playerName + "!");
        System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");
         
        System.out.println("1. Enter the Cave");
        System.out.println("2. Run away to the safety of your warm bed");
        
        int playerChoice;
        playerChoice = userInput.nextInt();
        if(playerChoice == 1) {
            System.out.println("You made it to the entrance of the cave.");
            playerLevel++;
            System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel);
             
            System.out.println("You travel forward into the dark cave. You feel something press against your leg...");
            System.out.println("It's a trap! Suddenly, you're being bombarded by rocks from above.");
            int rockDamage;
            rockDamage = randomGenerator.nextInt(5);
            playerHealth -= rockDamage;
            System.out.println("The rock slide hits you for " + rockDamage + "!");
            System.out.println("You have " + playerHealth + " health remaining.");
             
            System.out.println("You pick yourself up from the cave floor and brush a cloud of dust from your clothes.");
            System.out.println("The cave narrows as you press on until you manage to squeeze through an opening into a large natural cavern.");
            System.out.println("Before you is a treasure chest.");
             
            boolean hasSword = false;
            System.out.println("1. Open the chest.");
            System.out.println("2. Ignore the chest. Obvious trap is obvious.");
            playerChoice = userInput.nextInt();
             
            if(playerChoice == 1){
                System.out.println("Uneasy after your brush with death, you slowly open the chest to reveal a magical sword!");
                hasSword = true;
            }
            boolean Variable = false;
            boolean hasShield = false;
            boolean hasQuestionableItem = false;
            boolean hasCurse = false;
            
            
            
            System.out.println("You leave the cavern with the chest and continue your journey");
            System.out.println("You come across a cavern that splits into many different passages");
            System.out.println("1. Take the left path on the far side of the cavern.");
            System.out.println("2. Take the middle path on the far side of the cavern.");
            System.out.println("3. Take the right path on the far side of the cavern.");
            System.out.println("4. Take the path to the direct left of the entrance.");
            System.out.println("5. Take the path to the direct right of the entrance.");
            
            while(true){
            	
            	playerChoice = userInput.nextInt();
            	
            	if(playerChoice == 1){
            		System.out.println("You take the left path on the far side of the cavern.");
            		System.out.println("You come across a shrine which has many bones littered around it");
            		System.out.println("Nothing except the bones seem to be around the shrine.");
            		System.out.println("A plaque on the shrine is barely readable, but you cannot even make out the least faint words in the light."); //...in hopes he does not eat us all. "written on the shrine");
            		System.out.println("You go back to the cavern with many other paths");
            	
            	}
            	if(playerChoice == 2){
            		System.out.println("You take the middle path on the far side of the cavern.");
            		System.out.println("You come across an angered ghost.");
            		System.out.println("Suddenly the ghost notices you and starts shrieking an incantation.");
            		System.out.println("You run back to the cavern to try to avoid it, but it is too late, you are cursed.");
            		hasCurse = true;
            	
            	}
            	if(playerChoice == 3){
            		System.out.println("You take the right path on the far side of the cavern.");
            		System.out.println("You come across a table with something indescribeable on it");
            		System.out.println("You pick it up and go back to the cavern thinking it may have some use.");
            		hasQuestionableItem = true;
            	}
            	if(playerChoice == 4){
            		System.out.println("You take the path to the direct left of the entrance."); 
            		break;
            	}
            	if(playerChoice == 5){
            		System.out.println("You take the path to the direct right of the entrance.");
	            	System.out.println("You come across a dead tree");
	            	System.out.println("You pick up a dried piece of wood to use as a shield");
	            	hasShield = true;
            	}
            }
            
            
             
            
            System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
            System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
            System.out.println("You swallow hard and decide it is time to leave.");
            System.out.println("As you turn your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");
            
            System.out.println("1. Hide and hope the dragon goes back to sleep.");
            System.out.println("2. Run Away");
            System.out.println("3. Attempt to distract it with the Questionable item");
            System.out.println("4. Dodge and Attack it.");
            if(hasSword = true){
            System.out.println("5. Attack while it's still confused.");
            }
            while(true){
            	
            	playerChoice =userInput.nextInt();
            	
            	if(playerChoice == 1 && hasCurse == true){
            		System.out.println("You dive behind a rock and pray that the dragon didn't see you.");
            		System.out.println("The curse activates, and shines like a terrifying blue beacon above you, giving away your position!");
            		System.out.println("The curse momentarily blinds the dragon, and you sprint into the caverns!");
            		System.out.println("The dragon is annoyed and blindly breathes fire into the cavern you left, and you cannot out-run the flames");
            		GameOver();
            	}
            	if(playerChoice == 1 && hasCurse == false){
            		System.out.println("You dive behind a rock and pray that the dragon didn't see you.");
            		System.out.println("The dragon looks around for a moment and goes back to sleep.");
            		break;
                }
                if(playerChoice == 2 && hasCurse == true){
                	
                }
                if(playerChoice == 2 && hasCurse == false){
                	
                }
                if(playerChoice == 3 && hasCurse == true){
                	
                }
                if(playerChoice == 3 && hasCurse == false){
                	
                }
                if(playerChoice == 4 && hasCurse == true){
                	
                }
                if(playerChoice == 4 && hasCurse == false){
                	
                }
                if(playerChoice == 5 && hasCurse == true){
                	System.out.println("You pull out your sword and dive towards the dragon's head!");
            		System.out.println("The curse activates, and pulls the sword away from your grasp!");
            		System.out.println("You land on the dragon's head, holding on to keep yourself from being burned to ashes or eaten by the dragon!");
            		System.out.println("The curse turns the sword toward you and stabs it into your head instantly killing you.");
            		GameOver();
                }
                if(playerChoice == 5 && hasCurse == false){
                	
                }	
            }
            
             
        } else {
            System.out.println(playerName + " runs home and goes to sleep.");
            System.exit(0);
        }
         
    }

	private static void GameOver() {
		String playerChoice = "";
		Scanner userInput = new Scanner(System.in);
		System.out.println("Would you like to try again? y or n");
		playerChoice = userInput.next();
		if (playerChoice == "y"){
			Begin();
		}else{
			System.exit(0);
		}
	}
}
