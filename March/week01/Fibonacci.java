package assignment_mar01;
import java.util.Scanner;

public class Fibonacci {
	public static void  fibo(int a )
	{
		int n1 = 0;
		int n2 =1 ; 
		int n3 ; 
		System.out.print(n1+" "+n2);
		for(int i=2;i<a;i++)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3; 
		 }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre the number");
		int num1 = sc.nextInt();
		 fibo(num1);
		
		 

	}

}
