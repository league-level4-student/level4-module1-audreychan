package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Relaxation");
			break;
		case "Monday":
			System.out.println("Infinity War begins");
			break;
		case "Tuesday":
			System.out.println("First My Chemical Romance Album");
			break;
		case "Wednesday":
			System.out.println("Mid week");
			break;
		case "Thursday":
			System.out.println("Thanksgiving");
			break;
		case "Friday":
			System.out.println("Start of 2020");
			break;
		case "Saturday":
			System.out.println("My Birth");
			break;
		default:
			System.out.println("8th day of the week");
			break;
		}
	}
}
