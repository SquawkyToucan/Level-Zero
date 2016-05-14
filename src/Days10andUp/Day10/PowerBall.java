package Days10andUp.Day10;
import java.util.Random;

public class PowerBall {
public static void main(String[] args){
	for (int i = 0; i < 5; i++) {
		int random = new Random().nextInt(100);
		System.out.print(random + " ");
	}
	int powerball = new Random().nextInt(100);
	System.out.println("Your Powerball is " + powerball);
	System.out.println("You win all of Donald Trump's money");
}
}
