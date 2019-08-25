import java.util.Arrays;

public class question4 {
    public static void main(String[] args) {
        int[] arr = {12, 30, 8, 2, 7, 15};
        System.out.println("Declare array: arr[] is: " + Arrays.toString(arr));
        System.out.println("Length of Array is: " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("========== Loop 1, Step " + (i + 1) + " : ==========");

            int dodo = i;
            System.out.println("dodo: " + dodo);

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < arr[dodo]) {
                    dodo = k;
                }
            }
            int temp = arr[i];
            arr[i] = arr[dodo];
            arr[dodo] = temp;
//arr = ???
        }
    }
}
