package com.hitendra;

public class HabitatApplication {
	public static void main(String[] k)
	{
		Habitat<Bird> birdHabitat = new BirdHabitat();
		Habitat<Dog> dogHabitat = new AbstractHabitat<>();
		Bird eagle = new Eagle("eagle");
		Dog dogObj = new Dog("dog");
		birdHabitat.put(eagle.getName(), eagle);
		dogHabitat.put(dogObj.getName(), dogObj);
		birdHabitat.getAnimals().forEach((name, bird) -> System.out.println(name));
		dogHabitat.getAnimals().forEach((name, dog) -> System.out.println(name));
	}
}
