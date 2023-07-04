package telran.util.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.util.*;
import java.util.Arrays;
import java.util.function.Predicate;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
//	private List<Integer> arrayList = new ArrayList<>();
//
//	@BeforeEach
//	public void setUp() {
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
//		arrayList.add(5);
////		arrayList=new ArrayList<>();
////		arrayList.addAll(Arrays.asList(1,2,3,4,5));
//	}
//
//	@Test
//	void addTest() {
//		assertTrue(arrayList.add(6));
//		assertEquals(6, arrayList.size());
//
//		arrayList.add(7);
//		arrayList.add(8);
//		arrayList.add(9);
//		arrayList.add(10);
//		arrayList.add(11);
//		arrayList.add(12);
//		arrayList.add(13);
//		arrayList.add(14);
//		arrayList.add(15);
//		arrayList.add(16);
//		arrayList.add(17);
//		assertEquals(17, arrayList.size());
//	}
//
//	@Test
//	void removeTest() {
//		assertTrue(arrayList.remove(1));
//	}

//	@Test
//	public void testAdd() {
//		ArrayList<String> arrayList = new ArrayList<>(3);
//
//		// Test adding an element to an empty list
//		assertTrue(arrayList.add("Element 1"));
//		assertEquals(1, arrayList.size());
//
//		// Test adding an element to a non-empty list
//		assertTrue(arrayList.add("Element 2"));
//		assertEquals(2, arrayList.size());
//
//		// Test adding null element
//		assertTrue(arrayList.add(null));
//		assertEquals(3, arrayList.size());
//
//		// Test adding multiple elements
//		assertTrue(arrayList.add("Element 3"));
//		assertTrue(arrayList.add("Element 4"));
//		assertTrue(arrayList.add("Element 5"));
//		assertEquals(6, arrayList.size());
//
//		// Test adding elements beyond the initial capacity
//		int initialCapacity = 3;
//		for (int i = 6; i <= initialCapacity + 5; i++) {
//			assertTrue(arrayList.add("Element " + i));
//			assertEquals(i, arrayList.size());
//		}
//
//		// Test adding elements beyond the reallocated capacity
//		int newCapacity = 2 * initialCapacity;
//		for (int i = initialCapacity + 6; i <= newCapacity + 1; i++) {
//			assertTrue(arrayList.add("Element " + i));
//			assertEquals(i, arrayList.size());
//		}
//	}

//    @Test
//    public void testRemove() {
//        ArrayList<String> arrayList = new ArrayList<>();
//        
//        // Add elements to the list
//        arrayList.add("Element 1");
//        arrayList.add("Element 2");
//        arrayList.add("Element 3");
//        arrayList.add("Element 4");
//        
//        // Test removing an existing element
//        assertTrue(arrayList.remove("Element 2"));
//        assertEquals(3, arrayList.size());
//        assertFalse(arrayList.contains("Element 2"));
//        
//        // Test removing a non-existing element
//        assertFalse(arrayList.remove("Element 5"));
//        assertEquals(3, arrayList.size());
//        
//        // Test removing null element
//        assertTrue(arrayList.remove(null));
//        assertEquals(2, arrayList.size());
//        assertFalse(arrayList.contains(null));
//        
//        // Test removing from an empty list
//        assertFalse(arrayList.remove("Element 1"));
//        assertEquals(2, arrayList.size());
//    }

	@Test
	public void testToArray() {
		ArrayList<String> arrayList = new ArrayList<>();

		// Add elements to the list
		arrayList.add("Element 1");
		arrayList.add("Element 2");
		arrayList.add("Element 3");
		arrayList.add("Element 4");

		// Test toArray with an array of the same size
		String[] array1 = new String[arrayList.size()];
		String[] result1 = arrayList.toArray(array1);
		assertArrayEquals(array1, result1);

//		// Test toArray with a larger array
//		String[] array2 = new String[arrayList.size() + 2];
//		String[] result2 = arrayList.toArray(array2);
//		assertArrayEquals(array1, result2);
//
//		// Test toArray with a smaller array
//		String[] array3 = new String[arrayList.size() - 2];
//		String[] result3 = arrayList.toArray(array3);
//		assertArrayEquals(new String[] { "Element 1", "Element 2" }, result3);
//
//		// Test toArray with an empty array
//		String[] array4 = new String[0];
//		String[] result4 = arrayList.toArray(array4);
//		assertArrayEquals(new String[] { "Element 1", "Element 2", "Element 3", "Element 4" }, result4);
	}

