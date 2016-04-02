package Day5;

import javax.swing.JOptionPane;

public class AprilFools {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Your computer has been infected with the Saturn-X Virus.");
		JOptionPane.showMessageDialog(null, "April Fools!(Late!)");
		for (int i = 0; true; i++) {
			speak("April Fools");
			JOptionPane.showMessageDialog(null, "Saturn-X is making your computer glitchy.");
			System.out.println(i);
		}
	}

	static void speak(String string) {
		try {
			Runtime.getRuntime().exec("say " + string).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
