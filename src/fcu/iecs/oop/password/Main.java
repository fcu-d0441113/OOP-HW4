package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String result;
		Scanner input = new Scanner(System.in);
		PasswordEncorder Passen = new PasswordEncorder();
		while (true) {
			System.out.printf("Please enter a password:");
			result = input.nextLine();
			if (result.equalsIgnoreCase("exit"))
				break;
			else {
				result = Passen.encode(result);
				System.out.println(result);
			}
		}
		input.close();
	}

}
