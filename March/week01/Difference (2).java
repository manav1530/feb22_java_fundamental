package assignment_mar03;

public class Difference {

	public static void main(String[] args) {
		 int n1[] = { 20 , 40 , 50 , 60 , 70};
		 int n2[] = { 10 , 20 , 30 , 40 , 50};
		 int n3[] = new int [n1.length];
		 for(int i = 0 ; i<n1.length ; i++)
		 {
			 n3[i] = n1[i] - n2[i];
			 System.out.println(n3[i]);
		 }
	}

}
