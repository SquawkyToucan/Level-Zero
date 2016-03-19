package Day3;
import javax.swing.JOptionPane;
public class RiddleMeThis {
	public static void main(String[] args){
		int score = 0;
		String answer1 = JOptionPane.showInputDialog("What is it that's always coming but never arrives?");
		if(answer1.equalsIgnoreCase("Tommorow")){
			score++;
			JOptionPane.showMessageDialog(null, "That answer is correct.");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		else{
			JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer was 'tommorow.'");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		String answer2 = JOptionPane.showInputDialog("What word in the dictionary is spelled incorrectly?");
		if(answer2.equalsIgnoreCase("Incorrectly")){
			score++;
			JOptionPane.showMessageDialog(null, "That answer is correct.");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		else{
			JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer was 'incorrectly'");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		String answer3 = JOptionPane.showInputDialog("If you have me, you want to share me. If you share me, you haven't got me. What am I? (Answer like this: a postcard)");
		if(answer3.equalsIgnoreCase("A secret")){
			score++;
			JOptionPane.showMessageDialog(null, "That answer is correct.");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		else{
			JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer was 'a secret'");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		String answer4 = JOptionPane.showInputDialog("A man is pushing his car along the road when he comes to a hotel. He shouts, 'I'm bankrupt!' Why?");
		if(answer4.equalsIgnoreCase("He was playing Monopoly.")){
			score++;
			JOptionPane.showMessageDialog(null, "That answer is correct.");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		else{
			JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer was 'He was playing Monopoly.'");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		String answer5 = JOptionPane.showInputDialog("How many of each animal did Moses take into the Ark with him?");
		if(answer5.equalsIgnoreCase("None.")){
			score++;
			JOptionPane.showMessageDialog(null, "That answer is correct.");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
		else{
			JOptionPane.showMessageDialog(null, "That is incorrect. The correct answer was 'None.'(Noah made the Ark, not Moses.)");
			JOptionPane.showMessageDialog(null, "Score: " + score);
		}
	JOptionPane.showMessageDialog(null, "You scored " + score + "!");
}
	

}
