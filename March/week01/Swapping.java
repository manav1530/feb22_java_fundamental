package assignment_mar01;
import java.util.Scanner;

public class Swapping {
	public static void Swap(int a , int b)
	{
		System.out.println("before Swapping "+a+" "+b);
		a = a+b;
		b=a-b;
		a=a-b;
		System.out.println("after Swapping "+a+" "+b);
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre 2 numbers");
		int n1 = sc.nextInt();
		int n2  = sc.nextInt();
		Swap(n1 , n2);
		  
	}

}
