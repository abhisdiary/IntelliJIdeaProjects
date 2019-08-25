package attempts.javaLists;

import java.util.*;

public class Stage3 {
    /**
     * @param list
     * @return true if the list is in ascending order.
     * that is, if every item is less than or equal to the next item.
     * return false if list is null
     * return true if list is empty or contains one item
     */
    public static boolean isAscending(ArrayList<Integer> list) {
        //to be completed
        if (list != null) {
            if (list.size() > 1) {
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) > list.get(i + 1)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param list
     * @return a list containing all the positive items from the list passed.
     * return null if list is null
     * return an empty list if list is NOT null but do
     */
    public static ArrayList<Integer> getPositives(ArrayList<Integer> list) {
        //to be completed
        ArrayList<Integer> temp = new ArrayList<>();
        if (list == null) {
            return null;
        } else {
            for (Integer i : list) {
                if (i > 0) {
                    temp.add(i);
                }
            }
            System.out.println(temp);
            return temp;
        }
    }

    /**
     * Remove all negative items from the list
     *
     * @param list For example,
     *             <p>
     *             if list = [2, 4, 0, -1, -2, -3, 0, 4, -8, 3, 0, -1, -1],
     *             it should become [2, 4, 0, 0, 4, 3, 0]
     *             <p>
     *             TIP: use remove method and use the debugger to ensure that the right item is being removed
     */
    public static void removeNegatives(ArrayList<Integer> list) {
        //to be completed
        if (list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < 0) {
                    list.remove(i);
                }
            }
        }
    }

    /**
     * @param list
     * @return true if the list contains two instances of target in a row, false otherwise.
     * return false if list is null or if it contains less than 2 items
     */
    public static boolean twoInARow(ArrayList<Integer> list, int target) {
        //to be completed
        if (list == null || list.size() < 2) {
            return false;
        } else {
            int c = 2;
            for (Integer i : list) {
                if (i == target) {
                    c--;
                }
                if (c == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * @param list
     * @return true if the list contains three instances of target in a row, false otherwise.
     * return false if list is null or if it contains less than 3 items
     */
    public static boolean threeInARow(ArrayList<Integer> list, int target) {
        //to be completed
        if (list == null || list.size() < 3) {
            return false;
        } else {
            int c = 3;
            int d = 4;
            for (Integer i : list) {
                if (i == target && c < d) {
                    c--;
                } else if ((d - c) > 1) {
                    c++;
                }
                if (c == 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /**
     * @param a
     * @param b
     * @return true if the two lists contain the same items but in reverse order.
     * return false if EITHER list is null
     * For example,
     * a = [10,70,20,90], b=[90,20,70,10] --> true
     * a = [10,70,20,90], b=[90,20,70] --> false
     * a = [10,70,20,90], b=[90,70,20,10] --> false
     * a = [10,70,20], b=[90,20,70,10] --> false
     * a = null, b = [90,20,70,10] --> false
     */
    public static boolean mutuallyReverse(ArrayList<Integer> a, ArrayList<Integer> b) {
        //to be completed
        if (a == null || b == null || a.size() != b.size()) {
            return false;
        } else {
            int start = 0;
            int end = a.size() - 1;
            while (start != a.size() - 1) {
                if (a.get(start) != b.get(end)) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

    /**
     * @param list
     * @return true if every item in the list occurs only once, false otherwise.
     * return true if list is empty, false if the list is null
     * <p>
     * TIP: use of methods indexOf and lastIndexOf will make your life oh-so-easy
     */
    public static boolean allUnique(ArrayList<Integer> list) {
        //to be completed
        if (list == null) {
            return false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    if (list.get(j) == list.get(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /**
     * @param widths:  if not null, assume it has same number of items as heights
     * @param heights: if not null, assume it has same number of items as widths
     * @return an ArrayList of Rectangle objects such that rectangle at index i
     * has a width of widths.get(i) and height of heights.get(i)
     * <p>
     * return null if either of the parameter lists is null
     */
    public static ArrayList<Rectangle> getRectangles(ArrayList<Integer> widths, ArrayList<Integer> heights) {
        //to be completed
        ArrayList<Rectangle> arr_list = new ArrayList<>();
        if (widths != null && heights != null) {
            for (int i = 0; i < widths.size(); i++) {
                Rectangle rectangle = new Rectangle(widths.get(i), heights.get(i));
                arr_list.add(rectangle);
            }
        }
        return arr_list;
    }
}
