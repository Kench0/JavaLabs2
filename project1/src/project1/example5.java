package project1;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number");
		long number = in.nextLong();
		
		if (number < 1000) {
			System.out.println("Incorrect number");
		}
		else {
			int result = (int) ((number / 1000) % 10);
			System.out.println("Corrnect number :" + result);
		}
		
		in.close();
	}

}
