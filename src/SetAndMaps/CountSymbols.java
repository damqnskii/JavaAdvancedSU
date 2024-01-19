package SetAndMaps;

import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();
        char[] arr = sentence.toCharArray();

        for(Character s : arr) {
            if(!map.containsKey(s)) {
                map.put(s, 1);
            }
            else {
                int currentOccur = map.get(s);
                map.put(s, currentOccur + 1);
            }
        }

        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());
        }
    }
}
