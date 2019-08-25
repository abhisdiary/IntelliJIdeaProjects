import java.util.ArrayList;

public class task_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-5);
        list.add(8);
        list.add(-6);
        System.out.println(sumPositive(list));
    }

    public static int sumPositive(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return 0;
        } else {
            int sum = 0;
            for (Integer integer : list) {
                if (integer > 0) {
                    sum += integer;
                }
            }
            return sum;
        }
    }
}