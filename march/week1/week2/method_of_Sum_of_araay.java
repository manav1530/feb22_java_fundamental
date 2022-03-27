package assignment_mar03;

public class method_of_Sum_of_araay {
	public static int sum(int a , int b)
	{
		int c = a+b;
		return c;
	}


public static void main(String args[])
{
	int n1[]= {1 , 2 , 4, 5 };
	int n2[] = { 2 , 5 , 7 , 9};
	int n3[] = new int[n1.length];
	for(int i = 0 ; i<n1.length ; i++)
	{
		n3[i] = sum(n1[i],n2[i]);
		System.out.println(n3[i]);
	}
	
}
	
}
