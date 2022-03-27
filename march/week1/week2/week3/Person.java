package assignment_mar15;

 

public class Person {
	 private String name;
	   private String email;
	   private String phoneNumber;

	   // constructor
	   public Person(String theName , String email , String phonenumber)
	   {
	      this.name = theName;
	      this.email = email;
	      this.phoneNumber = phonenumber;
	   }

	   // methods - getters
	   public String getName() { return this.name;}
	   public String getEmail() { return this.email;}
	   public String getPhoneNumber() { return this.phoneNumber;}

	   // methods - setters
	   public void setName(String theName) { this.name = theName;}
	   public void setEmail(String theEmail) {this.email = theEmail;}
	   public void setPhoneNumber(String thePhoneNumber) { this.phoneNumber = thePhoneNumber;}
	   public String toString()
	   {
	      return this.name + " " + this.email + " " + this.phoneNumber;
	   }

	   // main method for testing
	   public static void main(String[] args)
	   {
	      Person p1 = new Person("Sana" , "Sanakhan@gmail.com" ,"123456789");
	      System.out.println(p1);
	      Person p2 = new Person("Jean","jean@gmail.com","789456456123");
	      p2.setEmail("jean@gmail.com");
	      p2.setPhoneNumber("404 899-9955");
	      System.out.println(p2);
	   }

}
