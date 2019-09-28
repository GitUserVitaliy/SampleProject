package lesson3;

import java.util.Scanner;

public class StringInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println(Inverse(str));
    }
    public static String Inverse(String str) {
        String inv = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inv = inv + str.charAt(i);
        }
        return inv;
    }
}
