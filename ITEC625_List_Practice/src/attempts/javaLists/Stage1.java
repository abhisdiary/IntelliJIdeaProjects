package attempts.javaLists;

import java.util.*;

public class Stage1 {
    /**
     * @param list
     * @return the last item in the list.
     * return null if list is null or empty
     */
    public static Integer getLastItem(ArrayList<Integer> list) {
        // to be completed
        if (list != null && !list.isEmpty()) {
            return list.get(list.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * @param list
     * @return the sum of the first and last items
     * return null if list is null
     * return the only value if list contains a single item
     */
    public static Integer getSumFirstLastItems(ArrayList<Integer> list) {
        //to be completed
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return list.get(0);
            } else {
                return list.get(0) + list.get(list.size() - 1);
            }
        } else {
            return null;
        }
    }

    /**
     * @param list
     * @return true if the list contains an even number of items (0, 2, 4 ....), false otherwise
     * return false if list is null
     */
    public static boolean containsEvenNumberOfItems(ArrayList<Integer> list) {
        // to be completed
        if (list != null) {
            for (Integer integer : list) {
                if (integer % 2 != 0) {
                    return false;
                }
            }
            return true;
        } else
            return false;
    }

    /**
     * @param a
     * @param b
     * @return true if the two lists are of the same size, false otherwise
     * return false if EITHER list is null
     */
    public static boolean sameSize(ArrayList<Integer> a, ArrayList<Integer> b) {
        //to be completed
        if (a == null || b == null) {
            return false;
        } else {
            return a.size() == b.size();
        }
    }

    /**
     * @param list
     * @return the median value in the list (the item in the middle).
     * if the list has an odd number of items, it's a clear choice.
     * if the list has an even number of items, return the number just to the left of the dividing line.
     * if the list is null or empty, return null
     * <p>
     * Some parameter-return value examples:
     * [10,70,20,90,30] --> 20
     * [50,80,90,70] --> 80
     * [] --> null
     * null -> null
     */
    public static Integer median(ArrayList<Integer> list) {
        //to be completed
        if (list != null && list.size() != 0) {
            if (list.size() % 2 == 0) {
                int idx = list.size() / 2 - 1;
                return list.get(idx);
            } else {
                int idx = list.size() / 2;
                return list.get(idx);
            }
        } else {
            return null;
        }
    }

    /**
     * @param list - an arraylist of Rectangle objects
     * @return the first item in the list.
     * return null if list is null or empty
     */
    public static Rectangle getFirstItem(ArrayList<Rectangle> list) {
        //to be completed
        if (list != null) {
            for (Rectangle rectangle : list) {
                return rectangle;
            }
        } else {
            return null;
        }
        return null;
    }
}
