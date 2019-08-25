import static org.junit.Assert.*;

import org.junit.Test;

public class AllInOneTest {
	@Test
	public void testIsPositive() {
		assertFalse(AllInOne.isPositive(0));
		assertTrue(AllInOne.isPositive(1));
		assertTrue(AllInOne.isPositive(12));
		assertFalse(AllInOne.isPositive(-42));
		assertTrue(AllInOne.isPositive(97));
		assertFalse(AllInOne.isPositive(-159731));
	}

	@Test
	public void testIsEven() {
		assertTrue(AllInOne.isEven(0));
		assertTrue(AllInOne.isEven(12));
		assertTrue(AllInOne.isEven(-42));
		assertFalse(AllInOne.isEven(97));
		assertFalse(AllInOne.isEven(-159731));
	}

	@Test
	public void testHighest() {
		assertEquals(5, AllInOne.highest(3, 5, 2));
		assertEquals(-5, AllInOne.highest(-20, -10, -5));
		assertEquals(0, AllInOne.highest(0, -10, -5));
	}

	@Test
	public void testNDigits() {
		assertEquals(4, AllInOne.nDigits(1729));
		assertEquals(7, AllInOne.nDigits(1512329));
	}

	@Test
	public void testRoot() {
		assertEquals(4, AllInOne.root(16));
		assertEquals(9, AllInOne.root(81));
		assertEquals(1000, AllInOne.root(1000000));
	}

	@Test
	public void testSumFirstLast() {
		assertEquals(4, AllInOne.sumFirstLast(new int[] {1,2,3}));
		assertEquals(6, AllInOne.sumFirstLast(new int[] {6}));
		assertEquals(19, AllInOne.sumFirstLast(new int[] {9,1,2,3,4,10}));
	}

	@Test
	public void testCountNegatives() {
		assertEquals(2, AllInOne.countNegatives(new int[] {0,0,0,0,-1,3,4,5,-2,2}));
		assertEquals(4, AllInOne.countNegatives(new int[] {0,-6,-5,0,-1,3,4,5,-2,2}));
		assertEquals(0, AllInOne.countNegatives(new int[] {0,6,6,0,1,3,4,5,2,2}));
	}

	@Test
	public void testAllNegatives() {
		assertTrue(AllInOne.allNegatives(new int[] {-6,-5,-1,-3,-4,-5,-2,-2}));
		assertFalse(AllInOne.allNegatives(new int[] {6,-5,-1,-3,-4,-5,-2,-2}));
		assertFalse(AllInOne.allNegatives(new int[] {-6,-5,-1,-3,-4,-5,-2,2}));
		assertFalse(AllInOne.allNegatives(new int[] {0,-5,-1,-3,-4,-5,-2,-2}));
		assertFalse(AllInOne.allNegatives(new int[] {-6,-5,-1,-3,-4,-5,-2,0}));
		assertFalse(AllInOne.allNegatives(new int[] {-6,-5,-1,3,-4,-5,-2,-2}));
	}

	@Test
	public void testIndexOf() {
		assertEquals(2, AllInOne.indexOf(new int[] {0,0,10,0,-1,3,4,10,-2,2}, 10));
		assertEquals(-1, AllInOne.indexOf(new int[] {0,0,10,0,-1,3,4,10,-2,2}, 20));
		assertEquals(9, AllInOne.indexOf(new int[] {0,0,10,0,-1,3,4,10,-2,2}, 2));
	}

	@Test
	public void testAreIdentical() {
		assertTrue(AllInOne.areIdentical(new int[] {1,7,2,9}, new int[]{1,7,2,9}));
		assertFalse(AllInOne.areIdentical(new int[] {1,7,2,9}, new int[]{1,7,2}));
		assertFalse(AllInOne.areIdentical(new int[] {7,2,9}, new int[]{7,2,9,1}));
		assertFalse(AllInOne.areIdentical(new int[] {1,7,2,9}, new int[]{1,7,2,5}));
		assertFalse(AllInOne.areIdentical(new int[] {1,7,2,9}, new int[]{2,7,2,9}));
	}

	@Test
	public void testGetMultiples() {
		assertArrayEquals(new int[] {16, 24, 8}, AllInOne.getMultiples(new int[] {4,16,1,1,24,5,8,7}, 8));
		assertArrayEquals(new int[] {}, AllInOne.getMultiples(new int[] {4,12,1,1,24,5,8,7}, 50));
	}

	@Test
	public void testGetMostFrequentItem() {
		assertEquals(0, AllInOne.getMostFrequentItem(new int[] {0,0,9,0,1,3,4,9,2,2}));
		assertEquals(5, AllInOne.getMostFrequentItem(new int[] {0,0,9,5,5,5,5,5,5,7,5}));
	}

	@Test 
	public void testLongestRecurringSequence() {
		int[] a = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9};
		int[] b = {3,8,7,2,9};
		assertNotNull(AllInOne.longestRecurringSequence(a));
		assertArrayEquals(b, AllInOne.longestRecurringSequence(a));

		a = new int[]{1,2,1,2,1,2,1,2,1,2,1,2};
		b = new int[]{1,2,1,2,1,2};
		assertNotNull(AllInOne.longestRecurringSequence(a));
		assertArrayEquals(b, AllInOne.longestRecurringSequence(a));

		a = new int[]{5,6,7,8};
		b = new int[]{};
		assertNotNull(AllInOne.longestRecurringSequence(a));
		assertArrayEquals(b, AllInOne.longestRecurringSequence(a));

		a = new int[]{5,6,7,5,7,6,8,5,9};
		b = new int[]{5};
		assertNotNull(AllInOne.longestRecurringSequence(a));
		assertArrayEquals(b, AllInOne.longestRecurringSequence(a));
	}
}
