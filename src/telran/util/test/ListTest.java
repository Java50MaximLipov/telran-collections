package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.*;

abstract class ListTest extends CollectionTest {
	List<Integer> list;

	@BeforeEach
	@Override
	void setUp() {
		super.setUp();
		list = (List<Integer>) collection;
	}

	@Override
	void addTest() {
		Integer[] expected = { 10, -20, 8, 14, 30, 12, 100, 10 };
		assertTrue(list.add(10));
		assertArrayEquals(expected, list.toArray(new Integer[0]));

	}

	@Test
	void addIndexTest() {
		Integer[] expected = { 10, 10, -20, 8, 14, 30, 12, 100 };
		list.add(0, 10);
		assertArrayEquals(expected, list.toArray(new Integer[0]));
	}

	// HW-12
	@Test
	void getTest() {
		assertEquals(10, list.get(0));
	}

	@Test
	void setTest() {
		Integer[] expected = { 10, -20, 8, 42, 30, 12, 100 };
		list.set(3, 42);
		assertArrayEquals(expected, list.toArray(new Integer[0]));
		assertThrows(IndexOutOfBoundsException.class, () -> list.set(7, 1));
	}

	@Test
	void removeTest() {
		Integer[] expected = { 10, -20, 8, 14, 30, 12 };
		list.remove(6);
		assertArrayEquals(expected, list.toArray(new Integer[0]));
		assertThrows(IndexOutOfBoundsException.class, () -> list.remove(6));
	}

	@Test
	void indexOfTest() {
		assertEquals(0, list.indexOf(10));
		assertEquals(-1, list.indexOf(42));
	}

	@Test
	void lastIndexOfTest() {
		assertEquals(5, list.lastIndexOf(12));
		assertEquals(-1, list.indexOf(42));
	}

	@Test
	void indexOfPredicateTest() {
//		Integer[] numbers = { 10, -20, 8, 14, 30, 12, 100 };
		assertEquals(1, list.indexOf(num -> num < 0));
		assertEquals(6, list.indexOf(num -> num % 50 == 0));
	}

	@Test
	void lastIndexOfPredicate() {
		assertEquals(3, list.lastIndexOf(num -> num % 7 == 0));
		assertEquals(-1, list.lastIndexOf(7));
	}

}