package Day6;

import javax.swing.JOptionPane;

public class MorningBrown {
public static void main(String[] args){
	String day = JOptionPane.showInputDialog("What day of the week is it?");
	if(day.equalsIgnoreCase("Monday")&&)
}
static void NoSchoolNothingInMorning() {
		speak("Lay in bed until Ian wakes you up.");
		JOptionPane.showMessageDialog(null, "Lay in bed until Ian wakes you up.");
		speak("Yell at him, then go back to sleep. Stay in underwear.");
		JOptionPane.showMessageDialog(null, "Yell at him and then go back to sleep.");
		speak("Wake back up at Nine O'Clock.");
		JOptionPane.showMessageDialog(null, "Wake up at nine in the morning.");
		speak("Go to the computer and tell Ian that we can do screen time.");
		JOptionPane.showMessageDialog(null, "Do your screen time.");
		speak("Brush your teeth.");
		JOptionPane.showMessageDialog(null, "Brush your teeth.");
		speak("Eat Cheerios.");
		JOptionPane.showMessageDialog(null, "Eat Cheerios.");
	}
static void NoSchoolStuffInMorning() {
		speak("Lay in bed until Ian wakes you up.");
		JOptionPane.showMessageDialog(null, "Lay in bed until Ian wakes you up.");
		speak("Change into the clothes for what is appropriate for where you are going.");
		JOptionPane.showMessageDialog(null, "Change into the clothes for what is appropriate for where you are going.");
		speak("Brush teeth and eat cereal for breakfast.");
		JOptionPane.showMessageDialog(null, "Brush teeth and eat cereal for breakfast.");
		speak("Leave for what is happening.");
		JOptionPane.showMessageDialog(null, "Leave for what is happening.");
	}
static void School(){
	speak("Lay in bed until Ian wakes you up.");
	JOptionPane.showMessageDialog(null, "Lay in bed until Ian wakes you up.");
	speak("Change but don't put on socks.");
	JOptionPane.showMessageDialog(null, "Change but don't put on socks.");
	speak("Run around and eat breakfast.");
	JOptionPane.showMessageDialog(null, "Run around and eat breakfast.");
	speak("Go upstairs and put on socks. Put the binder in your backpack.");
	JOptionPane.showMessageDialog(null, "Go upstairs and put on socks. Put a binder in your backpack.");
	speak("Leave.");
	JOptionPane.showMessageDialog(null, "Leave.");
}
static void Sick(){
	speak("Wake up and say you are sick.");
	JOptionPane.showMessageDialog(null, "Go back to bed!");
}

	static void speak(String string) {
		try {
			Runtime.getRuntime().exec("say " + string).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
