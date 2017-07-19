package com.hitendra;

/**
 * 
 * Animal class. Top level class for Animal hierarchy
 *
 */
public abstract class Animal {

	/** animal is alive or not **/
	private boolean isAlive = true;

	/** name of the animal **/
	protected String name;

	/**
	 * Breathe
	 */
	public void breathe() {
		System.out.println("Generic implementation");
	}

	/**
	 * communicate
	 */
	public abstract void communicate();

	/**
	 * Eat
	 */
	public abstract void eat();

	/**
	 * @return the isAlive
	 */
	public boolean isAlive() {
		return isAlive;
	}

	/**
	 * @param isAlive
	 *            the isAlive to set
	 */
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set name
	 */
	public void setName(String name) {
		this.name = name;
	}

}
