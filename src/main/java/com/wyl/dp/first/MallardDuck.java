package com.wyl.dp.first;

public class MallardDuck extends Duck {
	
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}

	@Override
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck !");
	}
}
