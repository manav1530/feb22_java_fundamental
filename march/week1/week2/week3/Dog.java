package assignment_mar17;
class Beagle
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}
public class Dog
{
    public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.speak();
        Beagle b = new Beagle();
        b.speak();
    }
}



