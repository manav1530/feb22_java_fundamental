package assignment_mar04;

public class Replace_a_substring {
	public static void main(String args[])
	{
		 String str = "geeks for  geeks ";
		 String word = "for ";
		 str = str.replace("for" , "and the");
		 str = str.trim();
		 System.out.println(str);

	}

}
