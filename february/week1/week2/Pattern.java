package assignment_feb25;
import java.util.Scanner;
 

public class Pattern {
	public static void main(String args[])
			{
		Scanner sc = new Scanner(System.in);
			  int n = sc.nextInt();
			  for (int i = 1 ; i<=n ; i++)
			  {
				  for (int j = 1 ; j<=i ; j++)
				  {
					  System.out.print("*");
				  }
				  System.out.println();
			  }

			  for ( int i = 1; i<=n ; i++ )
			  {
				  for (int j = n-1 ; j>=i ; j--) 
				  {
					  System.out.print("*");
					  
				  }
				  System.out.println();
			  }
			  
			}
}
			   
			   