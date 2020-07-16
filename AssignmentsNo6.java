package Com.Assignments;

import java.util.Scanner;

public class AssignmentsNo6 {

	public static void main(String[] args) {
		// find the perimeter of a circle, triangle, and rectangle
		final double PI = 3.14;
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Input the radius of circle");
		float r = myScanner.nextFloat();
		System.out.println ("The perimetervor circumference of circle:" +(2*PI*r));
		
		System.out.println("Input three sides of the triangle");
		float a = myScanner.nextFloat();
		float b = myScanner.nextFloat();
		float c = myScanner.nextFloat();
		System.out.println("The perimeter of triangle :"+(a+b+c));
		
		System.out.println("Input the length and breadthof rectangle:");
		float length=myScanner.nextFloat();
		float breadth=myScanner.nextFloat();
		System.out.println("The perimeter of rectangle:"+(2*length+2*breadth));
		
		myScanner.close();
		
	}

}
