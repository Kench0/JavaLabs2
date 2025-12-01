package project1;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number: ");
		int number = in.nextInt();
		
		if (number % 5 == 2 && number % 7 == 1) {
			System.out.println("Correct number");
		}
		else {
			System.out.println("Incorrect number");
		}
		
		in.close();
	}

}
