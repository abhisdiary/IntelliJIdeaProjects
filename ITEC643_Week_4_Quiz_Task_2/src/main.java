import java.util.Arrays;
import java.util.Scanner;
/*
* Author Abhijeet Roy
* This code has been writen to calculate the value of the Cryptography Quiz of (Week 3)
* This is about to shift the bits to the right.
*/
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Bit Sequence: ");
        String str_input = sc.nextLine();
        System.out.print("Please enter the total Rotation Number: ");
        int total_rotation = sc.nextInt();


        char[] char_input = str_input.toCharArray();
        int[] bit_list = new int[char_input.length];
        for (int i = 0; i < char_input.length; i++) {
            bit_list[i] = Integer.parseInt(String.valueOf(char_input[i]));
        }

        int[] last_bit_array = new int[total_rotation]; //the sequence of bits of the last location of the array
        int[] first_bit_array = new int[total_rotation]; //the sequence of bits of the last location of the array

        // Starting XOR-ing for given number of rotations
        for (int i = 0; i < total_rotation; i++) {

            //XOR-ing
            int first_bit = ((bit_list[bit_list.length - 1] ^ bit_list[bit_list.length - 3]) ^ bit_list[bit_list.length-4]) ^ bit_list[bit_list.length-6];
            first_bit_array[i] = first_bit;

            //right shifting the array by 1-bit
            for (int pos = bit_list.length-1; pos > 0; pos--) {
                bit_list[pos] = bit_list[pos - 1];
            }
            bit_list[0] = first_bit;
            last_bit_array[i] = bit_list[bit_list.length - 1];
        }
        System.out.print("16th Digit Sequence is: ");
        System.out.println(Arrays.toString(last_bit_array));
        System.out.print("First Digit Sequence is: ");
        System.out.println(Arrays.toString(first_bit_array));
    }
}
