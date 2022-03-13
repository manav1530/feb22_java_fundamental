package sum_of_2_martices;

public class Program {

	public static void main(String[] args) {
		int a[][] = {{1, 3, 4} , {1 ,3 ,5} ,{2 , 5 ,8}};
		int b[][] = {{1 ,3,4 } , {1 ,3 ,5} , {2 , 5 , 8}};
		int d[][] = new int[3][3];
		int r = a.length;
		int c = a[0].length;
		for(int i = 0 ; i<r ; i++)
		{
			for(int j = 0 ; j<c ; j++)
			{
				d[i][j]= a[i][j] + b[i][j];
				System.out.print(d[i][j] +" ");
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub

	}

}
