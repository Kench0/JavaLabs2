package Timus; 

import java.util.Scanner;

public class timus1991 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		
		long unusedBumBum = 0;
		long survDroids = 0;
		
		for (int i = 0; i < n; i++) {
			int BumBum = in.nextInt();
			
			if (BumBum > k) {
				unusedBumBum -= k;
				unusedBumBum += BumBum;
			}
			else {
				survDroids += (k - BumBum);
			}
		}
		
		System.out.println(unusedBumBum + " " + survDroids);
		
		in.close();
								
	}

}