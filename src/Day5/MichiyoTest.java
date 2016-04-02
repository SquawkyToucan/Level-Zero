package Day5;

import javax.swing.JOptionPane;

public class MichiyoTest {
	public static void main(String[] args) {
		String momsBirthday = "January 27th";
		String dadsBirthday = "December 20th";
		String myBirthday = "November 9th";
		String laIcksBirthday = "November 13th";
		String helliCasBirthday = "September 10th";
		String dahPerson = JOptionPane.showInputDialog("Whose birthday would you like to know?* \n\n*Please note that this information may or may not be correct.");
		System.out.println(dahPerson);
		if (dahPerson.equalsIgnoreCase("Mom")) {
			speak("Mom's birthday is on January twenty seventh.");
			JOptionPane.showMessageDialog(null, "Mom's birthday is January 27th.");
			System.out.println(momsBirthday);
		}
		if (dahPerson.equalsIgnoreCase("Dad")) {
			speak("Dad's birthday is on December twentieth.");
			JOptionPane.showMessageDialog(null, "Dad's birthday is December 20th.");
			System.out.println(dadsBirthday);
		}
		if (dahPerson.equalsIgnoreCase("Me")) {
			speak("The most wonderful day of the year is November 9th.");
			JOptionPane.showMessageDialog(null, "You already know.");
			System.out.println(myBirthday);
		}
		if (dahPerson.equalsIgnoreCase("Ian")) {
			speak("La Icky's birthday is on November thirteenth.");
			JOptionPane.showMessageDialog(null, "Ian's birthday is November 13th.");
			System.out.println(laIcksBirthday);
		}
		if (dahPerson.equalsIgnoreCase("Lila")) {
			speak("Lila's birthday is on September 10th.");
			JOptionPane.showMessageDialog(null, "Lila's birthday is on September Tenth.");
			System.out.println(helliCasBirthday);
		}
		if (!dahPerson.equalsIgnoreCase("Dad") && !dahPerson.equalsIgnoreCase("Me") && !dahPerson.equalsIgnoreCase("Lila") && !dahPerson.equalsIgnoreCase("Ian")) {
			speak("I don't know!");
			JOptionPane.showMessageDialog(null, "I don't know.");
			speak("Maybe you should ask Google.");
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
