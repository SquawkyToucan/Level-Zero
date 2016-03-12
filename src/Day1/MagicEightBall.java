package Day1;
import java.util.Random;

import javax.swing.JOptionPane;

public class MagicEightBall {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new
		// Random().nextInt(4)"
		int random = new Random().nextInt(8);
		// 3. Print out this variable
		System.out.println(random);
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask me a yes/no question.");
		// 5. If the random number is 0
		if (random == (0)) {
			JOptionPane.showMessageDialog(null, "It is likely.");
		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		if (random == (1)) {
			JOptionPane.showMessageDialog(null, "Probably not.");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (random == (2)) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google.");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (random == (3)) {
			JOptionPane.showMessageDialog(null, "I am on a phone call in Europe. Please leave a message and try again later.");
		}
		if (random == (4)) {
			JOptionPane.showMessageDialog(null, "It's a secret.");
		}
		if (random == (5)) {
			JOptionPane.showMessageDialog(null, "Clean your room and finish your homework and then I'll tell you.");
		}
		if (random == (6)) {
			JOptionPane.showMessageDialog(null, "It's wrong to even dream about it!");
		}
		if (random == (7)) {
			JOptionPane.showMessageDialog(null, "Well, of course! I thought you already knew...");

		}
		// -- write your own answer
	}

}