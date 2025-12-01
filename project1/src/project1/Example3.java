package project1;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number: ");
		int number = in.nextInt();
		
		if (number >= 10 && number % 4 == 0) {
			System.out.println("correct number");
		}
		else {
			System.out.println("incorrect number");
		}
		
		in.close();

	}

}
