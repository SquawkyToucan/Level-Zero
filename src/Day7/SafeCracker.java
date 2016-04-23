package Day7;

import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class SafeCracker {

	public static void main(String[] args) {
		for(int i = 0; true; i++){
		tryCode(i);
		}
	}

	static void tryCode(int guess) {
		System.out.println("trying " + guess);

		int secretCode = 201761 - wekncrzpasfdkjhcfjse;

		if (guess == secretCode) {
			JOptionPane.showMessageDialog(null, "Congratulations! You cracked the safe with " + guess);
			playTheSoundOfSuccess();
			System.exit(0);
		}
	}

	private static void playTheSoundOfSuccess() {
		AudioClip sound;
		try {
			sound = JApplet.newAudioClip(new File("/Users/League/Google Drive/league-sounds/me-gusta.wav").toURI().toURL());
			sound.play();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	final static int wekncrzpasfdkjhcfjse = new Random().nextInt(100);
}

