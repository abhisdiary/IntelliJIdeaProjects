public class AllInOne {
    /**
     * DIFFICULTY LEVEL 0
     *
     * @param n
     * @return true if the number is positive (more than 0), false otherwise
     */
    public static boolean isPositive(int n) {
        return n > 0;
    }

    /**
     * DIFFICULTY LEVEL 1
     *
     * @param n
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    /**
     * DIFFICULTY LEVEL 2
     *
     * @param a
     * @param b
     * @param c
     * @return the highest of the three numbers.
     * you cannot use Math library
     */
    public static int highest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else
            return c;
    }

    /**
     * DIFFICULTY LEVEL 3
     *
     * @param n > 0
     * @return number of digits in n
     * You cannot use Math library or convert integer to String
     * for example,
     * if n = 1729, return 4
     * if n = 819357, return 6
     */
    public static int nDigits(int n) {
        int c = 0;
        while (n != 0) {
            n = n / 10;
            c= c+1;
        }
        return c;
    }

    /**
     * DIFFICULTY LEVEL 5
     *
     * @param n assume n is a perfect square (that is, square of an integer)
     * @return the positive square root of n
     * You cannot use Math library
     * for example,
     * if n = 25, return 5
     * if n = 36, return 6
     * if n = 10000, return 100
     */
    public static int root(int n) {
        int root = 0;
        if (n == 0 || n == 1) {
            return n;
        } else {
            int x = n / 2;
            for (root = 2; root <= x; root++) {
                if (root * root == n) {
                    break;
                }
            }
            return root;
        }
    }

    /**
     * DIFFICULTY LEVEL 4
     *
     * @param data
     * @return sum of the first and the last numbers in the array.
     * if the array is empty, return 0
     * if the array contains only one number, that number should be returned.
     * for example,
     * if data = {12, 25}, return 37
     * if data = {4, 1, 0, 9}, return 13
     * if data = {15}, return 15
     * if data = {}, return 0
     */
    public static int sumFirstLast(int[] data) {
        if (data == null) {
            return 0;
        } else if (data.length == 1) {
            return data[0];
        } else {
            return data[0] + data[data.length - 1];
        }
    }

    /**
     * DIFFICULTY LEVEL 4
     *
     * @param data
     * @return number of negative (less than 0) items in the array
     */
    public static int countNegatives(int[] data) {
        int negative_items = 0;
        for (int c = 0; c < data.length; c++) {
            if (data[c] < 0) {
                negative_items++;
            }
        }
        return negative_items;
    }

    /**
     * DIFFICULTY LEVEL 6
     *
     * @param data
     * @return true if all items in the array are negative (less than 0), false otherwise
     */
    public static boolean allNegatives(int[] data) {
        boolean allNeg = true;
        for (int c = 0; c < data.length; c++) {
            if (data[c] >= 0) {
                allNeg = false;
            }
        }
        return allNeg;
    }

    /**
     * DIFFICULTY LEVEL 4
     *
     * @param data
     * @param item
     * @return first index at which item exists in the array.
     * return -1 if it doesn't exist in the array.
     */
    public static int indexOf(int[] data, int item) {
        int i = -1;
        for (int c = 0; c < data.length; c++) {
            if (data[c] == item) {
                i = c;
                break;
            }
        }
        return i;
    }

    /**
     * DIFFICULTY LEVEL 7
     *
     * @param a
     * @param b
     * @return true if the two arrays are identical, false otherwise
     */
    public static boolean areIdentical(int[] a, int[] b) {
        boolean areIdentical = true;
        if (a.length == b.length) {
            for (int c = 0; c < a.length; c++) {
                if (a[c] != b[c]) {
                    areIdentical = false;
                    break;
                }
            }
        } else areIdentical = false;
        return areIdentical;
    }

    /**
     * DIFFICULTY LEVEL 8
     *
     * @param data
     * @param n
     * @return an array containing all items in data that are multiples of n
     * for example,
     * if data = {8, 7, -12, 5, 3, 0} and n = 4, return {8, -12, 0}
     */
    public static int[] getMultiples(int[] data, int n) {
        Integer[] newData = new Integer[data.length];
        int totalMultiples = 0;
        for (int c = 0; c < data.length; c++) {
            if (data[c] % n == 0) {
                newData[c] = data[c];
                totalMultiples++;
            }
        }
        int[] returnData = new int[totalMultiples];
        int d = 0;
        for (int c = 0; c < newData.length; c++) {
            if (newData[c] != null) {
                returnData[d] = newData[c];
                d++;
            }
        }

        return returnData;
    }

    /**
     * DIFFICULTY LEVEL 9
     *
     * @param data each item is between 0 and 9
     * @return the item that occurs the most number of times
     * for example,
     * if data = {2,1,6,3,2,7,1,5,4,0,2,9,4,8,7,2,5}, return 2 as it occurs the most times
     */
    public static int getMostFrequentItem(int[] data) {
        int[] comparingArray = {0, 0};
        int mostOccurrence = 0;
        int currentDigit = 0;
        int lastDigit = 9;

        for (int c = 0; c <= comparingArray.length; c++) {
            if (c > 1) { //This will start executing when the 2 fields of comparingArray are calculated.
                if (comparingArray[1] > comparingArray[0]) {
                    comparingArray[0] = comparingArray[1];
                    mostOccurrence = currentDigit - 1;
                    c--;
                    comparingArray[c] = 0;
                } else {
                    c--;
                    comparingArray[c] = 0;
                }
            }
            for (int eachValueOfData : data) {
                if (eachValueOfData == currentDigit) {
                    comparingArray[c]++;
                }
            }
            if (currentDigit == lastDigit) {
                break;
            } else
                currentDigit++;
        }
        return mostOccurrence;
    }

    /**
     * DIFFICULTY LEVEL 10 (this will be worth 1 out of 100 marks
     * and purely for students who DEMAND something more challenging)
     *
     * @param data
     * @return the longest sequence of items that occurs
     * more than once in the array. return the array that occurs first
     * in case of a tie.
     * Examples:
     * if data = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9}
     * return the array {3,8,7,2,9}
     * if data = {1,2,1,2,1,2,1,2,1,2,1,2}
     * return the array {1,2,1,2,1,2}
     * if data = {5,6,7,8,9}
     * return the array {}
     * if data = {5,6,7,5,7,6,8,5,9}
     * return the array {}
     */
    public static int[] longestRecurringSequence(int[] data) {

        Integer[] match0 = new Integer[10];

        int pointer = 0;
        int charCountWithPointer = 0;
        for (int c = 0; c < data.length; c++) {
            int tempC = c;
            for (int d = c + 1; d < data.length; d++) {
                if (data[tempC] == data[d]) {
                    pointer = tempC;
                    charCountWithPointer++;
                    match0[tempC] = data[tempC];
                    tempC++;
                } else {

                }
            }
        }


        return null; //to be completed
    }
}
