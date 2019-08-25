import java.util.ArrayList;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(.5);
        list.add(3.6);
        list.add(4.3);
        list.add(9.4);
        System.out.println(product(list));
    }

    public static double product(ArrayList<Double> list) {
        if (list == null || list.size() == 0) {
            return 0;
        } else {
            double product = 1;
            for (Double l : list) {
                product *= l;
            }
            return product;
        }
    }
}
