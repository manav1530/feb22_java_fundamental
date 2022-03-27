package assignment_feb23;
import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("entre the year ");
		 int year = sc.nextInt(); 
		 System.out.println("entre the branch ");
		 String branch = sc.next();
		 switch(year) {
		 case 1 :
			 System.out.println("all the subjects are same");
		 case 2:
			 System.out.println("one and two sbujects are same");
			 break;
		 case 3:
		 case 4:
			 System.out.println("All Subjects are differnt");
			 switch(branch)
			 {
			 case"IT":
			  case"CSE":
			     System.out.println("you have entred for computer branch");
			   break;
			  case "EE":
			  case "ECE":
				  System.out.println("you have opted for electrical branch ");
				  break;
			  case "ME":
			      System.out.println("you have entred for mechanical branch");
				 break;
			  case "CI":
			      System.out.println("you have opted for Civil branch");
			  break;
			  default:
				  System.out.println("you have entered the invalid branch");
				  break;
			 }
			 break;
			 default:
                 System.out.println("invalid input");
                 break;
			 
			 
		 }
		 
		 

	}

}
