package assignment_mar02;

import java.util.Scanner;

public class Mutliplying_factor {

	public static void main(String[] args) {
		 
			Scanner sc = new Scanner(System.in);
			int n[] =  new int[10];
			System.out.println("entre the number");
			int n1 = sc.nextInt();
			int sum = n1;
			
			for(int i = 0 ; i<n.length ;i++)
			{
				System.out.println("entre the  10 numbers");
				n[i]= sc.nextInt();
			}
			for(int i = 0 ; i<n.length ; i++)
			{
			 if(sum>0)
			 {
				
				 sum = n1*n[i];
				 System.out.println(sum);
				 
			 }
			 
			
			}

	}

}
