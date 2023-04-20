package flow_control;

public class Solution1 {
    public static void main(String[] args) {
        int age;
        age = (int)(Math.random()*100)+1;
        System.out.println("age = " + age);
        if(age>=60){
            System.out.println("you are old");
        } else if (age>=20){
            System.out.println("you are adult");
        } else if (age>=13){
            System.out.println("you are teenager");
        } else {
            System.out.println("you are child");
        }
    }
}
