package Day3;
import java.net.URI;
import javax.swing.JOptionPane;
public class CrazyCatLady {
	public static void main(String[] args) {
		String schisse = "https://www.youtube.com/watch?v=MLhesmKn4Cs";
		String shockinglyAnnoyingCatVideo = "https://www.youtube.com/watch?v=uDT_oHZ1nEU";
		String insanelyBoringFrogVideo = "https://www.youtube.com/watch?v=umAyl9q9Gwg";
		String cats = JOptionPane.showInputDialog("How many cats do you have? (Please enter in a numerical form.)");
		int catnip = Integer.parseInt(cats);
		if(catnip > 2){
			JOptionPane.showMessageDialog(null, "You are a crazy cat lady. However, you probably won't be as crazy as this lady!(If you are, please go see a doctor immeadietly!");
			playVideo(schisse);
		}
		if(catnip < 3 && catnip!= 0){
			JOptionPane.showMessageDialog(null, "Here is an international cat video.");
			playVideo(shockinglyAnnoyingCatVideo);
		}
		if(catnip == 0){
			JOptionPane.showMessageDialog(null, "Cats are evil. Here is an annoying video of a frog. Enjoy.");
			playVideo(insanelyBoringFrogVideo);
		}

		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		
	}
	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//This program confirms your worst fears - that you are a crazy cat lady.
}



