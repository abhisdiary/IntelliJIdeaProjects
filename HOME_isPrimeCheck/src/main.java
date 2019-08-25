import java.util.Scanner;

/*
 * Author: Abhijeet Roy
 * This program takes an input from the user and checks if it is prime or not.
 * */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Digit that you want to check: ");
        int input_number = (int) sc.nextDouble();
        int half_of_number = input_number / 2;
        boolean flag = true;
        // if the input number is 1 or 0 check
        if (input_number != 0 && input_number != 1) {
            for (int i = 2; i <= half_of_number; i++) {
                if (input_number % i == 0) {
                    System.out.println("The number is NOT a Prime Number, because it's 2nd factor is: " + i + ", after 1");
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("The number is a Prime Number, because there is no factor of " + input_number + " other than 1 and " + input_number);
            }
        } else {
            System.out.println("According to the definition: A prime number is a whole number greater than 1 whose only factors are 1 and itself. \nSo your input " + input_number + " is invalid");
        }
    }
}
