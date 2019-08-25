//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import org.junit.*;
import java.io.*;
import java.text.*;
import java.util.*;

//20 marks
class Ball {
	private double radius;

	//GETTER - DO NOT MODIFY
	public double getRadius() {
		return radius;
	}

	/**
	 * DO NOT MODIFY
	 * @param r: value to be copied into instance variable radius
	 * copy the "absolute" value of the parameter into the instance variable.
	 * for example,
	 * if r = 2.5, radius should become 2.5
	 * if r = -1.4, radius should become 1.4
	 */
	public void setRadius(double r) {
		radius = Math.abs(r);
	}

	/**
	 * DEFAULT CONSTRUCTOR - DO NOT MODIFY!!!
	 */
	public Ball() {
		radius = 1;
	}

	/**
	 * DO NOT MODIFY!
	 * @param r: value to be copied into instance variable radius
	 * using the setter, copy the "absolute" value of the parameter into the instance variable.
	 * for example,
	 * if r = 2.5, radius should become 2.5
	 * if r = -1.4, radius should become 1.4
	 */
	public Ball(double r) {
		setRadius(r);
	}

	/**
	 *
	 * @return diameter of the ball (diameter is twice of radius)
	 */
	public double diameter() {
		//to be completed
		return 2 * getRadius();
	}

	/**
	 *
	 * @param other
	 * @return 1 if calling object bigger than parameter object
	 * -1 if calling object smaller than parameter object
	 * 0 if calling object and parameter object are equal
	 */
	public int compareTo(Ball other) {
		//to be completed
		if (this.getRadius() == other.getRadius()) {
			return 0;
		} else if (this.getRadius() < other.getRadius()) {
			return -1;
		} else {
			return 1;
		}
	} //end of method compareTo (do not delete this closing bracket)
} //end of class Ball (do not delete this closing bracket)
//DO NOT MODIFY ANY CODE BELOW THIS LINE


public class Question2 { //begin TEST class 
	@Test @Graded(description="Ball:diameter()", marks=5)
	public void testDiameterBall() {
		Ball b = new Ball(1.2);
		assertEquals(2.4, b.diameter(), 0.01);
		b = new Ball(1.8);
		assertEquals(3.6, b.diameter(), 0.01);
	}

	@Test @Graded(description="compareTo(Ball)", marks=15)
	public void testCompareToBall() {
		Ball b = new Ball(1.2);
		Ball c = new Ball(1.8);
		assertEquals(1, c.compareTo(b));
		assertEquals(-1, b.compareTo(c));
		assertEquals(0, c.compareTo(c));
	}
} //end TEST class Question2 (do not delete this closing bracket)
