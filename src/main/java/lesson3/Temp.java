package lesson3;

import java.util.Locale;
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.println(System.in);
        float _temp = sc.nextFloat();
        if(_temp >= 36.5 && _temp <= 36.7) {
            System.out.println("OK");
        } else {
            System.out.println("BAD");
        }
        System.exit(0);
    }
}
