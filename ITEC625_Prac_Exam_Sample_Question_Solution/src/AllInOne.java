import java.util.Arrays;

public class AllInOne {
	/**
	 * DIFFICULTY LEVEL 0
	 * @param n
	 * @return true if the number is positive (more than 0), false otherwise
	 */
	public static boolean isPositive(int n) {
		if(n > 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * DIFFICULTY LEVEL 1
	 * @param n
	 * @return true if the number is even, false otherwise
	 */
	public static boolean isEven(int n) {
		if(n%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * DIFFICULTY LEVEL 2
	 * @param a
	 * @param b
	 * @param c
	 * @return the highest of the three numbers. 
	 * you cannot use Math library
	 */
	public static int highest(int a, int b, int c) {
		if(a >= b && a >= c) {
			return a;
		}
		if(b >= c) {
			return b;
		}
		return c;
	}

	/**
	 * DIFFICULTY LEVEL 3
	 * @param n > 0
	 * @return number of digits in n
	 * You cannot use Math library or convert integer to String
	 * for example,
	 * if n = 1729, return 4
	 * if n = 819357, return 6 
	 */
	public static int nDigits(int n) {
		int c = 0;
		while(n!=0) {
			c++;
			n/=10;
		}
		return c;
	}

	/**
	 * DIFFICULTY LEVEL 5
	 * @param n assume n is a perfect square (that is, square of an integer)
	 * @return the positive square root of n
	 * You cannot use Math library
	 * for example,
	 * if n = 25, return 5
	 * if n = 36, return 6
	 * if n = 10000, return 100
	 */
	public static int root(int n) {
		int i = 0;
		while(i*i < n) {
			i++;
		}
		return i;
	}

	/**
	 * DIFFICULTY LEVEL 4
	 * @param a
	 * @return sum of the first and the last numbers in the array.
	 * if the array is empty, return 0
	 * if the array contains only one number, that number should be returned.
	 * for example,
	 * if a = {12, 25}, return 37
	 * if a = {4, 1, 0, 9}, return 13
	 * if a = {15}, return 15
	 * if a = {}, return 0
	 */
	public static int sumFirstLast(int[] a) {
		if(a.length == 0)
			return 0;
		if(a.length == 1)
			return a[0];
		return a[0] + a[a.length - 1];
	}

	/**
	 * DIFFICULTY LEVEL 4
	 * @param a
	 * @return number of negative (less than 0) items in the array
	 */
	public static int countNegatives(int[] a) {
		int count = 0;
		for(int i=0; i < a.length; i++) {
			if(a[i] < 0) {
				count++;
			}
		}
		return count;
	}

	/**
	 * DIFFICULTY LEVEL 6
	 * @param a
	 * @return true if all items in the array are negative (less than 0), false otherwise
	 */
	public static boolean allNegatives(int[] a) {
		for(int i=0; i < a.length; i++) {
			if(a[i] >= 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * DIFFICULTY LEVEL 4
	 * @param a
	 * @param item
	 * @return first index at which item exists in the array. 
	 * return -1 if it doesn't exist in the array.
	 */
	public static int indexOf(int[] a, int item) {
		for(int i=0; i < a.length; i++) {
			if(a[i] == item) {
				return i;
			}
		}
		return -1;

	}

	/**
	 * DIFFICULTY LEVEL 7
	 * @param a
	 * @param b
	 * @return true if the two arrays are identical, false otherwise
	 */
	public static boolean areIdentical(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i=0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * DIFFICULTY LEVEL 8
	 * @param arr
	 * @param n
	 * @return an array containing all items in arr that are multiples of n
	 * for example,
	 * if a = {8, 7, -12, 5, 3, 0} and n = 4, return {8, -12, 0}
	 */
	public static int[] getMultiples(int[] arr, int n) {
		int c = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i]%n==0) {
				c++;
			}
		}
		int[] result = new int[c];
		int k = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i]%n==0) {
				result[k] = arr[i];
				k++;
			}
		}
		return result;
	}

	/**
	 * DIFFICULTY LEVEL 9
	 * @param a each item is between 0 and 9
	 * @return the item that occurs the most number of times
	 * for example,
	 * if a = {2,1,6,3,2,7,1,5,4,0,2,9,4,8,7,2,5}, return 2 as it occurs the most times
	 */
	public static int getMostFrequentItem(int[] a) {
		int[] freq = new int[10];
		for(int i=0; i < a.length; i++) {
			freq[a[i]]++;
		}
		int result = 0;
		for(int i=1; i < freq.length; i++) {
			if(freq[i] > freq[result]) {
				result = i;
			}
		}
		return result;
	}

	/**
	 * DIFFICULTY LEVEL 10 (this will be worth 1 out of 100 marks
	 * and purely for students who DEMAND something more challenging)
	 * @param data
	 * @return the longest sequence of items that occurs
	 * more than once in the array
	 * Examples:
	 * if data = {1,7,2,9,3,8,7,2,9,8,7,1,7,2,3,8,7,2,9,6,1,1,5,9}
	 * return the array {3,8,7,2,9}
	 * if data = {1,2,1,2,1,2,1,2,1,2,1,2}
	 * return the array {1,2,1,2,1,2,1,2,1,2}
	 * if data = {5,6,7,8,9}
	 * return the array {}
	 * if data = {5,6,7,5,7,6,8,5,9}
	 * return the array {}
	 */
	public static int[] longestRecurringSequence(int[] data) {
		for(int i=data.length-1; i>=1; i--) {
			for(int k=0; k < data.length - i + 1; k++) {
				int[] temp = get(data, k, k+i-1);
				if(indexOf(data, temp) != lastIndexOf(data, temp)) {
					return temp;
				}
			}
		}
		return new int[] {};
	} //closing bracket for method - DO NOT REMOVE

	public static int[] get(int[] data, int start, int end) {
		int[] result = new int[end-start+1];
		for(int i=0; i < result.length; i++) {
			result[i] = data[start+i];
		}
		return result;
	}

	public static boolean equals(int[] a, int [] b) {
		if(a.length != b.length)
			return false;
		for(int i=0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static int indexOf(int[] data, int[] sub) {
		if(sub.length > data.length)
			return -1;
		for(int i=0; i < data.length - sub.length + 1; i++) {
			int[] temp = get(data, i, i + sub.length - 1);
			if(equals(sub, temp)) {
				return i;
			}
		}
		return -1;
	}

	public static int lastIndexOf(int[] data, int[] sub) {
		if(sub.length > data.length)
			return -1;
		for(int i=data.length - sub.length; i >= 0; i--) {
			int[] temp = get(data, i, i + sub.length - 1);
			if(equals(sub, temp)) {
				return i;
			}
		}
		return -1;
	}
}
