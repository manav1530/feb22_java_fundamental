package assignment_mar14;

 
class vehicle
{
	int brake ;
	int hand_brake;
	int front_tyres;
	int back_tyre;
	
	public void Clutch()
	{
		System.out.println("clutch is speed the vehicle");
	}
	public void Handbrake()
	{
		System.out.println("handbrake is used for emergency brake");
	}
	public void speedometre()
	{
		System.out.println("speedometre is used to show the speed");
	}
	public int getBrake() {
		return brake;
	}
	public void setBrake(int brake) {
		this.brake = brake;
	}
	public int getHand_brake() {
		return hand_brake;
	}
	public void setHand_brake(int hand_brake) {
		this.hand_brake = hand_brake;
	}
	public int getFront_tyres() {
		return front_tyres;
	}
	public void setFront_tyres(int front_tyres) {
		this.front_tyres = front_tyres;
	}
	public int getBack_tyre() {
		return back_tyre;
	}
	public void setBack_tyre(int back_tyre) {
		this.back_tyre = back_tyre;
	}
	
}
class bike extends vehicle {
	  int front_tyre ;
	  int back_tyre;
	  int clutch;
	  int brake;
	  bike()
	  {
		  
	  }
	  public void fast()
	  {
		  System.out.println("bike is faster than car ");
	  }
	 
	
}
	class car extends vehicle {
		int front_tyre ;
		int back_tyre ;
		int gear ;
		int seats;
		car(int front_tyre , int back_tyre , int gear , int seats){
			this.front_tyre = front_tyre ;
			this.back_tyre = front_tyre ;
			this.gear= gear;
			this.seats = seats;
		}
		public void comfort()
		{
			System.out.println("car is comfortable than bike");
		}
		
		
	}
	class truck extends vehicle{
		int front_tyre ;
		int extra_tyre ;
		int back_tyre ;
		int brakes ;
		int gear ;
		truck(int front_tyre,int extra_tyre,int back_tyre , int brakes , int gear)
		{
			this.front_tyre = front_tyre;
			this.extra_tyre = extra_tyre;
			this.back_tyre = back_tyre;
			this.brakes = brakes;
			this.gear = gear ;
		}
		public void useage()
		{
			System.out.println("truck is used to transport load to one side to other side");	
		}
		
	}


public class New {

	public static void main(String[] args) {
	vehicle v = new vehicle();
	v.Clutch();
	v.Handbrake();
	v.speedometre();
	v.setBrake(1);
	v.setHand_brake(1);
	v.setBack_tyre(1);
	v.setFront_tyres(1);
	System.out.println(v.getBrake());
	System.out.println(v.getBack_tyre());
	System.out.println(v.getFront_tyres());
	System.out.println(v.getHand_brake());
	System.out.println("-------bike------");
	bike b = new bike();
	b.Clutch();
	b.Handbrake();
	b.speedometre();
	System.out.println(b.clutch);
	System.out.println(b.front_tyre);
	System.out.println(b.back_tyre);
	System.out.println(b.brake);
	b.fast();
	System.out.println("------------car-----------------");
	 car C = new car(2 , 2 , 6 , 4);
	 System.out.println("back tyres are : "+C.back_tyre);
	 System.out.println("front tyres are : "+C.front_tyre);
	 System.out.println("in car gears are : "+C.gear);
	 System.out.println("in car seats are :"+C.seats);
	 C.comfort();
	 System.out.println("----------------truck-------------------");
	 truck t = new truck(4,2,2,2,6);
	 System.out.println("back tyres are : "+t.back_tyre);
	 System.out.println("front tyres are : "+t.front_tyre);
	 System.out.println("in truck gears are : "+t.gear);
	 System.out.println("in  extra tyres are :"+t.extra_tyre);
	 System.out.println("brakes are :"+t.brakes);
	 t.useage();
	
	
	
	 
	
		// TODO Auto-generated method stub

	}

}


 
