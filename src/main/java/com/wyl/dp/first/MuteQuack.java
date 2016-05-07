package com.wyl.dp.first;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("<< Slience >>");
	}

}
