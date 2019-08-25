import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] data = new int[3]; //declaring the array

        System.out.print("Enter a Negative Integer: ");
        int temp = sc.nextInt();
        if (temp < 0) {
            data[0] = temp;
            System.out.print("Your entered value: " + data[0] + " is saved.");
        } else {
            System.out.println("You have entered a positive number instead of negative.");
        }

    }
}
