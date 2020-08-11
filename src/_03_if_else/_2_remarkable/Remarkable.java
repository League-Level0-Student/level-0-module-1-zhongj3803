package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.

String bob = "Has a very big brain";
String joe = "Is a very good programmer";
String billy = "Is a very good basketball player";

		// 2. Ask the user to enter a name. Store their answer in a variable.
String answer = JOptionPane.showInputDialog("Please enter a name.");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (answer .equals("bob")) {
JOptionPane.showMessageDialog(null, bob);
	}
if (answer .equals("joe")) {
	JOptionPane.showMessageDialog(null, joe);
}
if (answer .equals("billy")) {
	JOptionPane.showMessageDialog(null, billy);
}
}
}
