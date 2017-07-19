package com.hitendra;

/**
 * 
 * Mammal
 */
public abstract class Mammal extends Vertebrate {

	/** warm blooded **/
	protected boolean warmBlooded = true;

	/**
	 * @return the warmBlooded
	 */
	public boolean isWarmBlooded() {
		return warmBlooded;
	}

	/**
	 * set warmBlooded
	 */
	public void setWarmBlooded(boolean warmBlooded) {
		this.warmBlooded = warmBlooded;
	}
}
