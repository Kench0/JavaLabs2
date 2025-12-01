package project1;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int number = in.nextInt();
		
		if (number % 3 == 0) {
			System.out.println("The number is divisible by 3");
		}
		else {
			System.out.println("the number is not divisible by 3");
		}
		
		in.close();

	}

}
