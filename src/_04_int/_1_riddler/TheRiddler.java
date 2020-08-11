package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1 = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle1 .equals ("stamp")) {
	score++;
}

		// 5. Otherwise, say "wrong" and tell them the answer
	else {
		JOptionPane.showMessageDialog(null, "Wrong, the correct answer is a stamp");
	}
		// 6. Add some more riddles
String riddle2 = JOptionPane.showInputDialog("What tastes better than it smells?");
if (riddle2 .equals ("tongue")) {
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is a tongue");
}

String riddle3 = JOptionPane.showInputDialog("What has a bottom at the top?");
if (riddle3 .equals ("legs")) {
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong, the correct answer is legs");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is "+score);
	}
}

