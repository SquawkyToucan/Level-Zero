import javax.swing.JOptionPane;

public class MadLibsoftheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, \nhere's how to do it...");
		// Get the user to enter an adjective
		String PiranhaAdjective = JOptionPane.showInputDialog("Please enter in an adjective.");
		// Get the user to enter a type of liquid
		String PiranhaLiquid = JOptionPane.showInputDialog("Please enter a type of liquid. (Non-alcoholic.)");
		// Get the user to enter a body part
		String PiranhaBodyPart = JOptionPane.showInputDialog("Please enter a body part. (Human)");
		// Get the user to enter a verb
		String PiranhaVerb = JOptionPane.showInputDialog("Please enter a verb.");
		// Get the user to enter a place
		String PiranhaPlace = JOptionPane.showInputDialog("Please enter a place. (Use the for cases like 'The Amazon Rainforest' or 'The moon.')");
		String BurgerShop = JOptionPane.showInputDialog("Please enter a burger place.");
		String Pizza = JOptionPane.showInputDialog("Enter a pizza chain.");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		JOptionPane.showMessageDialog(null,
				"Piranhas are more " + PiranhaAdjective + " during the day, so cross the river at \nnight. They are attracted to fresh " + PiranhaLiquid
						+ " and will most likely take a bite out of \nyour " + PiranhaBodyPart + " if you " + PiranhaVerb + ". Refrain from stopping at " + Pizza + " or "
						+ BurgerShop + ". Whatever you do, if you have an open wound, \ntry to find another way to get back to " + PiranhaPlace + ". Good Luck!");

		// Make a pop-up for the final story. You can use \n to go to the next line.

	}
}
