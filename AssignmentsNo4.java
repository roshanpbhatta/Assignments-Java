package Com.Assignments;

import java.util.Scanner;

public class AssignmentsNo4 {

	public static void main(String[] args) {
		// Simple Interest = P*T*R/100
		
		Scanner myobj4 = new Scanner(System.in);
		
		System.out.println("Input the value of Principal amount in $");
		float P = myobj4.nextFloat();
		
		System.out.println("Input the value of time of interest in years");
		float T = myobj4.nextFloat();
		
		System.out.println("Rate of interest %");
		float R = myobj4.nextFloat();
		
		myobj4.close();
		
		float Simple_Interest = P*T*R/100;
		System.out.println("Simple interest for "+P+"$ for "+T+" years and Rate of interest "+R+" % is "+ Simple_Interest + " $");
		
	}

}
