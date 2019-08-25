//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;

import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

//10 marks
public class Question7 { //begin class 
    /**
     * @param data: an ArrayList of Rectangle objects
     * @return number of items in ArrayList that are squares
     * return 0 if ArrayList is null
     */
    public static int countSquares(ArrayList<Rectangle> data) {
        //to be completed
        int total = 0;
        ArrayList<Rectangle> arrayList = new ArrayList<>();
        if (data != null) {
            for (Rectangle rectangle : data) {
                if (rectangle.isSquare()) {
                    total++;
                }
            }
        } else {
            return 0;
        }
        return total;
    }


    @Test
    @Graded(description = "countSquares(ArrayList<Rectangle>)", marks = 10)
    public void testCountSquaresRectangleArrayList() {
        assertEquals(0, Question7.countSquares(null));

        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        list.add(new Rectangle(5, 5));
        list.add(new Rectangle(2, 2));
        list.add(new Rectangle(3, 4));
        list.add(new Rectangle(6, 6));
        list.add(new Rectangle(5, 6));
        list.add(new Rectangle(8, 8));
        assertEquals(4, Question7.countSquares(list));

        list.clear();

        list.add(new Rectangle(1, 5));
        list.add(new Rectangle(1, 2));
        list.add(new Rectangle(4, 4));
        list.add(new Rectangle(2, 6));
        list.add(new Rectangle(5, 6));
        list.add(new Rectangle(1, 8));
        assertEquals(1, Question7.countSquares(list));

        ArrayList<Rectangle> data = new ArrayList<Rectangle>();
        int n = 0;
        for (int i = 0; i < 100; i++) {
            int w = (int) (Math.random() * 10) + 1;
            int h = (int) (Math.random() * 10) + 1;
            n = (w == h) ? n + 1 : n;
            data.add(new Rectangle(w, h));
        }
        assertEquals(n, Question7.countSquares(data));
    }
} //end class (do not delete this closing bracket)
