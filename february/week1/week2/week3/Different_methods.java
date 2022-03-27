package assignment_feb28;
import java.util.Scanner;

public class Different_methods {
	public static  int  Multiply(int a , int b)
	{
		int c = a *b ;
		 return c; 
	}
	public static float  mUltiply(float a , float b)
	{
		float c = a*b;
		 return c; 
		
	}
	public static long muLtiply(long r , long i)
	{
		long o = r*i;
		return o; 
	}
	 
	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("entre two numbers");
		 int n1 =sc.nextInt();
		 int n2 = sc.nextInt();
		 int n3 = Multiply(n1 , n2);
		 System.out.println(n3);
		 {
			 System.out.println("entre two numbers");
		 float a = sc.nextFloat();
		 float b =sc.nextFloat();
		 float c = mUltiply(a , b);
		 System.out.println(c);
		 }
		 {
			 System.out.println("entre two numbers");
		 long n4 = sc.nextLong();
		 long n5 = sc.nextLong();
		 long n6 = muLtiply(n4 , n5);
		 System.out.println(n6);
		 }
		 
	}

}
