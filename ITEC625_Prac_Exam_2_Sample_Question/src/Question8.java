//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;

import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

//16 marks
public class Question8 { //begin class 
    /**
     * .
     *
     * @param list
     * @return a list containing the longest ascending run inside the parameter.
     * return first of the runs if there is a tie.
     * for example,
     * if list = null or an empty list, return null
     * if list = [6, 1, 4, 2, 8, 3, 9], return the list [1, 4]
     * if list = [6, 1, 4, 2, 8, 3, 3, 4, 9], return the list [3, 3, 4, 9]
     */
    public static ArrayList<Integer> getLongestAscendingRun(ArrayList<Integer> list) {
        System.out.println("I got: " + list);
        //to be completed
        if (list != null && list.size() != 0) {
            ArrayList<Integer> longest_list = new ArrayList<>();
            ArrayList<Integer> current_list = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i == list.size() - 1) {
                    if (list.get(i - 1) < list.get(i)) {
                        current_list.add(list.get(i));
                    }
                    if (current_list.size() > longest_list.size()) {
                        longest_list = current_list;
                    }
                    if (longest_list.size() == 0) {
                        longest_list.add(list.get(0));
                    }
                } else if (list.get(i) < list.get(i + 1)) {
                    current_list.add(list.get(i));
                } else {
                    if (current_list.size() > longest_list.size()) {
                        longest_list = current_list;
                    }
                    current_list.clear();
                }
            }
            System.out.println("I returned: " + longest_list);
            return longest_list;
        } else {
            System.out.println("I returned: " + null);
            return null;
        }
    }


    @Test
    @Graded(marks = 10, description = "getLongestAscendingRun(List)")
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

    }
} //end class (do not delete this closing bracket)
