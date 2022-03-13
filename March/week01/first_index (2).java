package assignment_mar03;
import java.util.Scanner; 

public class first_index {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int num[] = {1 , 2 , 4 , 8 , 9};
		 boolean isfound = false;
		 System.out.println("entre the number ");
		 int d = sc.nextInt();
		 int count = 0;
		 for(int i = 0 ; i<num.length ; i++) {
			 if(num[i]==d)
			 {
				 isfound = true ;
				 count=i;
				 break;
			 }
		 }
			  if (isfound == true )
			  {
				  System.out.println("the index position is"+(count+1));
				  
			  }
			  else 
			  {
				  System.out.println("not found");
			  }
		 }

	}


