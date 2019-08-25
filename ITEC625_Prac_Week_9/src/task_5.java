import java.util.ArrayList;

public class task_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(-5);
        list.add(8);
        list.add(-6);
        System.out.println(count(list, 8));
    }

    public static int count(ArrayList<Integer> list, Integer target) {
        if (list == null || list.size() == 0) {
            return 0;
        } else {
            int count = 0;
            for (Integer integer : list) {
                if (integer == target) {
                    count++;
                }
            }
            return count;
        }
    }
}