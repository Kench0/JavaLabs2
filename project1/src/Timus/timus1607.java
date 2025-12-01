package Timus;

import java.util.Scanner;

public class timus1607 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		while (a < c) {
			a += b;
			c -= d;
		}

		System.out.print(a);
		in.close();
	}
	
}
