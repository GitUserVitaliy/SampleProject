package lesson3;

import java.util.Scanner;

public class StringInverse {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.next();
        if(isP(str) == true) {
            System.out.println("Yes_P");
        } else {
            System.out.println("No_P");
        }

    }
    public static String Inverse(String str) {
        String inv = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            inv = inv + str.charAt(i);
        }
        return inv;
    }
    public static Boolean isP(String string) {
        String reversedString = Inverse(string);
        Boolean result = string.equals(reversedString);
        return result;
    }
}
