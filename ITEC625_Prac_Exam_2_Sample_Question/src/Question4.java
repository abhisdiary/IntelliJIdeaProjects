//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;

import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

//10 marks
public class Question4 { //begin class 
    /**
     * @param data (assumed to contain at least one item)
     * @return true if data contains at least one positive integer,
     * false otherwise
     */
    public static boolean containsPositive(int[] data) {
        //to be completed
        for (int i : data) {
            if (i > 0) {
                return true;
            }
        }
        return false;
    } //end of containsPositive (do not delete this closing bracket)


    @Test
    @Graded(description = "containsPositive(int[])", marks = 10)
    public void testContainsPositive() {
        int[] a = {-4, -3, -2, -1};
        assertFalse(Question4.containsPositive(a));

        int[] b = {5, -6, -7, -8};
        assertTrue(Question4.containsPositive(b));

        int[] c = {-7, -9, 6};
        assertTrue(Question4.containsPositive(c));

        int[] d = {-7, -9, 0};
        assertFalse(Question4.containsPositive(d));

        int[] e = {0, -7, -9};
        assertFalse(Question4.containsPositive(e));

    }
} //end class (do not delete this closing bracket)
