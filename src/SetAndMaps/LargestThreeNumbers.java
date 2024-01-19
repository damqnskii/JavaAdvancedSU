package SetAndMaps;

import java.util.Arrays;
import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       boolean isSorted = true;

       for (int i = 0; i < numbers.length; i++) {
           if(!isSorted) {
               break;
           }
           else {
               isSorted = false;
           }
           for(int j = 0; j < numbers.length - 1; j++) {
               if(numbers[j] < numbers[j + 1]) {
                   int temp = numbers[j];
                   numbers[j] = numbers[j + 1];
                   numbers[j + 1] = temp;
                   isSorted = true;
               }
           }
       }
        for (int k = 0; k < numbers.length; k++) {
            if(k == 3) break;
            System.out.println(numbers[k]);
        }



    }
}
