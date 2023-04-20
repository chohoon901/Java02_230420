package flow_control;

public class Solution2 {
    public static void main(String[] args) {
        int a;
        // 1부터 5사이의 값이 임의로 주어지는 a값을 초기화
        a = (int) (Math.random() * 5) + 1;
        System.out.println("a = " + a);
        // switch로 1,2,3을 만들고 a=1, a=2, a=3을 출력해줘
        switch (a) {
            case 1:
                System.out.println("a=1");
                break;
            case 2:
                System.out.println("a=2");
                break;
            case 3:
                System.out.println("a=3");
                break;
            default:
                System.out.println("a!=1,2,3");
                break;
        }
        // python, java, c, cpp 의 배열 langs를 만들어줘
        String[] langs = {"python", "java", "c", "cpp"};
        String lang = langs[(int)(Math.random() * langs.length)];
        System.out.println("lang = " + lang);
        // switch로 python, java, c, cpp 코딩
        switch (lang) {
            case "python":
                System.out.println("lang is python");
                break;
            case "java":
                System.out.println("lang is java");
                break;
            case "c":
                System.out.println("lang is c");
                break;
            case "cpp":
                System.out.println("lang is cpp");
                break;
            default:
                System.out.println("lang != python, java, c, cpp");
                break;
        }
        // LunchMenu를 바탕으로 Random하게 1개의 값을 뽑고,
        // 해당 변수를 switch case로 검사.
        LunchMenu lunchMenu = LunchMenu.values()[(int)(Math.random() * LunchMenu.values().length)];
        System.out.println("lunchMenu = " + lunchMenu);
        switch (lunchMenu) {
            case KIMCHI:
                System.out.println("lunchMenu is kimchi");
                break;
            case BULGOGI:
                System.out.println("lunchMenu is bulgogi");
                break;
            case BANANA:
                System.out.println("lunchMenu is banana");
                break;
            case SOUP:
                System.out.println("lunchMenu is soup");
                break;
            case PASTA:
                System.out.println("lunchMenu is pasta");
                break;
            default:
//                System.out.println("lunchMenu != kimchi, bulgogi, banana, soup, pasta");
                System.out.printf("lunchMenu is %s%n", lunchMenu.toString().toLowerCase());
                break;
        }
    }
}

enum LunchMenu {
    KIMCHI,BULGOGI,BANANA,SOUP,PASTA,
    SUSHI,PIZZA,STEAK,APPLE,BREAD
}