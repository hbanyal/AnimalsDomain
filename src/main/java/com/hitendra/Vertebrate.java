package com.hitendra;

/**
 * 
 * Vertebrate
 */
public abstract class Vertebrate extends Animal {
	
	/** animal has backbone or not **/
	protected boolean hasBackbone = true;

	/**
	 * @return the hasBackbone
	 */
	public boolean isHasBackbone() {
		return hasBackbone;
	}

	/**
	 * @param hasBackbone the hasBackbone to set
	 */
	public void setHasBackbone(boolean hasBackbone) {
		this.hasBackbone = hasBackbone;
	}
}
