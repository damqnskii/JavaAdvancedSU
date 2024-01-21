package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] sequence = scanner.nextLine().split("\\s+");

            switch(sequence.length) {
                case 2:
                int numberTopush = Integer.parseInt(sequence[1]);
                stack.push(numberTopush);
                break;
                case 1:
                    int action = Integer.parseInt(sequence[0]);
                    if(action == 2) {
                        stack.pop();
                    }
                    else {
                        int max = Integer.MIN_VALUE;
                        for (Integer number : stack) {
                            if(max < number) {
                                max = number;
                            }
                        }
                        System.out.println(max);
                    }
            }
        }
    }
}
