package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> deck = new ArrayDeque<>();
        String current = null;
        while(true) {
            String text = scanner.nextLine();


            if(text.equals("Home")) break;

            if(text.equals("back")) {
                if(deck.isEmpty()) {
                    System.out.println("no previous URLs");
                }
                else {
                    current = deck.pop();
                    System.out.println(current);
                }
            }
            else {
                if(current != null) {
                    deck.push(current);
                }
                current = text;
                System.out.println(current);

            }
        }
    }
}
