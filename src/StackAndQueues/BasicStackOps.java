package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BasicStackOps {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int[] information = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int toPop = information[1];
        int check = information[2];

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());;

        for (Integer number : numbers) {
            stack.push(number);
        }
        for(int i = 0; i < toPop; i++) {
            stack.pop();
        }

        if (stack.contains(check)) {
            System.out.println("true");
        }
        else if(stack.isEmpty()) {
            System.out.println(0);
        }
        else {
            int min = Integer.MAX_VALUE;
            for (Integer n : stack) {
                if (min > n) {
                    min = n;
                }
            }
            System.out.println(min);
        }

    }
}
