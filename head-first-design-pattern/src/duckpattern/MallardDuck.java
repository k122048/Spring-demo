package duckpattern;

public class MallardDuck extends Duck {
	
public MallardDuck()
{
flyBehavior = new FlyWithWings();
quackBehavior = new Quack();	
}
public void display()
{
System.out.println("i m a real mallardDuck");	
}
}