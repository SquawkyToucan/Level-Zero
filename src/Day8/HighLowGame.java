package Day8;
import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(20);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {

			// 1. ask the user for a guess using a pop-up window, and save their response 
		String derGuesse = JOptionPane.showInputDialog("Guess a number between one and twenty.");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
		int dieGuesse = Integer.parseInt(derGuesse);
			// 5. if the guess is correct
		if (dieGuesse==random) {
			JOptionPane.showMessageDialog(null, "Congratulations, you've won it!");
			System.exit(0);
		}
		if(dieGuesse > random){
			JOptionPane.showMessageDialog(null, "Too high!");
		}
		if(dieGuesse < random){
			JOptionPane.showMessageDialog(null, "Too low!");
		}
				// 8. tell them it's too high
			// 9. if the guess is low
				// 10. tell them it's too low
		}
	JOptionPane.showMessageDialog(null, "You lose.");	
	}

}

//This currency translation - 1 HLG (must be in unit "Finished First") = 2 Cookies = 0.00001 USD (after eaten)