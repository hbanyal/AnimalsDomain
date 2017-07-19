package com.hitendra;

/**
 * 
 * Cat
 *
 */
public class Cat extends Mammal implements WalkingBehavior {

	@Override
	public void walk() {
		System.out.println("Cat's implementation of walk..........");

	}

	@Override
	public void communicate() {
		System.out.println("Cat's implementation of speak..........");

	}

	@Override
	public void eat() {
		System.out.println("Cat's implementation of eat..........");

	}

}
