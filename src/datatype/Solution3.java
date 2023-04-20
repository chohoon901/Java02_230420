
package datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution3 {
    public static void main(String[] args) {
        // Map <- Dictionary

        HashMap<String, String> map = new HashMap<>();
        //map의 CRUD

        map.put("name", "kim");
        map.put("age", "20");
        map.put("gender", "male");
        map.put("address", "seoul");
        map.put("phone", "010-1234-5678");

        System.out.println("map = " + map);

        String name = map.get("name");
        System.out.println("name = " + name);

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("age");
        System.out.println("map = " + map);

        HashMap<String, String> map2 = new HashMap<>(map);
        System.out.println("map2 = " + map2);
        map2.clear();
        System.out.println("map2 = " + map2);

        System.out.println("map.size() = " + map.size());

        System.out.println("map.keySet() = " + map.keySet());
        System.out.println("map.values() = " + map.values());

        System.out.println("map.entrySet() = " + map.entrySet());

        System.out.println("map.containsKey(\"name\") = " + map.containsKey("name"));
        System.out.println("map.containsValue(\"kim\") = " + map.containsValue("kim"));

        System.out.println("map.containsKey(\"name\") = " + map.containsKey("names"));
        System.out.println("map.containsValue(\"kim\") = " + map.containsValue("park"));

        // LinkedHashMap
        // LinkedHashMap 만드는 코드
        // import java.util.LinkedHashMap;
//        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        // often use hashmap methods
        // put(key, value) - CREATE -
        // get(key) - READ -
        // remove(key) - DELETE -
        // clear() -
        // size() -
        // containsKey() -
    }
}
