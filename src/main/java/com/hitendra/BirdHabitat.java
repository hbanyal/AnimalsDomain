package com.hitendra;

import java.util.HashMap;
import java.util.Map;

public class BirdHabitat implements Habitat<Bird>{

	private Map<String, Bird> birds = new HashMap<>();
	@Override
	public void put(String name, Bird animal) {
		birds.put(name, animal);
	}

	@Override
	public Map<String, Bird> getAnimals() {
		return birds;
	}

}
