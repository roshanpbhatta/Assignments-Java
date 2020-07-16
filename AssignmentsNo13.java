package company.Assignments;

import java.util.Scanner;

public class AssignmentsNo13 {

	public static void main(String[] args) {
		
		// print only -ve number
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Input the number : ");
		int number = myScanner.nextInt();
		
		if (number < 0)
			System.out.println("the number is " + number);
		else
			System.out.println(" wrong input. try again");
		
		myScanner.close();

	}

}
