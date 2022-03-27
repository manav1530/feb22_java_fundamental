package assignment_feb28;
import java.util.Scanner ;
public class Calculator {
	 public static int add(int a , int b)
	 {
		 int c = a + b;
		  return c; 
	 }
	 public static  int diff(int a , int b)
	 {
		 int c = a -b;
		 return c;
	 }
	 public static  int  multiply(int a , int b)
	 { 
		 int c = a*b;
		  return c ; 
	 }
	 public static  int divide(int a , int b)
	 {
		 int c = a/b;
		 return c ; 
	 }
	 public static int mod(int a , int b)
	 {
		 int c = a%b;
		 return c ; 
	 }
	 public static int avg(int a , int b)
	 {
		 int sum = add(a,b);
		  int avg = sum/2;
		  return avg;
		 
		 
	 }

	public static void main(String[] args) {
		char ch = 'n';
		do
		{
		Scanner sc = new Scanner (System.in);
		System.out.println("1.add , 2.minus , 3.multiply , 4.divide , 5.mod , 6.avg ");
		int choice = sc.nextInt();
		if(choice>=1 && choice<=6)
		{
			System.out.println("first number");
			int n1 = sc.nextInt();
			System.out.println("second number");
			int n2 = sc.nextInt();
			switch(choice)
			{
				case 1 :
					int result= add(n1 , n2);
					System.out.println(result);
					break;
				case 2 : 
					int result1 = diff(n1 , n2);
					System.out.println(result1);
					break;
				case 3 :
					int result2 = multiply(n1 , n2);
					System.out.println(result2);
					break;
				case 4 : 
					int result3 = divide(n1 , n2);
					System.out.println(result3);
					break;
				case 5 :
					int result4 = mod(n1 , n2);
					System.out.println(result4);
					break;
				case 6 : 
					int result5 = avg(n1 , n2);
					System.out.println(result5);
					break;
					}
		}
			else 
			{
				System.out.println("invalid value");
			}
		System.out.println("do you want to continue Y/N" +ch);
		
	 ch = sc.next().charAt(0);
		}
		while(ch=='y' || ch == 'Y');
		
		
		
			
		}
		 

	}
