package Day4;

import javax.swing.JOptionPane;

public class Blastoff {
	public static void main(String[] args){
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
			speak(i);
		}
		System.out.println("Blast off!");
		speak("Blast off!");
		double didItGo = Math.random();
		if(didItGo > 0.5){
			speak("Your rocket malfunctioned. Try again.");
			JOptionPane.showMessageDialog(null, "Your rocket blew up on its way up.");
		}
		else{
			speak("Sucess!");
			JOptionPane.showMessageDialog(null, "Sucess!");
		}
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	static void speak(int words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
//This program counts down from ten and then causes the computer to say "Blast off" in the most annoying voice possible.
