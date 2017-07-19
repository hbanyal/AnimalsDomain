package com.hitendra;

/**
 * 
 * Trout
 *
 */
public class Trout extends Fish implements SwimmingBehavior {

	@Override
	public void swim() {
		System.out.println("Trout's implementation of swim..........");

	}

	@Override
	public void communicate() {
		System.out.println("Trout's implementation of speak..........");

	}

	@Override
	public void eat() {
		System.out.println("Trout's implementation of eat..........");

	}

}
