package SetAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String > map = new HashMap<>();

        while(true) {
            String[] data = scanner.nextLine().split("-");
            if(data[0].equals("search")) break;

            String name = data[0];
            String number = data[1];

            if(!map.containsKey(name)) {
                map.put(name, number);
            }
            else {
                map.put(name, number);
            }


        }
        String command = scanner.nextLine();
        while(!command.equals("stop")) {
            if(map.containsKey(command)) {
                System.out.println(command + " -> " + map.get(command));
            }
            else {
                System.out.println("Contact " + command + " does not exist.");
            }

            command = scanner.nextLine();
        }
    }
}
