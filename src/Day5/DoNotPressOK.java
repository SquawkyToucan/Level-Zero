package Day5;

import javax.swing.JOptionPane;

public class DoNotPressOK {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Do not press OK.");
		JOptionPane.showMessageDialog(null, "I said to not press it!");
		for (int i = 0; true; i++) {
			JOptionPane.showMessageDialog(null, "Do not press OK.");
			System.out.println(i);
		}
	}
}