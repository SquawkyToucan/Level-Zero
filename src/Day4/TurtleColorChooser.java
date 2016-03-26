package Day4;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TurtleColorChooser {
	public static void main(String[] args) {
	Tortoise Tortoise = new Tortoise();
	String color = JOptionPane.showInputDialog("What color would you like to draw?");
	//if(color)
	//5. if the user doesn’t enter anything, choose a random color

	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
	Tortoise.setPenWidth(10);
	for (int i = 0; i < args.length; i++) {
		Tortoise.move(4);
		Tortoise.turn(90);
	}
	}
}

