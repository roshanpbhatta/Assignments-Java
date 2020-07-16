package Com.Assignments;

import java.util.Scanner;

public class AssignmentNo3 {

	public static void main(String[] args) {
		// 3.	Write a program to find sum and average of two numbers input by User (using Scanner class).

		Scanner objScan = new Scanner(System.in);
		System.out.println("Input number A:");
		int a = objScan.nextInt();
		
		System.out.println("Input number B:");
		int b = objScan.nextInt();
		
		int sum = a + b ;
		System.out.println("sum of "+a +" and " +b + " = " +sum);
		
		float average = sum / 2;
		System.out.println("Average of "+ a +" and " +b +" is "+ average);
		
		objScan.close();
		
	}

}
