
import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {
	@Test
	public void testSetMonth() {
		Date d1 = new Date();
		d1.setMonth(-3);
		assertEquals(1, d1.getMonth());
		d1.setMonth(0);
		assertEquals(1, d1.getMonth());
		d1.setMonth(13);
		assertEquals(12, d1.getMonth());
		for(int i=1; i <= 12; i++) {
			d1.setMonth(i);
			assertEquals(i, d1.getMonth());
		}
	}
	
	@Test
	public void testCompareTo() {
		Date d1 = new Date(13, 4, 2014);
		Date d2 = new Date(13, 4, 2015);
		Date d3 = new Date(13, 5, 2014);
		Date d4 = new Date(12, 4, 2014);
		Date d5 = new Date(13, 4, 2014);
		
		assertEquals(-1, d1.compareTo(d2));
		assertEquals(1, d2.compareTo(d1));
		
		assertEquals(-1, d1.compareTo(d3));
		assertEquals(1, d3.compareTo(d1));
		
		assertEquals(1, d1.compareTo(d4));
		assertEquals(-1, d4.compareTo(d1));
		
		assertEquals(0, d1.compareTo(d5));
	}
}
