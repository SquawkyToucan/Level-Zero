package Day5;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class TurtleColorChooser {
	public static void main(String[] args) {
		Tortoise.show();
		Tortoise.setSpeed(10);
		Tortoise.setX(125);
		Tortoise.setY(125);
		for (int i = 0; true; i++) {
			String color = JOptionPane.showInputDialog("What color would you like to draw?");
			if (color.equalsIgnoreCase("red")) {
				Tortoise.setPenColor(Color.red);
			} else if (color.equalsIgnoreCase("orange")) {
				Tortoise.setPenColor(Color.orange);
			} else if (color.equalsIgnoreCase("yellow")) {
				Tortoise.setPenColor(Color.yellow);
			} else if (color.equalsIgnoreCase("green")) {
				Tortoise.setPenColor(new Color(034, 170, 102));
			} else if (color.equalsIgnoreCase("blue")) {
				Tortoise.setPenColor(Color.blue);
			} else if (color.equalsIgnoreCase("cyan")) {
				Tortoise.setPenColor(Color.cyan);
			} else if (color.equalsIgnoreCase("purple") || color.equalsIgnoreCase("magenta")) {
				Tortoise.setPenColor(Color.magenta);
			} else if (color.equalsIgnoreCase("black")) {
				Tortoise.setPenColor(Color.black);
			} else if (color.equalsIgnoreCase("gray")) {
				Tortoise.setPenColor(Color.gray);
			} else if (color.equalsIgnoreCase("dark gray")) {
				Tortoise.setPenColor(Color.darkGray);
			} else if (color.equalsIgnoreCase("pink")) {
				Tortoise.setPenColor(Color.pink);
			} else {
				int red = ((int) Math.random() * 255);
				int green = ((int) Math.random() * 255);
				int blue = ((int) Math.random() * 255);
				Tortoise.setPenColor(new Color(red, green, blue));
			}
			for (int j = 0; j < 4; j++) {
				Tortoise.setPenWidth(10);
				Tortoise.move(100);
				Tortoise.turn(90);
			}
			Tortoise.turn(45);
			Tortoise.move(50);
		}
	}
}
