package Days10andUp.Day10;
import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args){
	String politics = JOptionPane.showInputDialog("How old are you?");
	int votingForTrumpIsIllegal = Integer.parseInt(politics);
	if(votingForTrumpIsIllegal > 17){
		String voteForTrumpandGetKickedOutOfUSHopefully = JOptionPane.showInputDialog(null, "Who are you voting for?");
		if(voteForTrumpandGetKickedOutOfUSHopefully.equalsIgnoreCase("Donald Trump")||voteForTrumpandGetKickedOutOfUSHopefully.equalsIgnoreCase("Trump")){
			JOptionPane.showMessageDialog(null, "Please go visit a mental health facility immeadietly or else the world will be in grave jeoprady.");
			System.exit(0);
		}
		else{
			if(voteForTrumpandGetKickedOutOfUSHopefully.equalsIgnoreCase("Hillary Clinton")){
				JOptionPane.showMessageDialog(null, "Why would you ever vote for her?");
				System.exit(0);
			}
			else{
				if(voteForTrumpandGetKickedOutOfUSHopefully.equalsIgnoreCase("Bernie Sanders")){
					JOptionPane.showMessageDialog(null, "Rather than making America Socialist, move to a Socialist Country.");
					System.exit(0);
				}
				else{
					JOptionPane.showMessageDialog(null, voteForTrumpandGetKickedOutOfUSHopefully + " will become the next president!");
					System.exit(0);
				}
			}
		}
	}
	else{
		JOptionPane.showMessageDialog(null, "You're not allowed to vote, but I'll allow you to vote if you don't vote for Trump!");
	}
}
}