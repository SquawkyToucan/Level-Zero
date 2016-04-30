package PretzelsAndOtherStuff;

public class Pretzels {
public static void main(String[] args){
	for (int i = 0; true; i++) {
		speak("We want pretzels.");
		speak("We want tootsie rolls.");
		System.out.println(i);
		//speak("Pretzels are good for your health.");
		//speak("They are a great source of grains, carbohydrates and yumminess.");
		//for (int j = 0; j < 4; j++) {
			//speak("We want pretzels.");
		//}
	}
}
static void speak(String string) {
	try {
		Runtime.getRuntime().exec("say " + string).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
