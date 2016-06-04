package Day7;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Tortoise;
import java.awt.Color;

public class ObeidientTortoise {
public static void main(String[] args){
	for (int i = 0;true ; i++) {
	Tortoise.show();
	Tortoise.explode();
	Tortoise.penDown();
	Tortoise.setSpeed(10);
	String shape = JOptionPane.showInputDialog("What shape do you want the Tortoise to draw? (Choose from circle, triangle, or square.)");
	String color = JOptionPane.showInputDialog("What color do you wish for the Tortoise to draw?");
	if(color.equalsIgnoreCase("Red")){
		Tortoise.setPenColor(Color.red);
	}
	if(color.equalsIgnoreCase("Orange")){
		Tortoise.setPenColor(Color.orange);
	}
	if(color.equalsIgnoreCase("Yellow")){
		Tortoise.setPenColor(Color.yellow);
	}
	if(color.equalsIgnoreCase("Green")){
		Tortoise.setPenColor(new Color(034, 170, 102));
	}
	if(color.equalsIgnoreCase("Cyan")){
		Tortoise.setPenColor(Color.cyan);
	}
	if(color.equalsIgnoreCase("Blue")){
		Tortoise.setPenColor(Color.blue);
	}
	if(color.equalsIgnoreCase("Purple")||color.equalsIgnoreCase("Magenta")){
		Tortoise.setPenColor(Color.magenta);
	}
	
	if(shape.equalsIgnoreCase("Square")){
		drawSquare();
	}
	if(shape.equalsIgnoreCase("Triangle")){
		drawTriangle();
	}
	if(shape.equalsIgnoreCase("Circle")){
		drawCircle();
	}
	System.out.println(i);
	}
}
static void drawSquare(){
	Tortoise.penDown();
	for (int i = 0; i < 4; i++) {
	Tortoise.move(100);
	Tortoise.turn(90);
	}
}
static void drawTriangle(){
	Tortoise.penDown();
	for (int i = 0; i < 3; i++) {
		Tortoise.move(100);
		Tortoise.turn(120);
	}
}
static void drawCircle(){
	Tortoise.penDown();
	for (int i = 0; i < 360; i++) {
		Tortoise.move(1);
		Tortoise.turn(1);
	}
}
}
