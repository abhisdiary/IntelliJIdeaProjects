//IMPORTANT! Do NOT change any method headers

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import java.io.*;
import java.text.*;
import java.util.*;

//14 marks
class Box {
    private double side;

    //GETTER - DO NOT MODIFY
    public double getSide() {
        return side;
    }

    /**
     * @param s: value to be copied into instance variable side
     *           copy the "absolute" value of the parameter into the instance variable.
     *           for example,
     *           if s = 2.5, side should become 2.5
     *           if s = -1.4, side should become 1.4
     */
    public void setSide(double s) {
        //to be completed
        if (s < 0) {
            this.side = -s;
        } else {
            this.side = s;
        }
    }

    /**
     * DEFAULT CONSTRUCTOOR - DO NOT MODIFY!!!
     */
    public Box() {
        side = 1;
    }

    /**
     * @param s: value to be copied into instance variable side
     *           using the setter, copy the "absolute" value of the parameter into the instance variable.
     *           for example,
     *           if s = 2.5, side should become 2.5
     *           if s = -1.4, side should become 1.4
     */
    public Box(double s) {
        //to be completed
        if (s < 0) {
            System.out.println(s);
            s = -s;
            System.out.println(s);
            setSide(s);
        } else {
            setSide(s);
        }
    }
} //end of class Box - DO NOT DELETE THIS BRACKET
//DO NOT MODIFY ANY CODE BELOW THIS LINE


public class Question1 { //begin TEST class 
    @Test
    @Graded(description = "Box:setSide(double)", marks = 9)
    public void testSetSideBox() {
        Box b = new Box();
        b.setSide(1.2);
        assertEquals(1.2, b.getSide(), 0.01);
        b.setSide(-11.2);
        assertEquals(11.2, b.getSide(), 0.01);
        b.setSide(0);
        assertEquals(0, b.getSide(), 0.01);
    }

    @Test
    @Graded(description = "Box(double)", marks = 5)
    public void testBoxDouble() {
        Box b = new Box(1.2);
        assertEquals(1.2, b.getSide(), 0.01);
        b = new Box(-11.2);
        assertEquals(11.2, b.getSide(), 0.01);
        b = new Box(0);
        assertEquals(0, b.getSide(), 0.01);
    }
} //end TEST class Question1 (do not delete this closing bracket)
