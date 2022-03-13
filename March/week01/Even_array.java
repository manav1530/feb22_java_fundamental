package assignment_mar02;
import java.util.Scanner;

public class Even_array {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int[10];
		int count =0;
		for(int i = 0 ; i<n.length ; i++)
		{
			System.out.print("entre the number");
			n[i] = sc.nextInt();
		}
		for (int i = 0; i<n.length ; i++)
		if(n[i]%2==0)
		{
			System.out.println(n[i]);
			 
			
		}
		 
	}

}
