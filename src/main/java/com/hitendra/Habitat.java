package com.hitendra;

import java.util.Map;

/**
 * 
 * Interface for Habitat
 *
 * @param <T>
 */
public interface Habitat<T extends Animal> {

	/**
	 * method for animals to enter habitat
	 * 
	 * @param name
	 * @param animal
	 */
	void put(String name, T animal);

	/**
	 * returns animals
	 * 
	 * @return
	 */
	Map<String, T> getAnimals();

}
