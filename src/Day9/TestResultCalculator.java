package Day9;

import javax.swing.JOptionPane;

public class TestResultCalculator {
public static void main(String[] args){
	String correct = JOptionPane.showInputDialog("How many questions correct?");
	double correctuse = Double.parseDouble(correct);
	String total = JOptionPane.showInputDialog("How many questions?");
	double totaluse = Double.parseDouble(total);
	double score = correctuse/totaluse * 100;
	System.out.println(score);
}
}
