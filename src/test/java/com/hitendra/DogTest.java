package com.hitendra;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * unit tests for Dog class
 *
 */
public class DogTest {

	@Test
	public void testEqualObjects() {
		// given
		Dog firstObj = new Dog("Max");
		Dog secondObj = new Dog("Max");
		// when
		boolean result = firstObj.equals(secondObj);
		// then
		assertTrue(result);
	}

	@Test
	public void testUnequalObjects() {
		// given
		Dog firstObj = new Dog("Max");
		Dog secondObj = new Dog("Bujo");
		// when
		boolean result = firstObj.equals(secondObj);
		// then
		assertFalse(result);
	}

	@Test(expected = NullPointerException.class)
	public void testExceptionEqual() {
		Dog firstObj = null;
		Dog secondObj = new Dog();
		firstObj.equals(secondObj);
	}

	@Test
	public void testHashCodeForSameObject() {
		// given
		Dog obj = new Dog("Max");
		// when
		int objHashCode = obj.hashCode();
		// then
		assertEquals(objHashCode, objHashCode);
	}

	@Test
	public void testHashCodeForEqualObjects() {
		// given
		Dog firstObj = new Dog("Max");
		Dog secondObj = new Dog("Max");
		// when
		assertTrue(firstObj.equals(secondObj));
		int firstObjHashCode = firstObj.hashCode();
		int secondHashCode = secondObj.hashCode();
		// then
		assertEquals(firstObjHashCode, secondHashCode);
	}

	@Test
	public void testHashCodeForUnequalObjects() {
		// given
		Dog firstObj = new Dog("Max");
		Dog secondObj = new Dog("Bujo");
		// when
		assertFalse(firstObj.equals(secondObj));
		int firstObjHashCode = firstObj.hashCode();
		int secondHashCode = secondObj.hashCode();
		// then
		assertNotEquals(firstObjHashCode, secondHashCode);
	}

	@Test
	public void testToString() {
		Dog obj = new Dog("Max");
		assertThat(obj.toString(), containsString("Dog named " + obj.getName()));
	}
}
