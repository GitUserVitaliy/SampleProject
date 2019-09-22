package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        float a = sc.nextFloat();
        System.out.println("Enter pow: ");
        int b = sc.nextInt();
        System.out.println(isPowerOfNumber(a,b));
    }
    public static boolean isPowerOfNumber(float value,int pow) {
        float num = Math.abs(value);
        while(true) {
            num = num / pow;
            if(num % 1 == 0) {
                if(num == 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }
}
