package com.hitendra;

/**
 * 
 * Bird
 */
public abstract class Bird extends Vertebrate {

	/** has wings **/
	protected boolean hasWings = true;

	/**
	 * @return the hasWings
	 */
	public boolean isHasWings() {
		return hasWings;
	}

	/**
	 * set hasWings
	 */
	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
}
