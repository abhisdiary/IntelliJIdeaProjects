/*****************************
 *                           *
 * DO NOT MODIFY THIS FILE   *
 *						 	 *
 *****************************/

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;

public class AllInOneTest {
	private static int score = 0;
	private static String result = "";
	@Test @Graded(description="Box:setSide(double)", marks=9)
	public void testSetSideBox() {
		Box b = new Box();
		b.setSide(1.2);
		assertEquals(1.2, b.getSide(), 0.01);
		b.setSide(-11.2);
		assertEquals(11.2, b.getSide(), 0.01);
		b.setSide(0);
		assertEquals(0, b.getSide(), 0.01);
		score+=9;
		result+="Box:setSide(double) passed (9 marks)\n";
	}

	@Test @Graded(description="Box(double)", marks=5)
	public void testBoxDouble() {
		Box b = new Box(1.2);
		assertEquals(1.2, b.getSide(), 0.01);
		b = new Box(-11.2);
		assertEquals(11.2, b.getSide(), 0.01);
		b = new Box(0);
		assertEquals(0, b.getSide(), 0.01);
		score+=5;
		result+="Box(double) passed (5 marks)\n";
	}


	@Test @Graded(description="Ball:diameter()", marks=5)
	public void testDiameterBall() {
		Ball b = new Ball(1.2);
		assertEquals(2.4, b.diameter(), 0.01);
		b = new Ball(1.8);
		assertEquals(3.6, b.diameter(), 0.01);
		score+=5;
		result+="Ball:diameter() passed (5 marks)\n";
	}

	@Test @Graded(description="compareTo(Ball)", marks=15)
	public void testCompareToBall() {
		Ball b = new Ball(1.2);
		Ball c = new Ball(1.8);
		assertEquals(1, c.compareTo(b));
		assertEquals(-1, b.compareTo(c));
		assertEquals(0, c.compareTo(c));
		score+=15;
		result+="compareTo(Ball) passed (15 marks)\n";
	}


	@Test @Graded(description="countNegatives(int[])", marks=10)
	public void testCountNegatives() {
		int[] a = {-4,-3,-2,-1};
		assertEquals(4,Question3.countNegatives(a));

		int[] b = {5,-6,-7,-8};
		assertEquals(3,Question3.countNegatives(b));

		int[] c = {-7,-9,6};
		assertEquals(2,Question3.countNegatives(c));

		int[] d = {0,9,0};
		assertEquals(0,Question3.countNegatives(d));

		int[] e = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
		assertEquals(10,Question3.countNegatives(e));

		score+=10;
		result+="countNegatives(int[]) passed (10 marks)\n";
	}


	@Test @Graded(description="containsPositive(int[])", marks=10)
	public void testContainsPositive() {
		int[] a = {-4,-3,-2,-1};
		assertFalse(Question4.containsPositive(a));

		int[] b = {5,-6,-7,-8};
		assertTrue(Question4.containsPositive(b));

		int[] c = {-7,-9,6};
		assertTrue(Question4.containsPositive(c));

		int[] d = {-7,-9,0};
		assertFalse(Question4.containsPositive(d));

		int[] e = {0,-7,-9};
		assertFalse(Question4.containsPositive(e));

		score+=10;
		result+="containsPositive(int[]) passed (10 marks)\n";
	}


	@Test @Graded(description="indexOfHigherThan(int[], int)", marks=10)
	public void testIndexOfHigherThan() {
		assertEquals(-1, Question5.indexOfHigherThan(null, 0));
		int[] a = {1,7,2,9};
		assertEquals(3, Question5.indexOfHigherThan(a, 8));
		assertEquals(1, Question5.indexOfHigherThan(a, 1));
		assertEquals(0, Question5.indexOfHigherThan(a, -1));
		assertEquals(-1, Question5.indexOfHigherThan(a, 9));
		score+=10;
		result+="indexOfHigherThan(int[], int) passed (10 marks)\n";
	}


	@Test @Graded(description="sumNotOnBoundaries(ArrayList<Integer>)", marks=10)
	public void testsumNotOnBoundariesArrayList() {
		assertEquals(0, Question6.sumNotOnBoundaries(null)); //null list check
		ArrayList<Integer> list = new ArrayList<Integer>();
		assertEquals(0, Question6.sumNotOnBoundaries(list)); //empty list check

		list.add(20);
		assertEquals(0, Question6.sumNotOnBoundaries(list));
		list.add(30);
		assertEquals(0, Question6.sumNotOnBoundaries(list));

		list.add(60);
		assertEquals(30, Question6.sumNotOnBoundaries(list));

		list.add(10);
		list.add(50);
		list.add(30);
		assertEquals(150, Question6.sumNotOnBoundaries(list));

		score+=10;
		result+="sumNotOnBoundaries(ArrayList<Integer>) passed (10 marks)\n";
	}


	@Test @Graded(description="countSquares(ArrayList<Rectangle>)", marks=10)
	public void testCountSquaresRectangleArrayList() {
		assertEquals(0, Question7.countSquares(null));

		ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		list.add(new Rectangle(5,5));
		list.add(new Rectangle(2,2));
		list.add(new Rectangle(3,4));
		list.add(new Rectangle(6,6));
		list.add(new Rectangle(5,6));
		list.add(new Rectangle(8,8));
		assertEquals(4, Question7.countSquares(list));

		list.clear();

		list.add(new Rectangle(1,5));
		list.add(new Rectangle(1,2));
		list.add(new Rectangle(4,4));
		list.add(new Rectangle(2,6));
		list.add(new Rectangle(5,6));
		list.add(new Rectangle(1,8));
		assertEquals(1, Question7.countSquares(list));

		ArrayList<Rectangle> data = new ArrayList<Rectangle>();
		int n = 0;
		for(int i=0; i < 100; i++) {
			int w = (int)(Math.random() * 10) + 1;
			int h = (int)(Math.random() * 10) + 1;
			n = (w==h) ? n+1 : n;
			data.add(new Rectangle(w, h));
		}
		assertEquals(n, Question7.countSquares(data));
		score+=10;
		result+="countSquares(ArrayList<Rectangle>) passed (10 marks)\n";
	}


	@Test @Graded(marks=10, description="getLongestAscendingRun(List)")
	public void testGetLongestAscendingRunList() {
		ArrayList<Integer> list = null;
		ArrayList<Integer> asc = Question8.getLongestAscendingRun(list);
		assertNull(asc);

		list = new ArrayList<Integer>();
		asc = Question8.getLongestAscendingRun(list);
		assertNull(asc);

		list.add(3);
		list.add(2);
		list.add(1);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[3]", asc.toString());

		list.add(4);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[1, 4]", asc.toString());

		list.add(2);
		list.add(0);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		asc = Question8.getLongestAscendingRun(list);
		assertEquals("[0, 5, 6, 7, 8]", asc.toString());

		score+=10;
		result+="getLongestAscendingRun(List) passed. (10 marks)\n";
	}


	
	@AfterClass
	public static void wrapUp() throws IOException {
	System.out.println("Score = "+score);
		System.out.println(result);
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		File file = new File("report"+timeStamp+".txt");
		FileWriter writer = new FileWriter(file);
		writer.write("Score = "+score+"\n");
		writer.write(result+"\n");
		writer.flush();
		writer.close();
	}
}
