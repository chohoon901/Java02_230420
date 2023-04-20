
package datatype;

import java.text.MessageFormat;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        String name = "John";
        String name2 = new String("John");
        System.out.println(name == name2); // 주소값을 비교하기 때문에 일치하지 않음
        String name3 = "John";
        System.out.println(name == name3); // "John" 이 즐겨찾기 되있기 때문
        // new로 생성자를 만들면 반드시 다른 주소를 가짐

        System.out.println("name.equals(name2) = " + name.equals(name2));
        System.out.println("name.contains(J) = " + name.contains("J"));
        String[] names = name.split("");
        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        String str = String.format("name = %s", name);
        System.out.println("str = " + str);
        String str2 = MessageFormat.format("","name = {0}",name);
        System.out.println("str2 = " + str2);
    }
}
