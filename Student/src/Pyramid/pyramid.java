package Pyramid;

import java.util.Scanner;

public class pyramid{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter height of the pyramid :");
		double h = reader.nextDouble();
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}