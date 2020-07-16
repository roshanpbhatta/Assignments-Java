package Com.Assignments;

import java.util.Scanner;

public class AssignmentsNo5 {

	public static void main(String[] args) {
		// a program to find the area of a circle, rectangle, and triangle.
		final double PI= 3.14;
		Scanner objScan5 = new Scanner(System.in);
		float r = objScan5.nextFloat();
		
		float circle_Area = (float) (PI * r*r);
		System.out.println("Area of Circle with radius r = "+r+" is "+circle_Area);
		
		System.out.println("Input the length and breadth of rectangle:");
		float length = objScan5.nextFloat(); 
		float breadth = objScan5.nextFloat();
		
		float rect_area =length*breadth ;
		System.out.println("Area of rectangle"+rect_area);
		
		System.out.println("Input the length of the square");
		float sqr_len = objScan5.nextFloat();
		
		float sqr_area = sqr_len*sqr_len;
		System.out.println("Area for the square "+sqr_area);
		
		objScan5.close();
	}

}
