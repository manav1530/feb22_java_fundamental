package assignment_mar10;

public class Try_n_catch {

	public static void main(String[] args) {
		  int n1=20,n2=0, x[]={2,0,4,6},r=0;
	        System.out.println("Hello");
	        try{
	            r=n1/n2;
	            System.out.println("Division="+r);
	        }
	        catch(ArithmeticException e){
	            System.out.println("A number cannot divided by 0");
	        
	        }
		// TODO Auto-generated method stub

	}

}
