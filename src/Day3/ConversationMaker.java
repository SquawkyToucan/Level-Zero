package Day3;

import javax.swing.JOptionPane;

public class ConversationMaker {
	public static void main(String[] args) {
		for (int i = 0;true; i++) {
			String talk = JOptionPane.showInputDialog("What do you want the computer to say?");
			speak(talk);
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
//This program tells you to talk into the computer and then annoys you to death. Enjoy!