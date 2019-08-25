package attempts.javaLists;

import java.util.*;

public class Stage2 {
    /**
     * @param list
     * @return the sum of all items of the list
     * return 0 if list is null or empty
     */
    public static int sum(ArrayList<Integer> list) {
        //to be completed
        if (list != null && list.size() != 0) {
            int sum = 0;
            for (Integer integer : list) {
                sum = sum + integer;
            }
            return sum;
        } else
            return 0;
    }

    /**
     * @param list
     * @return the sum of all negatives items of the list
     * return 0 if list is null or empty
     */
    public static int sumNegatives(ArrayList<Integer> list) {
        //to be completed
        if (list != null && list.size() != 0) {
            int sum = 0;
            for (Integer i : list) {
                if (i < 0) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return 0;
        }
    }

    /**
     * @param list
     * @return the number of even items in the list
     * return 0 if list is null or empty
     */
    public static int countEven(ArrayList<Integer> list) {
        //to be completed
        if (list != null && list.size() != 0) {
            int c = 0;
            for (Integer i : list) {
                if (i % 2 == 0) {
                    c++;
                }
            }
            return c;
        } else {
            return 0;
        }
    }

    /**
     * @param list
     * @param target
     * @return the number of times target exists in the list
     * return 0 if list is null or empty
     */
    public static int count(ArrayList<Integer> list, int target) {
        //to be completed
        int c = 0;
        if (list != null && list.size() != 0) {
            for (Integer i : list) {
                if (i == target) {
                    c++;
                }
            }
            return c;
        } else {
            return 0;
        }
    }

    /**
     * @param list
     * @param low
     * @param high (assume low <= high)
     * @return the number of items in the list that belong to the range [low ... high]
     * return 0 if list is null or empty
     */
    public static int countInRange(ArrayList<Integer> list, int low, int high) {
        //to be completed
        if (list != null && list.size() != 0) {
            int c = 0;
            for (Integer i : list) {
                if (i >= low && i <= high) {
                    c++;
                }
            }
            return c;
        } else {
            return 0;
        }
    }

    /**
     * @param list
     * @param low
     * @param high (assume low <= high)
     * @return true if there is at least one item in the list that is in the range [low ... high]
     * return false if list is null or empty
     */
    public static boolean containsInRange(ArrayList<Integer> list, int low, int high) {
        //to be completed
        if (list != null && list.size() != 0) {
            for (Integer i : list) {
                if (i >= low && i <= high) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * @param list
     * @param low
     * @param high (assume low <= high)
     * @return true if all the items in the list are in the range [low ... high]
     * return false if list is null
     * return true if the list is empty
     */
    public static boolean allInRange(ArrayList<Integer> list, int low, int high) {
        //to be completed
        if (list != null && list.size() != 0) {
            for (Integer i : list) {
                if (i < low || i > high) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param list
     * @return the number of prime numbers in the list
     * return 0 if list is null or empty
     * <p>
     * IMPORTANT: you can (and should) use the helper
     * method isPrime(int)
     */
    public static int countPrimes(ArrayList<Integer> list) {
        //to be completed
        int c = 0;
        if (list != null && list.size() != 0) {
            for (Integer i : list) {
                if (isPrime(i)) {
                    c++;
                }
            }
            return c;
        } else {
            return 0;
        }
    }

    /**
     * DO NOT MODIFY
     * Helper for countPrimes
     *
     * @param n
     * @return true if the integer passed is a prime number
     */
    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param list
     * @return true if there is at least one prime number in the list, false otherwise
     * return false if list is null or empty
     */
    public static boolean containsPrime(ArrayList<Integer> list) {
        //to be completed
        if (list != null && list.size() != 0) {
            for (Integer i : list) {
                if (isPrime(i)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    /**
     * @param list
     * @return true if all the items in the list are prime numbers, false otherwise
     * return false if list is null
     * return true if the list is empty (because technically, every item in the list IS prime)
     */
    public static boolean allPrimes(ArrayList<Integer> list) {
        //to be completed
        if (list != null) {
            for (Integer i : list) {
                if (!isPrime(i)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param list
     * @return number of rectangles in the list that are squares
     * (you can, and should invoke, the instance method isSquare() in class Rectangle)
     * return 0 if list is null or empty
     * <p>
     * TIP: using the enhanced for loop will make your life much easier!
     */
    public static int countSquares(ArrayList<Rectangle> list) {
        //to be completed
        int c = 0;
        if (list != null && list.size() != 0) {
            for (Rectangle rectangle : list) {
                if (rectangle.isSquare()) {
                    c++;
                }
            }
            return c;
        } else {
            return 0;
        }
    }

    /**
     * change each item of the list to its square.
     * <p>
     * if list is null or empty, do nothing
     * <p>
     * TIP: use set and get methods.
     *
     * @param list For example,
     *             <p>
     *             if list = [3,0,-2,6], it should become [9, 0, 4, 36]
     */
    public static void squareUp(ArrayList<Integer> list) {
        //to be completed
        if (list != null && list.size() != 0) {
            for (int i=0 ; i<list.size(); i++) {
                list.set(i, list.get(i) * list.get(i));
            }
        }
    }
}
