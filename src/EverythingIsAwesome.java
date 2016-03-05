import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What do you think is awesome?");
		String singleplural = JOptionPane.showInputDialog("Was it a plural or a singular noun? \n(p for plural, s for singular)");
		if (singleplural.equalsIgnoreCase("p")) {
			JOptionPane.showMessageDialog(null, "You think " + answer + " is AWESOME!!!!!!");
		}
		if (singleplural.equalsIgnoreCase("s")) {
			JOptionPane.showMessageDialog(null, "You think " + answer + " is AWESOME!!!!");
		}
	}
}
