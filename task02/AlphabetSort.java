package selfwork17.task02;

import java.util.HashMap;
import java.util.Map;

public class AlphabetSort {

    public static void main(String[] args) {
        String[] arrayWord = new String[]{"cat", "call", "boy", "clever", "salt", "bad", "ann"};
        Map<String, String> sortMap = new HashMap<>();
        String firstSymbol;
        String value;

        for (String s : arrayWord) {
            firstSymbol = String.valueOf(s.charAt(0));

            if (sortMap.containsKey(firstSymbol)){
                value = sortMap.get(firstSymbol);
                sortMap.put(firstSymbol, value + s);
            }
            else {
                sortMap.put(firstSymbol, s);
            }
        }
        System.out.println(sortMap);
    }
}