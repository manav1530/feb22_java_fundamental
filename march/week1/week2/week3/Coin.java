package assignment_mar15;

 

public class Coin {

	 
		private static int TAIlS = 1;

		   
		   private int value = 0;

		    
		   public void flip()
		   {
		      if (Math.random() < 0.5)
		      {
		          value = 0;
		      }
		      else
		      {
		         value = 1;
		      }
		   }

		    
		   public boolean istails()
		   {
		      return value == TAIlS;
		   }

		   
		   public String toString()
		   {
		      if (value == TAIlS) return "tails";
		      else return "heads";
		   }

		      public static void main(String[] args)
		   {

		      Coin myCoin = new Coin();
		      for (int i = 0; i < 10; i++)
		      {
		         myCoin.flip();
		         System.out.println(myCoin);
		         System.out.println(myCoin.istails());
		      }

	}

}
