package com.hitendra;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author impadmin
 *
 * @param <T>
 */
public class AbstractHabitat<T extends Animal> implements Habitat<T> {
	private Map<String, T> animals = new LinkedHashMap<>();
	@Override
	public void put(String name, T animal) {
		animals.put(name, animal);
	}

	@Override
	public Map<String, T> getAnimals() {
		return animals;
	}
}
