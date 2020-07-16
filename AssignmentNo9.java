package Com.Assignments;

import java.util.Scanner;

public class AssignmentNo9 {

	public static void main(String[] args) {
		// 1 pound is 0.454 kg
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("enter the pound to be converted into kg");
		float mass_pound = myScanner.nextFloat();
		
		float mass_kg = (float) (mass_pound * 0.454) ; 
		System.out.println(mass_pound + " pound = "+mass_kg+" kg");
		myScanner.close();

	}

}
