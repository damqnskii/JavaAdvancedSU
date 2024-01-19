package SetAndMaps;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> compounds = new TreeSet<>();

        for(int i = 0; i < n; i++) {
            String[] elements = scanner.nextLine().split(" ");
            Arrays.stream(elements).forEach(compounds::add);

        }
        compounds.forEach(el -> System.out.print(el + " "));
    }
}
