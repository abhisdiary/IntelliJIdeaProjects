//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;

import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

//10 marks
public class Question6 { //begin class 
    /**
     * @param list
     * @return sum of all items except the first and last items
     * return 0 if list is null
     * for example,
     * if list = [20, 50, 80, 60, 30], return 50+80+60=190
     * if list = [20, 30], return 0
     * if list = [40], return 0
     */
    public static int sumNotOnBoundaries(ArrayList<Integer> list) {
        //to be completed
        int sum = 0;
        if (list != null && list.size() > 2) {
            for (int i = 1; i < list.size() - 1; i++) {
                sum = sum + list.get(i);
            }
        } else {
            return 0;
        }
        return sum;
    }


    @Test
    @Graded(description = "sumNotOnBoundaries(ArrayList<Integer>)", marks = 10)
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

    }
} //end class (do not delete this closing bracket)
