package com.hitendra;

/**
 * 
 * Turtle
 *
 */
public class Turtle extends Reptile implements WalkingBehavior, SwimmingBehavior {

	@Override
	public void swim() {
		System.out.println("Turtle's implementation of swim..........");

	}

	@Override
	public void walk() {
		System.out.println("Turtle's implementation of walk..........");

	}

	@Override
	public void communicate() {
		System.out.println("Turtle's implementation of speak..........");

	}

	@Override
	public void eat() {
		System.out.println("Turtle's implementation of eat..........");

	}

}
