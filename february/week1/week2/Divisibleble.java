package assignment_feb22;
import java.util.Scanner;

public class Divisibleble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1  = sc.nextInt();
		if ((n1%2==0) && (n1%8==0) && (n1%12!=0))
		{
			System.out.println("true");
		}
		 
		else
		{
			System.out.println("false");
		}

	}

}
