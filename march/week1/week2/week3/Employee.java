package assignment_mar15;

 

public class Employee {
	String id ;
	String name ;
	String department ;
	String work_location;
	
		

	


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public String getWork_location() {
		return work_location;
	}



	public void setWork_location(String work_location) {
		this.work_location = work_location;
	}
	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", work_location="
				+ work_location + "]";
	}



	public static void main(String[] args) {
		Employee E1 = new Employee();
		E1.setName("manav");
		E1.setDepartment("IT");
		E1.setWork_location("Bangalore");
		E1.setId("123");
		System.out.println("Employee ID is "+E1.getId());
		System.out.println("Employee name is "+E1.getName());
		System.out.println("Employee  department is "+E1.getDepartment());
		System.out.println("Employee work loaction is "+E1.getWork_location());
		Employee E2 = new Employee();
		E2.setName("mansi ");
		E2.setDepartment("HR");
		E2.setWork_location("Bangalore");
		E2.setId("4567");
		System.out.println("Employee ID is "+E2.getId());
		System.out.println("Employee name is "+E2.getName());
		System.out.println("Employee  department is "+E2.getDepartment());
		System.out.println("Employee work loaction is "+E2.getWork_location());
		
		// TODO Auto-generated method stub

	}

}

