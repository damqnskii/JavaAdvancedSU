package SetAndMaps;

import java.util.*;

public class Population {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, TreeMap<String, Integer>> map = new TreeMap<>();
        Map<String, Integer> total = new TreeMap<>(Comparator.reverseOrder());

        while(true) {
            String[] data = scanner.nextLine().split("\\|");
            if(data[0].equals("report")) break;

            String town = data[0];
            String country = data[1];
            int population = Integer.parseInt(data[2]);

            map.putIfAbsent(country, new TreeMap<>());
            TreeMap<String, Integer> cities = map.get(country);
            cities.put(town, population);

            total.merge(country, population, Integer::sum);


        }
            List<Map.Entry<String, Integer>> sortedTotalEntries = new ArrayList<>(total.entrySet());
            sortedTotalEntries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for (Map.Entry<String, Integer> entry : sortedTotalEntries) {
            String country = entry.getKey();
            TreeMap<String, Integer> innerMap = map.get(country);

            System.out.println(country + " (total population: " + entry.getValue() + ")");
            for (Map.Entry<String, Integer> pair : innerMap.entrySet()) {
                System.out.println("=>" + pair.getKey() + ": " + pair.getValue());
            }
        }
    }
}
