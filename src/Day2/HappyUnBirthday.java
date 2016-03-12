package Day2;

import javax.swing.JOptionPane;

public class HappyUnBirthday {
	public static void main(String[] args) {
		String today = "03/12";
		String bday = JOptionPane.showInputDialog("When is your birthday? Enter in MM/DD form.");
		if (today.equalsIgnoreCase(bday)) {
			speak("Happy birthday to you!");
		} else {
			speak("Happy Un-Birthday to you!");
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
