package com.linecomparisonproblem;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem");
		Length length = new Length(2.0, 3.0, 4.0, 5.0);
		double lengthOfLine = length.calculateLength();
		System.out.printf("Length of line is %.2f", lengthOfLine);
	}
	
}
