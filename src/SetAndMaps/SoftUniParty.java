package SetAndMaps;

import java.util.*;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> regular = new TreeSet<>();
        Set<String> vip = new TreeSet<>();

        while(true) {
            String guests = scanner.nextLine();
            if (guests.equals("PARTY")) break;

            if (Character.isDigit(guests.charAt(0))) {
                vip.add(guests);
            } else {
                regular.add(guests);
            }

        }
        String comingGuests = scanner.nextLine();
        while(!comingGuests.equals("END")) {
            if(regular.contains(comingGuests)) {
                regular.remove(comingGuests);
            }
            else {
                vip.remove(comingGuests);
            }
            comingGuests = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
