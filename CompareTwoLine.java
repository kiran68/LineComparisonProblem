package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;

public class CompareTwoLine {

	public static double lengthone;
	public static double lengthtwo;

	public static void comparingTwoLines() {

		System.out.println("  Welcome to Line Comparison Computation Program! ");

		Scanner input = new Scanner(System.in);

		// Co-ordinates of Line1 are:
		System.out.println("Enter the co-ordinates of Line 1 (x1,y1) :");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter the co-ordinates of Line 1 (x2,y2) :");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		// Co-ordinates of Line2 are:
		System.out.println("Enter the endpoints of Line 2 (u1,v1 ) :");
		double u1 = input.nextDouble();
		double v1 = input.nextDouble();

		System.out.println("Enter the co-ordinates of Line 1 (u2,v2) :");
		double u2 = input.nextDouble();
		double v2 = input.nextDouble();

		// To calculate lengths of two lines:
		lengthone = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		lengthtwo = Math.sqrt((u2 - u1) * (u2 - u1) + (v2 - v1) * (v2 - 11));

		// Converting double to String
		String stringone = Double.toString(lengthone);
		String stringtwo = Double.toString(lengthtwo);

		// Now by comparing Line1 and Line2, we get:

		if (stringone.compareTo(stringtwo) < 0) {
			System.out.println("Line1 is less than Line2");
		} else if (stringone.compareTo(stringtwo) > 0) {
			System.out.println("Line1 is greater than Line2");
		} else {
			System.out.println("Line1 is equal to Line2");
		}

		input.close();

	}

	public static void main(String[] args) {
		comparingTwoLines();
	}
}
