package assignment_mar16;

 

class Animal 
{
	int legs ;
	int tail;
	int eyes ;
	int nose ;
	int ears;
	static int age ;
	public static void incremntage()
	{
		age++;
		System.out.println(age);
	}
	public void herbivorus()
	{
		System.out.println("herbivorus animals dont eat meat & they eat veggies n grass");
	}
	public void carnivorus()
	{
		System.out.println("carnivorus animals eat meat");
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getTail() {
		return tail;
	}
	public void setTail(int tail) {
		this.tail = tail;
	}
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getNose() {
		return nose;
	}
	public void setNose(int nose) {
		this.nose = nose;
	}
	public int getEars() {
		return ears;
	}
	public void setEars(int ears) {
		this.ears = ears;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Animal.age = age;
	}
	
}
class dog
{
	int legs ;
	int tail;
	boolean iscute;
	dog()
	{
		
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public boolean isIscute() {
		return iscute;
	}

	public void setIscute(boolean iscute) {
		this.iscute = iscute;
	}

	public void bark()
	{
		System.out.println("dog barks when he/she feels danger");
	}
}
class cat
{
	int legs ;
	int tail;
	boolean catlazy;
	cat(int legs , int tail , boolean catlazy)
	{
		this.legs=legs;
		this.tail=tail;
		this.catlazy = catlazy;
				
	}
		
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public boolean isCatlazy() {
		return catlazy;
	}

	public void setCatlazy(boolean catlazy) {
		this.catlazy = catlazy;
	}

	public void voice() 
	{
		System.out.println("cat says meow when he/she want something  ");
	}
	
	
	
  }
class cow
{
	int legs ;
	int tail ;
	boolean cangivemilk;
	cow(int legs , int tail , boolean cangivemilk)
	{
		this.legs=legs;
		this.tail=tail;
		this.cangivemilk = cangivemilk;
	}
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}

	public boolean isCangivemilk() {
		return cangivemilk;
	}

	public void setCangivemilk(boolean cangivemilk) {
		this.cangivemilk = cangivemilk;
	}

	public void uses()
	{
		System.out.println("cow can give milk and milk products are useful humans");
	}
}


public class Infromation {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.setEars(2);
		a.setEyes(2);
		a.setLegs(4);
		a.setNose(1);
		a.setTail(1);
		System.out.println(a.getEyes());
		System.out.println(a.getEars());
		System.out.println(a.getTail());
		System.out.println(a.getNose());
		System.out.println(a.getLegs());
		a.carnivorus();
		a.herbivorus();
		a.incremntage();
		System.out.println("------------dog--------------");
		dog d = new dog();
		d.setIscute(true);
		d.setLegs(4);
		d.setTail(1);
		System.out.println("dog legs "+d.getLegs());
		System.out.println("dog tail "+d.getTail());
		System.out.println("dogs are cute "+d.iscute);
		d.bark();
		System.out.println("------------------cat-----------------");
		cat c = new cat(4 ,1 ,true);
		System.out.println(" "+c.getLegs());
		System.out.println(" "+c.getTail());
		System.out.println(" "+c.isCatlazy());
		c.voice();
		System.out.println("------------------cow-----------------");
		cow c1 = new cow(4 ,1 , true);
		System.out.println(" "+c1.getLegs());
		System.out.println(" "+c1.getTail());
		System.out.println(" "+c1.isCangivemilk());
		c1.uses();
				 
		
				 
		
		
		
	 
	}

}

