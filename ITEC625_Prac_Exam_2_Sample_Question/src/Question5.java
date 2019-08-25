//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;

import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

//10 marks
public class Question5 { //begin class 
    /**
     * @param data
     * @param minValue
     * @return index of the first value in array that is HIGHER THAN minValue
     * <p>
     * IMPORTANT: return -1 if array is null or if none of the items of the array are higher than minValue
     */
    public static int indexOfHigherThan(int[] data, int minValue) {
        //to be completed
        if (data != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] > minValue) {
                    return i;
                }
            }
        }else
            return -1;
        return -1;
    } //end of method indexOfHigherThan (do not delete this closing bracket)


    @Test
    @Graded(description = "indexOfHigherThan(int[], int)", marks = 10)
    public void testIndexOfHigherThan() {
        assertEquals(-1, Question5.indexOfHigherThan(null, 0));
        int[] a = {1, 7, 2, 9};
        assertEquals(3, Question5.indexOfHigherThan(a, 8));
        assertEquals(1, Question5.indexOfHigherThan(a, 1));
        assertEquals(0, Question5.indexOfHigherThan(a, -1));
        assertEquals(-1, Question5.indexOfHigherThan(a, 9));
    }
} //end class (do not delete this closing bracket)
