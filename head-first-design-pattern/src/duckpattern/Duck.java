package duckpattern;

public abstract class Duck {
FlyBehavior flyBehavior;
QuackBehavior quackBehavior;

public abstract void display();



public void setFlyBehavior(FlyBehavior flyBehavior) {
	this.flyBehavior = flyBehavior;
}



public void setQuackBehavior(QuackBehavior quackBehavior) {
	this.quackBehavior = quackBehavior;
}



public void performFly()
{
  flyBehavior.fly();	
}

public void PerformQuack()
{
quackBehavior.quack();	
}

public void swim()
{
System.out.println("all duck can swim, even decoy");	
}

}