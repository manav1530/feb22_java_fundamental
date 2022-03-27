package assignment_feb28;
import java.util.Scanner;

public class Differnt_methods2 {
	public static void  method1(int a)
	{
		 int max = a;
		  System.out.println(max);
	}
	public static void  method2(int a , int b)
	{
		if(a>b  )
		{
			System.out.println(a);
		}
		else 
		{
			System.out.println(b);
		}
	}
	public static void  method3(int a , int b , int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>a && b>c) 
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();	 
		method1(n1);
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		method2(n3 ,n4);
		int n5 = sc.nextInt();
		int n6 = sc.nextInt();
		int n7 = sc.nextInt();
		method3(n5 , n6 , n7);
		  
	}

}
