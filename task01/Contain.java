package selfwork17.task01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contain {
    static String input = "catdogdogdogcatcat";
    static String str = "cat";
    static String str1 = "dog";

    public static void main(String[] args) {
        containStr();
    }

    public static void containStr() {
        int j = 0;
        int i = 0;
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(input);
        Pattern p1 = Pattern.compile(str1);
        Matcher m1 = p1.matcher(input);

        while (m.find()) {
            i++;
        }
        System.out.println("Number of repetitions str: " + i);

        while (m1.find()) {
            j++;
        }
        System.out.println("Number of repetitions str1: " + j);

        if (input.contains(str) && input.contains(str1) && i ==j){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
