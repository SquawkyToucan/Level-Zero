package Day2;

import javax.swing.JOptionPane;

public class CandyCrush {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "DISCLAIMER: This will probably insult you.");
		String hatred = JOptionPane.showInputDialog("Who do you hate so much you would blow up their face?");
		speak("You totally have a crush on " + hatred);
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + hatred + "!");
		String freunden = JOptionPane.showInputDialog("Who is your best friend?");
		speak("Your friend " + freunden + " is evil!");
		JOptionPane.showMessageDialog(null, freunden + " is evil!");
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
