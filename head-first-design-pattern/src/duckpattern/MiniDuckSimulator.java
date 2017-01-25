package duckpattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallardDuck = new MallardDuck();
		mallardDuck.performFly();
		mallardDuck.PerformQuack();
		// TODO Auto-generated method stub

		Duck ModelDuck = new ModelDuck();
		ModelDuck.performFly();
		ModelDuck.PerformQuack();
		
		ModelDuck.setFlyBehavior(new FlyRocketPowered());
		
		ModelDuck.performFly();
	}

}
