package company.Assignments;

import java.util.Scanner;

public class AssignmentsNo11 {

	public static void main(String[] args) {
		// swap two number
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Input two numbers:");
		float a= myScanner.nextFloat();
		float b= myScanner.nextFloat();
		System.out.println("The 2 number before swapping: a = "+a +" and b = "+ b);
		
		float temp = a ;
		a = b;
		b= temp;
		
		System.out.println("The 2 number after swapping: a = "+a +" and b= "+ b);
		myScanner.close();
		
	}

}
