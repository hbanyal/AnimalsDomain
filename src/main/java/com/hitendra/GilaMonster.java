package com.hitendra;

/**
 * 
 * Gila Monster
 *
 */
public class GilaMonster extends Reptile implements WalkingBehavior {

	@Override
	public void walk() {
		System.out.println("GilaMonster's implementation of walk..........");

	}

	@Override
	public void communicate() {
		System.out.println("GilaMonster's implementation of communicate..........");

	}

	@Override
	public void eat() {
		System.out.println("GilaMonster's implementation of eat..........");

	}

}
