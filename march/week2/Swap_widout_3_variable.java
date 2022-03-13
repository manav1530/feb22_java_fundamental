package assignment_mar07;
import java.util.Scanner;

public class Swap_widout_3_variable {
	public static void main(String args[])
	{
		   String str1 = "Good ", str2 = "morning ";    
	         System.out.println("Strings before swapping: " + str1 + " " + str2);    
	        
	         
	        str1 = str1 + str2;    
	       
	        str2 = str1.substring(0, (str1.length() - str2.length()));    
	         
	        str1 = str1.substring(str2.length());    
	            
	        System.out.println("Strings after swapping: " + str1 + " " + str2);    
	    }    
		
		
		
	}


