/**
 * Best case O(n), worst case O(n^2)
 */
public class main {
    public static void main(String[] args) {

    }

    int foo(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                for (int k = 0; k < a.length; k++) {
                    result += a[k];
                }
            }
        }
        return result;
    }

}
