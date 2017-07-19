package com.hitendra;

/**
 * 
 * Gold Fish
 *
 */
public class GoldFish extends Fish implements SwimmingBehavior {

	@Override
	public void swim() {
		System.out.println("GoldFish's implementation of swim..........");

	}

	@Override
	public void communicate() {
		System.out.println("GoldFish's implementation of communicate..........");

	}

	@Override
	public void eat() {
		System.out.println("GoldFish's implementation of eat..........");

	}

}
