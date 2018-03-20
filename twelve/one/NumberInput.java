package l.twelve.one;

import java.util.Scanner;

public class NumberInput {

	public static void main(String[] args) {
		try {
			getInput();
		} catch (ArithmeticException e) {
			System.out.println("Please input positive number");
		} catch (IllegalArgumentException e) {
			System.out.println("Please input a valid number");
		}
	}

	public static void getInput() {
		System.out.println("Please input a number:");
		Scanner sc = new Scanner(System.in);
		int input = (int) Integer.parseInt(sc.nextLine());
		
		if (input < 0) {
			sc.close();
			throw new ArithmeticException("Number is a negative");
		}
		
		sc.close();
		System.out.println(input);
	}
}
