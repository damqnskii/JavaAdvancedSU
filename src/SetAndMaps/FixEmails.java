package SetAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String > map = new LinkedHashMap<>();
        String name = scanner.nextLine();
        while(!name.equals("stop")) {
            String email = scanner.nextLine();

            map.put(name, email);

            if(map.get(name).contains(".com") || map.get(name).contains("us") || map.get(name).contains("uk")) {
                map.remove(name);
            }
            name = scanner.nextLine();
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.printf("%s -> %s%n", pair.getKey(), pair.getValue());
        }
    }
}
