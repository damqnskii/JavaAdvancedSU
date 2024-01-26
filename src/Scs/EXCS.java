package Scs;

import java.util.Scanner;

public class EXCS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] sentence = scanner.nextLine().split("\\s+");

        Solution slt = new Solution();
        int result = slt.stacky(sentence);

        System.out.println(result);

    }
}
