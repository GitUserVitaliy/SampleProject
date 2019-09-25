package lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        float a = sc.nextFloat();
        System.out.println(isPowerOfNumber(a));
    }
    public static boolean isPowerOfNumber(float value) {
        for(int i = 0;Math.pow(2, i) <= value;i++) {
            if ((Math.pow(2, i)) == value) {
                return true;
            }
        }
        return false;
    }
}

