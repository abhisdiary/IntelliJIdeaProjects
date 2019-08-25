

public class main_class {
    /**+
     * In this task you are given an array of random numbers that will be generated every time you run the program.
     * Your task is to find all the sequence(s) of the repeated numbers and print the series after encapsulating all those in between ().
     * For example: you are given this integer array [0, 7, 7, 1, 2, 0, 5, 1, 7, 4, 2, 8, 9, 1, 2, 8, 1, 1, 1, 6]
     * Your output string would be: 0 ( 7 7 ) 1 2 0 5 1 7 4 2 8 9 1 2 8 ( 1 1 1 ) 6
     */

    public static void main(String[] args) {
        int [] given_list = generate_random_numbers(0, 9, 20);
        for (int i : given_list) {
            System.out.print(i + " ");
        }
    }

    /**
     * This following method generate_random_numbers generates an array of random integers and returns it.
     * @param min = minimum value of the number range
     * @param max = maximum value of the number range
     * @param length = length of the integer list
     * @return array
     */
    public static int[] generate_random_numbers(int min, int max, int length) {
        int [] random_array = new int[length];
        for (int i = 0; i < length; i++) {
            random_array[i] = min + (int)(Math.random() * ((max - min) + 1));
        }
        return random_array;
    }
}
