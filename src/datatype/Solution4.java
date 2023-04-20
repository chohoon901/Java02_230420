
package datatype;

import java.util.ArrayList;

public class Solution4 {
    public static void main(String[] args) {
        ArrayList<String> langList = new ArrayList<>();
        langList.add("java");
        langList.add("python");
        langList.add("c");
        langList.add("c++");
        langList.add("c+++");
        System.out.println("langList = " + langList);
        
        ArrayList<Language> langList2 = new ArrayList<>();
        langList2.add(Language.JAVA);
        langList2.add(Language.PYTHON);
        langList2.add(Language.C);
        langList2.add(Language.CPP);
        System.out.println("langList2 = " + langList2);
        
    }
}

enum Language{
    JAVA, PYTHON, C, CPP
} // 내가 정한 언어들의 묶음
