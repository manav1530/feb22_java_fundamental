package assignment_mar03;
import java.util.Scanner; 

public class Last_index {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n1[]= {10 , 20 , 30 , 40 , 50};
		 System.out.println("entre the last index");
		 int d  = sc.nextInt();
		 int count = 0; 
		 boolean isfound = false  ;
		 for (int i = 0 ; i<=n1.length ; i++ )
		 {
			 if(n1[i] ==d)
			 {
				 isfound = true ;
				 count = i;
				 break;
			 }
		 }
		 if (isfound == true )
		 {
			 System.out.println("the last index is "+(count+1));
		 }
		 else 
		 {
			 System.out.println("not found ");
		 }

	}

}
