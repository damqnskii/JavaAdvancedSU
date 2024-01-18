package SetAndMaps;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carIn = scanner.nextLine().split(", ");
        Set<String> carSet = new LinkedHashSet<>();

        while(!carIn[0].equals("END")) {
            if(carIn[0].equals("IN")) {
                carSet.add(carIn[1]);
            }
            else if (carIn[0].equals("OUT")) {
                carSet.remove(carIn[1]);
            }
            carIn = scanner.nextLine().split(", ");
        }

        if(carSet.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
        else {
            carSet.forEach(System.out::println);
        }
    }
}
