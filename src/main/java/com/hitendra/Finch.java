package com.hitendra;

/**
 * 
 * Finch
 *
 */
public class Finch extends Bird implements FlyingBehavior, WalkingBehavior {

	@Override
	public void fly() {
		System.out.println("Finch's implementation of fly..........");

	}

	@Override
	public void communicate() {
		System.out.println("Finch's implementation of communicate..........");

	}

	@Override
	public void eat() {
		System.out.println("Finch's implementation of eat..........");

	}

	@Override
	public void walk() {
		System.out.println("Finch's implementation of walk..........");

	}

}
