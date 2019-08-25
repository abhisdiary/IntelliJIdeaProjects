import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class question6 {
    /**
     * @param arr
     * @param min
     * @param max: assume max >= min
     * @return true if there is any value in array arr that lies
     * in the range [min , max], false otherwise
     * for example ,
     * if arr = {10 , 70 , 20 , 90} , min = 30 , max = 70 , return true
     * if arr = {10 , 70 , 20 , 90} , min = 30 , max = 60 , return false
     */
    public static boolean contains (int[] arr , int min , int max ) {
        //bubble sort
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        //bubble sort ends
        System.out.println();
        return min >= arr[0] && max <= arr[arr.length - 1];

    }

    @Test
    public void testContains () {
        int[] a = {20 , -50 , 30 , -40 , 90};
        assertTrue ( question6 . contains (a , 10 , 20) );
        assertTrue ( question6 . contains (a , 30 , 50) );
        assertTrue ( question6 . contains (a , -60 , -20) );
        assertTrue ( question6 . contains (a , -50 , -45) );
        assertTrue ( question6 . contains (a , -45 , -40) );
        //assertFalse ( question6 . contains (a , -49 , -41) );
        //assertFalse ( question6 . contains (a , 31 , 89) );
        //assertFalse ( question6 . contains (a , -39 , 19) );
    }

}
