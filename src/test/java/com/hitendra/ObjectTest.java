package com.hitendra;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

/**
 * unit tests for Object class
 *
 */
public class ObjectTest {

	@Test
	public void testEqualObjects() {
		// given
		Object firstObj = new Object();
		Object secondObj = firstObj;
		// when
		boolean result = firstObj.equals(secondObj);
		// then
		assertTrue(result);
	}

	@Test
	public void testUnequalObjects() {
		// given
		Object firstObj = new Object();
		Object secondObj = new Object();
		// when
		boolean result = firstObj.equals(secondObj);
		// then
		assertFalse(result);
	}

	@Test(expected = NullPointerException.class)
	public void testExceptionEqual() {
		Object firstObj = null;
		Object secondObj = new Object();
		firstObj.equals(secondObj);
	}

	@Test
	public void testHashCodeForSameObject() {
		// given
		Object obj = new Object();
		// when
		int objHashCode = obj.hashCode();
		// then
		assertEquals(objHashCode, objHashCode);
	}

	@Test
	public void testHashCodeForEqualObjects() {
		// given
		Object firstObj = new Object();
		Object secondObj = firstObj;
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
		Object firstObj = new Object();
		Object secondObj = new Object();
		// when
		assertFalse(firstObj.equals(secondObj));
		int firstObjHashCode = firstObj.hashCode();
		int secondHashCode = secondObj.hashCode();
		// then
		assertNotEquals(firstObjHashCode, secondHashCode);
	}

	@Test
	public void testToStringContainsClassName() {
		Object obj = new Object();
		assertThat(obj.toString(), containsString("java.lang.Object"));
	}
}
