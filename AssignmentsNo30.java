package vastika.Assignments30_40;

public class AssignmentsNo30 {

	public static void main(String[] args) {
		// program to print the Fibonacci series. 1 1 2 3 5 8 ….
		int first = 1;
		int second = 1;
		System.out.println(" "+ first+ " "+ second);
		
		for (int i=0 ; i<10 ; i++) {
			int third = first + second;
			
			first = second;
			second = third;
			
			System.out.println(" "+ third);
		} 
			
	}

}
