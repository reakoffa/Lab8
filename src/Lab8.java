import java.util.Scanner;

// Anthony Reakoff Lab 8 on 5/1/18

public class Lab8 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String ans = "y";
		String[] names = {"Anthony","Joe","Chris","Bill","Janet"};
		String[][] know = {{"Westland","Steak"},{"Canton","Olives"},{"Miami","Fish"},{"New York","Sauerkraut"},{"Canada","Broccoli"}};	
		
		System.out.print("Welcome to Java! ");
		
		do {
			int stu = Validator.getInt(scnr,
					"What student would you like to learn about? (enter number 1-5)", 1, 5);
			System.out.println("That student is " + names[stu - 1] + ". What would you like to know about "
					+ names[stu - 1] + "? (enter 'hometown' or 'favorite food')");
			String info = Validator.getString(scnr, " ");
			
			if (info.equalsIgnoreCase("hometown")) {
				System.out.println(names[stu - 1] + " is from " + know[stu - 1][0]);
			} else if (info.equalsIgnoreCase("favorite food")) {
				System.out.println(names[stu - 1] + "'s favorite food is " + know[stu - 1][1]);
			} else {
				System.out.println("That data does not exist.");
			} ans = Validator.getString(scnr, "Continue? y/n");
		} while (ans.equalsIgnoreCase("y"));
		System.out.println("Have a nice day!");
	}

}
