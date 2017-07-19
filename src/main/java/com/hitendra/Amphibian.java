package com.hitendra;

/**
 * 
 * Amphibian
 */
public abstract class Amphibian extends Vertebrate {

	/** cold blooded **/
	private boolean coldBlooded = true;

	/**
	 * @return the coldBlooded
	 */
	public boolean isColdBlooded() {
		return coldBlooded;
	}

	/**
	 * set coldBlooded
	 */
	public void setColdBlooded(boolean coldBlooded) {
		this.coldBlooded = coldBlooded;
	}
}