//    @Test
//    public void testRemoveIf() {
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        // Add elements to the list
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//
//        // Test removing even numbers
//        Predicate<Integer> evenPredicate = n -> n % 2 == 0;
//        assertTrue(arrayList.removeIf(evenPredicate));
//        assertEquals(3, arrayList.size());
//        assertFalse(arrayList.contains(2));
//        assertFalse(arrayList.contains(4));
//
//        // Test removing numbers greater than 10
//        Predicate<Integer> greaterThanTenPredicate = n -> n > 10;
//        assertFalse(arrayList.removeIf(greaterThanTenPredicate));
//        assertEquals(3, arrayList.size());
//
//        // Test removing all elements
//        Predicate<Integer> allElementsPredicate = n -> true;
//        assertTrue(arrayList.removeIf(allElementsPredicate));
//        assertEquals(0, arrayList.size());
//        assertTrue(arrayList.isEmpty());
//    }

	@Test
	public void testSize() {
		ArrayList<String> arrayList = new ArrayList<>();

		// Test size of an empty list
		assertEquals(0, arrayList.size());

		// Add elements to the list
		arrayList.add("Element 1");
		arrayList.add("Element 2");

		// Test size after adding elements
		assertEquals(2, arrayList.size());

//		// Remove an element
//		arrayList.remove("Element 1");
//
//		// Test size after removing an element
//		assertEquals(1, arrayList.size());
//
//		// Add more elements to the list
//		arrayList.add("Element 3");
//		arrayList.add("Element 4");
//		arrayList.add("Element 5");
//
//		// Test size after adding more elements
//		assertEquals(4, arrayList.size());
//
//		// Clear the list
//		arrayList.clear();
//
//		// Test size after clearing the list
//		assertEquals(0, arrayList.size());
	}

//	@Test
//	public void testAddAll() {
//		ArrayList<Integer> arrayList = new ArrayList<>();
//
//		// Create a collection with elements to add
//		List<Integer> collection = new ArrayList<>();
//		collection.add(1);
//		collection.add(2);
//		collection.add(3);
//
//		// Test adding elements from the collection
//		assertTrue(arrayList.addAll(collection));
//		assertEquals(3, arrayList.size());
//		assertTrue(arrayList.contains(1));
//		assertTrue(arrayList.contains(2));
//		assertTrue(arrayList.contains(3));
//
//		// Test adding an empty collection
//		assertFalse(arrayList.addAll(new ArrayList<>()));
//		assertEquals(3, arrayList.size());
//
//		// Create another collection with elements to add
//		List<Integer> anotherCollection = new ArrayList<>();
//		anotherCollection.add(4);
//		anotherCollection.add(5);
//
//		// Test adding elements from another collection
//		assertTrue(arrayList.addAll(anotherCollection));
//		assertEquals(5, arrayList.size());
//		assertTrue(arrayList.contains(4));
//		assertTrue(arrayList.contains(5));
//	}

//	@Test
//	public void testRemoveAll() {
//		ArrayList<Integer> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
//		arrayList.add(5);
//
//		// Create a collection with elements to remove
//		List<Integer> collection = new ArrayList<>();
//		collection.add(2);
//		collection.add(4);
//
//		// Test removing elements from the collection
//		assertTrue(arrayList.removeAll(collection));
//		assertEquals(3, arrayList.size());
//		assertTrue(arrayList.contains(1));
//		assertTrue(arrayList.contains(3));
//		assertTrue(arrayList.contains(5));
//
//		// Test removing elements from an empty collection
//		assertFalse(arrayList.removeAll(new ArrayList<>()));
//		assertEquals(3, arrayList.size());
//
//		// Create another collection with elements to remove
//		List<Integer> anotherCollection = new ArrayList<>();
//		anotherCollection.add(1);
//		anotherCollection.add(5);
//
//		// Test removing elements from another collection
//		assertTrue(arrayList.removeAll(anotherCollection));
//		assertEquals(1, arrayList.size());
//		assertTrue(arrayList.contains(3));
//	}

