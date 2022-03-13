package assignment_feb28;
import java.util.Scanner;

public class Method_add {
 public static int add(int n1 , int n2)
 {
	 int n3 = n1 + n2 ;
	 return n3;
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("entre two numbers");
		int a  = sc.nextInt();
		int b = sc.nextInt();
		int c = add(a , b);
		System.out.println(c);
		 
	}

}
