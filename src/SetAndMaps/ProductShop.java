package SetAndMaps;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> map = new TreeMap<>();

        while(true) {
            String[] data = scanner.nextLine().split(", ");
            if(data[0].equals("Revision")) break;
            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);



            map.putIfAbsent(shop, new LinkedHashMap<>());
            map.get(shop).put(product, price);


        }

        for (Map.Entry<String, Map<String, Double>> pair : map.entrySet()) {
            System.out.println(pair.getKey() + "->");
            Map<String, Double> innerMap = pair.getValue();
            for (Map.Entry<String, Double> products : innerMap.entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", products.getKey(), products.getValue());
            }
        }


    }
}
