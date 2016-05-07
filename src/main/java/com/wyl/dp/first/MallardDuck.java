package com.wyl.dp.first;

public class MallardDuck extends Duck {
	
	private QuackBehavior quackBehavior;
	private FlyWithWings flyWithWings;
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyWithWings = new FlyWithWings();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyWithWings.fly();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck !");
	}
	
}
