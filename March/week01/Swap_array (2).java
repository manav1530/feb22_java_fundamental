package assignment_mar03;

public class Swap_array {
	public static void swap(int a )
	{
		int A[] = {30 , 50};
		int temp = 0;
		temp = A[0];
		A[0] = A[1];
		System.out.print(A[0] + " ");
		A[1] = temp;
		System.out.println(A[1] +" ");
	}
	 
	public static void main(String[] args) {
		int a = 0;
		swap(a);
		 

	}

}
