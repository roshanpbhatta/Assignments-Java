package company.Assignments;

import java.util.Scanner;

public class AssignmentNo17 {

	public static void main(String[] args) {
		// 17.	Write a program to calculate leap year.
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the year to check for leap year");
		int myYear = myScanner.nextInt();
		
		myScanner.close();
		if (myYear%100 ==0) {
			if (myYear%400==0) {
				if (myYear%4==0) {
					System.out.println("The year is leap year :"+myYear);
				}
				else 
					System.out.println("Not A leap year: "+myYear);
			}
		}
	}

}
