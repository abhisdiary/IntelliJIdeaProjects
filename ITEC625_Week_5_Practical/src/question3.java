import java.util.Arrays;

public class question3 {
    public static void main(String[] args) {
        int[] arr = new int[8];
        System.out.println("Declare array: arr[] is: " + Arrays.toString(arr));
        System.out.println("Length of Array is: " + arr.length);

        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println("========== Loop 1, Step " + (i + 1) + " : ==========");
            System.out.println("i = " + i + ", which is < " + arr.length / 2);
            arr[i] = 2 * i + 1;
            System.out.println("Value of arr[i] = 2*i+1 becomes: arr[" + i + "]: " + arr[i]);
            System.out.println();
        }

        System.out.println("After 1st loop, the arr[] is: " + Arrays.toString(arr));
        System.out.println("====================================");

        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.println("========== Loop 2, Step " + (i + 1) + " : ==========");
            System.out.println("i = " + i + ", which is < " + arr.length / 2);
            arr[i] = 2 * (arr.length - i) - 1;
            System.out.println("Value of arr[i] = 2*(arr.length-i)-1 becomes: arr[" + i + "]: " + arr[i]);
            System.out.println();
        }
        System.out.println("After 1st loop, the arr[] is: " + Arrays.toString(arr));
    }
}
