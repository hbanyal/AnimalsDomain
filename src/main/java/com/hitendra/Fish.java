package com.hitendra;

/**
 * 
 * Fish
 */
public abstract class Fish extends Vertebrate {

	/** cold blooded **/
	protected boolean coldBlooded = true;

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
