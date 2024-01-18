package SetAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> valuesWithOccurrences = new LinkedHashMap<>();

        for (double v : numbers) {
            if(!valuesWithOccurrences.containsKey(v)) {
                valuesWithOccurrences.put(v, 1);
            }
            else {
                valuesWithOccurrences.put(v, valuesWithOccurrences.get(v) + 1);
            }
        }
        for (Double key : valuesWithOccurrences.keySet()) {
            System.out.println(String.format("%.1f -> %d", key, valuesWithOccurrences.get(key)));
        }
    }
}
