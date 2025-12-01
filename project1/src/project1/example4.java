package project1;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number: ");
		int number = in.nextInt();
		
		if (number >= 5 && number <= 10) {
			System.out.println("correct number");
		}
		else {
			System.out.println("Incorrect number");
		}
		
		in.close();
	}

}
