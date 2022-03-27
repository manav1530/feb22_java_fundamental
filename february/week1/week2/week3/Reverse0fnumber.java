package assignment_mar01;
import java.util.Scanner;

public class Reverse0fnumber {
	public static int reverse(int a)
	{ 
		 
		int sum = 0;
		while(a>0)
		{
			int digit = a%10;
			sum = sum *10+digit;
			a = a/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 System.out.println("entre the number");
		 int n1 = sc.nextInt();
		 int n2 = reverse(n1);
		 System.out.println(n2);
	}

}
