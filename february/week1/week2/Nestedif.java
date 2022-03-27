package assignment_feb23;
import java.util.Scanner; 

public class Nestedif {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre the number ");
		int n1 = sc.nextInt();
		 if ( n1 > 10)
		 {
			 System.out.println("number is greater than 10 so invald input");
			 
		 }
		 else if (n1%2==0 )
		 {
			 System.out.println("number is even");
		 }
		 else
		 {
			 System.out.println("number is odd");
		 }
		 

	}
}



