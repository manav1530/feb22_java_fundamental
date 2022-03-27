package assignment_mar02;
import java.util.Scanner; 

public class Finding_array {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		int n1[] = new int[3];
		int n = n1.length;
		for (int i = 0 ; i<n ; i++)
		{
			System.out.println("entre the numbers");
			n1[i] = sc.nextInt();
		}
		
		 for (int i = 0 ; i<n ; i++)
		 { 
			 int n2 = n1.length/2;
			 System.out.println(n2);
			
			 
			 
		 } */
		 
			 
			 
			
			
		
		 
		/*int arr[] = {10, 11, 12, 13, 15, 18, 20 , 89};
	    int num = (arr.length) / 2;
	    if (num % 2 == 0) {
	        for (int i = (num - 1); i <= num; i++) {
	            System.out.println(arr[i]);
	        }
	    } else {

	        System.out.println(arr[num]);

	    }*/
		Scanner sc = new Scanner(System.in);

		char[] mid = new char[10];

		for (char i = 0; i < 10; i++) {
			System.out.println("Enter elements ::");
			mid[i] = sc.next().charAt(0);

		}
		for (int i = 0; i < 10; i++) {
			System.out.print(mid[i] + " ");
		}
		int m = mid.length / 2;
		System.out.println();
		System.out.println("Middle Element is :" + mid[m]);
	}
}



