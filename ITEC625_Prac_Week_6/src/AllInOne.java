public class AllInOne {
    /**
     * @param arr
     * @return the last item in the array.
     * return null if array is null or empty
     */
    public static Integer getLastItem(int[] arr) {
        if (arr != null && arr.length != 0) {
            return arr[arr.length - 1];
        } else return null;
    }

    /**
     * @param arr
     * @param except: item to be excluded
     * @return sum of all the items in the
     * array except item to be excluded
     */
    public static int addAllBut(int[] arr, int except) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != except) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /**
     * @param arr
     * @param start: starting index
     * @param end:   ending index
     *               assume 0 <= start < arr.length
     *               assume 0 <= end < arr.length
     *               assume start <= end
     * @return index of the smallest
     * item in the index range [start, end]
     */
    public static int getMinItemIndex(int[] arr, int start, int end) {
        int smValue = arr[0];
        int smIndex = 0;
        for (int i = start; i <= end; i++) {
            if (smValue < arr[i]) {
                smValue = arr[i];
                smIndex = i;
            }
        }
        return smIndex;
    }

    /**
     * @param a: assume every item occurs once
     * @param b: assume every item occurs once
     * @param c: assume every item occurs once
     * @return number of items that exist
     * in all three arrays
     */
    public static int countCommonItems(int[] a, int[] b, int[] c) {
        int totalMatch = 0;
        for (int i = 0; i < a.length; i++) {
            if (contains(b, a[i]) && contains(c, a[i])) {
                totalMatch++;
            }
        }
        return totalMatch;
    }

    public static boolean contains(int[] data, int item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                return true;
            }
        }
        return false;
    }

    //helper to countCommonItems

    /**
     * @param a
     * @param idx: index of item in array
     *             source (assume 0 <= idx < source.length)
     * @param b
     * @return index (in array dest) of
     * item at index idx (in array source).
     * return -1 if item doesn't exist in dest
     */
    public static int vlookup(int[] a, int idx, int[] b) {
        int index = -1;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a[idx]) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * @param data
     * @param nBits, assume nBits.length == data.length
     *               modify the array data such that each
     *               item is left shifted by
     *               corresponding number of bits from
     *               array nBits
     *               NOTE: assume each item of nBits is non-negative
     */
    public static void leftShift(int[] data, int[] nBits) {
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] << nBits[i];
        }
        //to be completed
    }

    /**
     * @param a: assume every item occurs once
     * @param b: assume every item occurs once
     * @param c: assume every item occurs once
     * @return: array containing items that
     * occur in exactly two of the three arrays
     */
    public static int[] twoOutOfThree(int[] a, int[] b, int[] c) {

        String strArr = "";
        for (int i = 0; i < a.length; i++) {
            if (contains(b, a[i]) && !contains(c, a[i])) {
                strArr += a[i];
            }
        }
        char[] charArr = strArr.toCharArray();
        int[] intArr = new int[charArr.length];
        for (int i = 0; i < intArr.length; i++) {

            intArr[i] = (int)intArr[i] - 48;
        }
        return intArr;
    }
}
