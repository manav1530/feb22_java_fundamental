package assignment_mar02;
import java.util.Scanner;

public class Sum_of_Arry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1[] = new int[10];
		int n2 [] = new int [10];
		int n3[] = new int[n1.length];
		for(int i = 0 ; i<n1.length ; i++)
		{
			System.out.print("entre the 1st arrary");
			 
			n1[i]=sc.nextInt();
		}
		for (int i = 0 ; i<n1.length ; i++)
		{
			System.out.print("entre the 2nd arrary");
			 n2[i] = sc.nextInt();

			
		}
		for(int i = 0 ; i<n1.length;i++)
		{
			n3[i] = n1[i] + n2[i];
			System.out.println(n3[i]);
		}

			
	}

}
