
package datatype;

public class Solution5 {
    public static void main(String[] args) {
        String str = "100";
        System.out.println("str.getClass() = " + str.getClass());
        int num = Integer.parseInt(str);
        System.out.println("num = " + num);

        System.out.println("Integer.parseInt(\"-100\") = " + Integer.parseInt("-100"));
        int num2 = Integer.parseInt("-100");
        System.out.println("num2 + 100 = " + (num2 + 100));
        System.out.println("Double.parseDouble(\"-100.5\") = " + Double.parseDouble("-100.5"));
        double num3  = Double.parseDouble("100.5");
        System.out.println("num3 + 100 = " + (num3 + 100));

//        System.out.println("Integer.parseInt(\"hundred\") = " + Integer.parseInt("hundred"));

        int num4 = 200;
        System.out.println("num4.toString()= " + new Integer(num4).toString());

        String str2 = "200";
        int num5 = 300;
        System.out.println("(double)num5 = " + (double)num5);

        double num6 = 300;
        System.out.println("(int)num6 = " + (int)num6);

    }
}
