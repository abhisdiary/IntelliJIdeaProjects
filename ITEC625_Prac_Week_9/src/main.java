import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> arr_list = new ArrayList<>();
        arr_list.add("hello");
        arr_list.add("this");
        arr_list.add("is");
        arr_list.add("your");
        arr_list.add("captain");
        arr_list.add("speaking");
        arr_list.remove(4);
        arr_list.add(4, "brother");
        arr_list.set(5, "talking");
        System.out.println("k) Total Items in the list: " + arr_list.size());
        System.out.print("l) Printing in same line: ");
        for (String s : arr_list) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("m) Printing in New line: ");
        for (String s : arr_list) {
            System.out.println(s);
        }
        int loc = arr_list.indexOf("brother");
        System.out.println(loc);
        System.out.println("o) Printing the first character of each element: ");
        for (String s : arr_list) {
            System.out.println(s.charAt(0));
        }
        System.out.print("p) Printing the String created with the first character of each elements: ");
        String str = "";
        for (String s : arr_list) {
            str += s.charAt(0);
        }
        System.out.println(str);
        System.out.print("q) Count of words begin with t or T: ");
        int count1 = 0;
        for (String s : arr_list) {
            String str1 = "t";
            String str2 = "T";
            char str3 = s.charAt(0);
            if (str1.charAt(0) == str3 || str2.charAt(0) == str3) {
                count1++;
            }
        }
        System.out.println(count1);
        System.out.print("r) Count of words with length more than 3: ");
        int count2 = 0;
        for (String s : arr_list) {
            if (s.length() > 3) {
                count2++;
            }
        }
        System.out.println(count2);
        System.out.print("s) Display the words with length more than 3 : ");
        String words = "";
        ArrayList<String> arr_list2 = new ArrayList<>(); // Another way
        for (String s : arr_list) {
            if (s.length() > 3) {
                words += s + " ";
                arr_list2.add(s); // Another way
            }
        }
        System.out.println(words);
        System.out.print("t) Printing the Strings created with the last character of each elements: ");
        char[] char_arr = new char[arr_list.size()];
        for (int i=0; i<arr_list.size(); i++) {
            char_arr[i] = arr_list.get(i).charAt(arr_list.get(i).length() - 1);
        }
        System.out.println(char_arr);

        System.out.print("u) Replace each item by their uppercase version: ");
        for (int i=0; i<arr_list.size(); i++) {
            arr_list.set(i, arr_list.get(i).toUpperCase());
        }
        System.out.println(arr_list);
    }
}
