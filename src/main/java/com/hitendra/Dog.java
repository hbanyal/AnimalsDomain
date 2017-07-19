package com.hitendra;

/**
 * 
 * Dog
 */
public class Dog extends Mammal implements WalkingBehavior {

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public void communicate() {
		System.out.println("Dog Barks..........");

	}

	@Override
	public void eat() {
		System.out.println("Dog eats meat ......");

	}

	@Override
	public void walk() {
		System.out.println("Dog's implementation of walking ......");

	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Dog))
			return false;
		Dog dog = (Dog) o;
		return dog.name == name;

	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + name.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "Dog named " + name;
	}
}
