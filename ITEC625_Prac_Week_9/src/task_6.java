import java.util.ArrayList;

public class task_6 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add((char) 2);
        list.add();
        list.add("d");
        list.add("gt");
        System.out.println(toArray(list));
    }

    public static char[] toArray(ArrayList<Character> list) {
        if (list == null || list.size() == 0) {
            return null;
        } else {
            char[] result = new char[list.size()];
            int i = 0;
            for (Character item :list){
                result[i] = item;
                i++;
            }
            return result;
        }
    }
}