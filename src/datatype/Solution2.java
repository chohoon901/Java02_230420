
package datatype;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution2 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;

        int[] intArray2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(intArray2));

        System.out.println(intArray2.length);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>(10);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        list.set(0, 100);
        System.out.println(list.get(0));
        list.remove(0);
        System.out.println(list.get(0));

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("list3 = " + list3);

        String str2 = String.join(" ", "Hello", "World");
        System.out.println("str2 = " + str2);
        String str3 = String.join(" ", str2);
        System.out.println("str3 = " + str3);

        String str4 = "Hello World";
        System.out.println(str4.length());
        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(1));
        System.out.println(str4.charAt(2));
        System.out.println(str4.charAt(3));
        System.out.println(str4.charAt(4));

        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        list5.sort(null);
        System.out.println("list5 = " + list5);
        System.out.println("list = " + list);
        list.sort(Comparator.naturalOrder());
        System.out.println("list = " + list);
        list.sort(Comparator.reverseOrder());
        System.out.println("list = " + list);

        list5.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) (Math.random() * 3) - 1;
            }
        });
        System.out.println("list5 : random = " + list5);

    }
}
