package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queue = new ArrayDeque<>();

        while(true) {
            String text = scanner.nextLine();
            String current = null;
            if(text.equals("print")) break;

            if(text.equals("cancel")) {
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }
                else {
                    System.out.println("Canceled " + queue.poll());
                }
            }
            else {
                current = text;
                queue.offer(current);
            }
        }
        queue.forEach(System.out::println);
    }
}
