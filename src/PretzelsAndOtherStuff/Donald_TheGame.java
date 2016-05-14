package PretzelsAndOtherStuff;
import javax.swing.JOptionPane;
import java.util.*;

public class Donald_TheGame {
public static void main(String[] args){/*TaskList: Marco Rubio (/lie), Ted Cruz (/lie), and Bernie Sanders (/china) before facing Hillary Clinton */
	int gamePoints = 0;
	int score = 0;
	int cash = 0;
	JOptionPane.showMessageDialog(null, "You are about to take the test of Donaldia. Enter at your own risk.");
	String Mexico = JOptionPane.showInputDialog(null, "I would build a wall with this country.");
	if(Mexico.equalsIgnoreCase("Mexico")){
		JOptionPane.showMessageDialog(null,  "That is correct.");
		score++;
	}
	else{
		JOptionPane.showMessageDialog(null, "Donald Trump's Comment: Are you that stupid? Are you from Mexico?");
	}
	String Muslims = JOptionPane.showInputDialog(null, "I would block these people from entering the country.");
	if(Muslims.equalsIgnoreCase("Muslims")){
		JOptionPane.showMessageDialog(null, "That's correct! Give this man a prize!");
		score++;
	}
	else{
		JOptionPane.showMessageDialog(null, "You freaking idiot! You're so much like Lyin' Ted, I'll see you two in Canada some day!");
	}
	String HillaryClinton = JOptionPane.showInputDialog(null, "I will beat this person in debates so bad they won't know what hit them.");
	if(HillaryClinton.equalsIgnoreCase("Hillary Clinton")){
		JOptionPane.showMessageDialog(null, "You aren't as stupid as I thought.");
		score++;
	}
	else{
		JOptionPane.showMessageDialog(null, "Idiot!");
	}
	JOptionPane.showMessageDialog(null, "I am analyzing your score to see how you will do in the game of Trump.");
	if(score == 0){
		JOptionPane.showMessageDialog(null, "You will start out with a small loan of a million dollars.");
		cash = cash + 1;
	}
	if(score == 1){
		JOptionPane.showMessageDialog(null, "The rigged Super PACs will fund you with two million dollars.");
		cash = cash + 2;
	}
	if(score == 2){
		JOptionPane.showMessageDialog(null, "You have my real amount of money - 4 billion.");
		cash = cash + 4000;
	}
	if(score == 3){
		JOptionPane.showMessageDialog(null, "You're worth 10 billion.");
		cash = cash + 10000;
	}
	
	//The game begins here!
	
	JOptionPane.showMessageDialog(null, "Welcome to Donald: The Game. Use /lie, /cheat, and /china to win the race. You will start off with this amount of money(in millions): " + cash);
	String respondToCarson = JOptionPane.showInputDialog("Attack: Ben Carson understands government, unlike Donald Trump. \nRespond with /lie, /cheat, or /china.");
	// Lie gets 0, Cheat gets 1 and China gets 0
	if(respondToCarson.equalsIgnoreCase("/lie")){
		Random rand = new Random();
		int respondtoevilcarson = rand.nextInt(3); 
		if(respondtoevilcarson == 0){
			JOptionPane.showMessageDialog(null, "Ben Carson is a quack who hasn't cured a single person.");
		}
		if(respondtoevilcarson == 1){
			JOptionPane.showMessageDialog(null, "Carson wants to become allies with North Korea!");
		}
		if(respondtoevilcarson == 2){
			JOptionPane.showMessageDialog(null, "Ben Carson is an idiot and he likes ISIS.");
		}
	}
	if(respondToCarson.equalsIgnoreCase("/cheat")){
		Random rand = new Random();
		int respondtoevilcarson = rand.nextInt(3); 
		if(respondtoevilcarson == 0){
			JOptionPane.showMessageDialog(null, "You bribed caucus voters and won a debate, causing you to win a landslide in New Hampshire. Plus one point.");
			gamePoints++;
			if(gamePoints == 3){
				JOptionPane.showMessageDialog(null, "You won and are now the supreme ruler of the world.");
				System.exit(0);
			}
		}
		if(respondtoevilcarson == 1){
			JOptionPane.showMessageDialog(null, "You sabotage Carson's tires and claim that it was because he was unprepared... Plus one point.");
			gamePoints++;
			if(gamePoints == 3){
				JOptionPane.showMessageDialog(null, "You have taken control and have declared yourself dictator.");
				System.exit(0);
			}
		}
		if(respondtoevilcarson == 2){
			JOptionPane.showMessageDialog(null, "You break into the office of the caucus and release false information, claiming you won. Plus one point.");
			gamePoints++;
			if(gamePoints == 3){
				JOptionPane.showMessageDialog(null, "You take control and arrest everyone who speaks out.");
				System.exit(0);
			}
		}
	}
	if(respondToCarson.equalsIgnoreCase("/china")){
		Random rand = new Random();
		int respondtoevilcarson = rand.nextInt(3); 
		if(respondtoevilcarson == 0){
			JOptionPane.showMessageDialog(null, "Climate Change was created by China and for China!");
		}
		if(respondtoevilcarson == 1){
			JOptionPane.showMessageDialog(null, "China's military is trying to take over while we sit here and do nothing.");
		}
		if(respondtoevilcarson == 2){
			JOptionPane.showMessageDialog(null, "The Chinese economy is overtaking us. I will send them down.");
		}
	}
		String respondToHillary = JOptionPane.showInputDialog("Attack: Hillary for America. Better than racist Trump. \nRespond with /lie, /cheat, or /china.");
		// Lie gets 0, Cheat gets 1 and China gets 0
		if(respondToHillary.equalsIgnoreCase("/lie")){
			Random rand = new Random();
			int respondtoevilhillary = rand.nextInt(3); 
			if(respondtoevilhillary == 0){
				JOptionPane.showMessageDialog(null, "Hillary Clinton killed my dog!");
			}
			if(respondtoevilhillary == 1){
				JOptionPane.showMessageDialog(null, "Hillary Clinton wants to invade Canada!");
			}
			if(respondtoevilhillary == 2){
				JOptionPane.showMessageDialog(null, "A Vote for Hillary is a vote for immigrants.");
			}
		}
		if(respondToHillary.equalsIgnoreCase("/cheat")){
			Random rand = new Random();
			int respondtoevilhillary = rand.nextInt(3); 
			if(respondtoevilhillary == 0){
				JOptionPane.showMessageDialog(null, "You bribed electoral voters and won Alaska. Plus one point.");
				gamePoints++;
				if(gamePoints == 3){
					JOptionPane.showMessageDialog(null, "You won and are now the supreme ruler of the world.");
					System.exit(0);
				}
			}
			if(respondtoevilhillary == 1){
				JOptionPane.showMessageDialog(null, "You drain the gas from Hillary's bus and she misses a day of capaigning. Plus one point.");
				gamePoints++;
				if(gamePoints == 3){
					JOptionPane.showMessageDialog(null, "You have taken control and have declared yourself dictator.");
					System.exit(0);
				}
			}
			if(respondtoevilhillary == 2){
				JOptionPane.showMessageDialog(null, "You break into the office of the vote in Manhattan and release false information, claiming you won. Plus one point.");
				gamePoints++;
				if(gamePoints == 3){
					JOptionPane.showMessageDialog(null, "You take control and arrest everyone who speaks out.");
					System.exit(0);
				}
			}
		}
		if(respondToHillary.equalsIgnoreCase("/china")){
			Random rand = new Random();
			int respondtoevilhillary = rand.nextInt(3); 
			if(respondtoevilhillary == 0){
				JOptionPane.showMessageDialog(null, "Climate Change was created by China and for China!");
			}
			if(respondtoevilhillary == 1){
				JOptionPane.showMessageDialog(null, "China's military is trying to take over while we sit here and do nothing.");
			}
			if(respondtoevilhillary == 2){
				JOptionPane.showMessageDialog(null, "The Chinese economy is overtaking us. I will send them down.");
			}
		}
}
}
