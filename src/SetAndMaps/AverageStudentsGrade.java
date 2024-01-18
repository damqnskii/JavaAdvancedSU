package SetAndMaps;

import java.util.*;

public class AverageStudentsGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> mapStudent = new TreeMap<>();

        for(int i = 0; i < n; i++) {
            String[] studentData = scanner.nextLine().split("\\s+");
            String name = studentData[0];
            double grade = Double.parseDouble(studentData[1]);

            mapStudent.putIfAbsent(name, new ArrayList<>());
            mapStudent.get(name).add(grade);
        }

        mapStudent.entrySet()
                .forEach(list -> {
                    double sum = 0;
                    for (int i = 0; i < list.getValue().size(); i++) {
                        sum += list.getValue().get(i);
                    }
                    double avgSum = sum / list.getValue().size();

                    System.out.print(list.getKey() + " -> ");
                    list.getValue().forEach(el -> System.out.printf("%.2f ", el));
                    System.out.printf("(avg: %.2f)", avgSum);
                });


    }
}
