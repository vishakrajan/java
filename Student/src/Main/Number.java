package Main;

import java.util.Scanner;

public class Number {
	 public static void main(String[] args) {
	//Write a java program to input a number and 
	//print whether the number is even or odd
	Scanner reader = new Scanner(System.in);
	System.out.println("Enter the number :");
	double n = reader.nextDouble();
	if (n%2==0) {
		System.out.println("The number is Even");
	}
	else {
		System.out.println("The Number is Odd");
	}

}
}