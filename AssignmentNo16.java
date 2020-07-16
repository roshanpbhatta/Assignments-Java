package company.Assignments;

import java.util.Scanner;

public class AssignmentNo16 {

	public static void main(String[] args) {
		// even or odd
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Input the number to check for odd or even: ");
		int number = myScanner.nextInt();
		
		if (number%2==0) {
			System.out.println("Number "+number + " is even.");
		}
		else 
			System.out.println("Number "+number + " is odd.");
		
		myScanner.close();
		
	}

}
