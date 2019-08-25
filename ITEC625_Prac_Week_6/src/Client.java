import java.util.Arrays;

public class Client {

	public static void main(String[] args) {
		System.out.println(AllInOne.getLastItem(new int[] {10,70,20,90}));
		System.out.println(AllInOne.getLastItem(new int[] {}));
		System.out.println(AllInOne.getLastItem(null));
		System.out.println(AllInOne.addAllBut(new int[] {10,90,90,70,90,20,90}, 90));
		System.out.println(AllInOne.getMinItemIndex(new int[] {10,70,20,90}, 0, 3));
		System.out.println(AllInOne.getMinItemIndex(new int[] {10,70,20,90}, 1, 3));		
		System.out.println(AllInOne.	countCommonItems(new int[] {10,70,20,90}, new int[] {40,20,10,90,30}, new int[] {40,70,10,20,50,60}));
		System.out.println(AllInOne.	vlookup(new int[] {10,70,20,90}, 2, new int[] {40,70,10,50,60,20}));
		int[] a = {37, 92, 19, 65, 0};
		int[] b = {2, 1, 0, 0, 4};
		AllInOne.leftShift(a, b);
		System.out.println(Arrays.toString(a));
	
		int[] arr1 = {10,70,20,90,80};
		int[] arr2 = {40,30,20,60,10,80};
		int[] arr3 = {10,20,50,60,70};
		int[] result = AllInOne.twoOutOfThree(arr1, arr2, arr3);
		System.out.println(Arrays.toString(result));
		
		
	}
}