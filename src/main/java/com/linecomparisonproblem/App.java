package com.linecomparisonproblem;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem");
		Line line1 = new Line(2.0, 3.0, 4.0, 7.0);
		Line line2 = new Line(2.0, 3.0, 4.0, 6.0);
		double lengthOfLine = line1.calculateLength();
		System.out.printf("Length of line is %.2f\n", lengthOfLine);
		if(line1.equals(line2)) 
			System.out.println("Both lengths are equal");
		else
			System.out.println("Both lengths are not equal");
		switch(line1.compareTo(line2)) {
			case 0 :
				System.out.println("Line1 and Line2 both are same");
				break;
			case 1 :
				System.out.println("Line1 is greater than Line2");
				break;
			default :
				System.out.println("Line 2 is greater than Line1");
		}
	}
	
}
