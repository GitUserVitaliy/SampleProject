package lesson3;

import java.util.Scanner;

public class StringExample {
    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();
        System.out.println("Enter char: ");
        String symb = sc.next();
        char sym = symb.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == sym) {
                count++;
            }
        }
        System.out.println("Count-> " + count);
    }
}
