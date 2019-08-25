//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;

import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

//10 marks
public class Question3 { //begin class 
    /**
     * @param data (assumed to contain at least one item)
     * @return number of negative items (items less than 0) in the array
     */
    public static int countNegatives(int[] data) {
        //to be completed
        int c = 0;
        for (int i : data) {
            if (i < 0) {
                c++;
            }
        }
        return c;
    }


    @Test
    @Graded(description = "countNegatives(int[])", marks = 10)
    public void testCountNegatives() {
        int[] a = {-4, -3, -2, -1};
        assertEquals(4, Question3.countNegatives(a));

        int[] b = {5, -6, -7, -8};
        assertEquals(3, Question3.countNegatives(b));

        int[] c = {-7, -9, 6};
        assertEquals(2, Question3.countNegatives(c));

        int[] d = {0, 9, 0};
        assertEquals(0, Question3.countNegatives(d));

        int[] e = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        assertEquals(10, Question3.countNegatives(e));

    }
} //end class (do not delete this closing bracket)