//	@Test
//	public void testIterator() {
//		ArrayList<Integer> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add(1);
//		arrayList.add(2);
//		arrayList.add(3);
//		arrayList.add(4);
//		arrayList.add(5);
//
//		// Test iterating over the list
//		Iterator<Integer> iterator = arrayList.iterator();
//		assertTrue(iterator.hasNext());
//		assertEquals(Integer.valueOf(1), iterator.next());
//		assertTrue(iterator.hasNext());
//		assertEquals(Integer.valueOf(2), iterator.next());
//		assertTrue(iterator.hasNext());
//		assertEquals(Integer.valueOf(3), iterator.next());
//		assertTrue(iterator.hasNext());
//		assertEquals(Integer.valueOf(4), iterator.next());
//		assertTrue(iterator.hasNext());
//		assertEquals(Integer.valueOf(5), iterator.next());
//		assertFalse(iterator.hasNext());
//	}

//	@Test
//	// OK
//	public void testAddAtIndex() {
//		ArrayList<String> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add("apple");
//		arrayList.add("banana");
//		arrayList.add("cherry");
//
//		// Test adding an element at a specific index
//		arrayList.add(1, "orange");
//		assertEquals(4, arrayList.size());
//		assertEquals("apple", arrayList.get(0));
//		assertEquals("orange", arrayList.get(1));
//		assertEquals("banana", arrayList.get(2));
//		assertEquals("cherry", arrayList.get(3));
//
//		// Test adding an element at the beginning of the list
//		arrayList.add(0, "grape");
//		assertEquals(5, arrayList.size());
//		assertEquals("grape", arrayList.get(0));
//		assertEquals("apple", arrayList.get(1));
//		assertEquals("orange", arrayList.get(2));
//		assertEquals("banana", arrayList.get(3));
//		assertEquals("cherry", arrayList.get(4));
//
//		// Test adding an element at the end of the list
//		arrayList.add(arrayList.size(), "kiwi");
//		assertEquals(6, arrayList.size());
//		assertEquals("grape", arrayList.get(0));
//		assertEquals("apple", arrayList.get(1));
//		assertEquals("orange", arrayList.get(2));
//		assertEquals("banana", arrayList.get(3));
//		assertEquals("cherry", arrayList.get(4));
//		assertEquals("kiwi", arrayList.get(5));
//	}

//	@Test
//	// OK
//	public void testGet() {
//		ArrayList<String> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add("apple");
//		arrayList.add("banana");
//		arrayList.add("cherry");
//
//		// Test getting elements at different indices
//		assertEquals("apple", arrayList.get(0));
//		assertEquals("banana", arrayList.get(1));
//		assertEquals("cherry", arrayList.get(2));
//	}

//	@Test
//	// OK
//	public void testSet() {
//		ArrayList<String> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add("apple");
//		arrayList.add("banana");
//		arrayList.add("cherry");
//
//		// Test setting an element at a specific index
//		String previous = arrayList.set(1, "orange");
//		assertEquals("banana", previous);
//		assertEquals(3, arrayList.size());
//		assertEquals("apple", arrayList.get(0));
//		assertEquals("orange", arrayList.get(1));
//		assertEquals("cherry", arrayList.get(2));
//
//		// Test setting an element at the beginning of the list
//		previous = arrayList.set(0, "grape");
//		assertEquals("apple", previous);
//		assertEquals(3, arrayList.size());
//		assertEquals("grape", arrayList.get(0));
//		assertEquals("orange", arrayList.get(1));
//		assertEquals("cherry", arrayList.get(2));
//
//		// Test setting an element at the end of the list
//		previous = arrayList.set(arrayList.size() - 1, "kiwi");
//		assertEquals("cherry", previous);
//		assertEquals(3, arrayList.size());
//		assertEquals("grape", arrayList.get(0));
//		assertEquals("orange", arrayList.get(1));
//		assertEquals("kiwi", arrayList.get(2));
//	}

