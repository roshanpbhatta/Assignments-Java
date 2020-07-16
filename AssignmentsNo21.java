package vastika.assignments20_29;

import java.util.Scanner;

public class AssignmentsNo21 {

	public static void main(String[] args) {
		// 1-7 switch case day of week
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the day of week in number 1 2....7");
		int day = myScanner.nextInt();
		switch(day) {
		 
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2:
			 System.out.println("Tuesday");
			 break;
		 case 3:
			 System.out.println("Wednesday");
			 break;
		 case 4:
			 System.out.println("Thursday");
			 break;
		 case 5:
			 System.out.println("Friday");
			 break;
		 case 6:
			 System.out.println("Saturday");
			 break;
		 case 7:
				System.out.println("Sunday");
				break;
		 default:
			   System.out.println("Wrong number for input");
		}
		 System.out.println("Have a nice Day");
		myScanner.close();
		
		}

}
