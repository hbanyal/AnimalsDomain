package com.hitendra;

/**
 * Invertebrate
 *
 */
public abstract class Invertebrate extends Animal {
	
	/** animal has backbone or not **/
	protected boolean hasBackbone = false;

	/**
	 * @return the hasBackbone
	 */
	public boolean isHasBackbone() {
		return hasBackbone;
	}

	/**
	 * @param hasBackbone
	 *            the hasBackbone to set
	 */
	public void setHasBackbone(boolean hasBackbone) {
		this.hasBackbone = hasBackbone;
	}
}