//	@Test
//	// OK
//	public void testRemove() {
//		ArrayList<String> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add("apple");
//		arrayList.add("banana");
//		arrayList.add("cherry");
//
//		// Test removing an element at a specific index
//		String removedElement = arrayList.remove(1);
//		assertEquals("banana", removedElement);
//		assertEquals(2, arrayList.size());
//		assertEquals("apple", arrayList.get(0));
//		assertEquals("cherry", arrayList.get(1));
//
//		// Test removing the first element
//		removedElement = arrayList.remove(0);
//		assertEquals("apple", removedElement);
//		assertEquals(1, arrayList.size());
//		assertEquals("cherry", arrayList.get(0));
//
//		// Test removing the last element
//		removedElement = arrayList.remove(arrayList.size() - 1);
//		assertEquals("cherry", removedElement);
//		assertEquals(0, arrayList.size());
//	}

//	@Test
//	// OK
//	public void testIndexOf() {
//		ArrayList<String> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add("apple");
//		arrayList.add("banana");
//		arrayList.add("cherry");
//		arrayList.add("banana");
//
//		// Test finding the index of elements
//		assertEquals(0, arrayList.indexOf("apple"));
//		assertEquals(1, arrayList.indexOf("banana"));
//		assertEquals(2, arrayList.indexOf("cherry"));
//		assertEquals(-1, arrayList.indexOf("grape"));
//	}

//	@Test
//	public void testLastIndexOf() {
//		ArrayList<String> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add("apple");
//		arrayList.add("banana");
//		arrayList.add("cherry");
//		arrayList.add("banana");
//
//		// Test finding the last index of elements
//		assertEquals(0, arrayList.lastIndexOf("apple"));
//		assertEquals(3, arrayList.lastIndexOf("banana"));
//		assertEquals(2, arrayList.lastIndexOf("cherry"));
//		assertEquals(-1, arrayList.lastIndexOf("grape"));
//	}

//	@Test
//	// OK
//	public void testIndexOfWithPredicate() {
//		ArrayList<String> arrayList = new ArrayList<>();
//
//		// Add elements to the list
//		arrayList.add("apple");
//		arrayList.add("banana");
//		arrayList.add("cherry");
//		arrayList.add("banana");
//
//		// Test finding the index of elements using a predicate
//		Predicate<String> startsWithB = s -> s.startsWith("b");
//		assertEquals(1, arrayList.indexOf(startsWithB));
//
//		Predicate<String> containsP = s -> s.contains("p");
//		assertEquals(0, arrayList.indexOf(containsP));
//
//		Predicate<String> endsWithY = s -> s.endsWith("y");
//		assertEquals(2, arrayList.indexOf(endsWithY));
//
//		Predicate<String> containsX = s -> s.contains("x");
//		assertEquals(-1, arrayList.indexOf(containsX));
//	}

	@Test
	public void testLastIndexOfWithPredicate() {
		ArrayList<String> arrayList = new ArrayList<>();

		// Add elements to the list
		arrayList.add("apple");
		arrayList.add("banana");
		arrayList.add("cherry");
		arrayList.add("banana");

		// Test finding the last index of elements using a predicate
		Predicate<String> startsWithB = s -> s.startsWith("b");
		assertEquals(3, arrayList.lastIndexOf(startsWithB));

		Predicate<String> containsP = s -> s.contains("p");
		assertEquals(0, arrayList.lastIndexOf(containsP));

		Predicate<String> endsWithY = s -> s.endsWith("y");
		assertEquals(2, arrayList.lastIndexOf(endsWithY));

		Predicate<String> containsX = s -> s.contains("x");
		assertEquals(-1, arrayList.lastIndexOf(containsX));
	}

}
