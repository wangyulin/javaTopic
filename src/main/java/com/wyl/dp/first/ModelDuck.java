package com.wyl.dp.first;

public class ModelDuck extends Duck {
	
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;
	
	public ModelDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void performQuack() {
		this.quackBehavior.quack();
	}

	@Override
	public void performFly() {
		this.flyBehavior.fly();
	}

	@Override
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	@Override
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
	public void display() {
		System.out.println("I'm a model duck !");
	}
}
