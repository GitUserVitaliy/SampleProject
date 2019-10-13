package lesson8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers -->");
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        try {
            System.out.println(numA + " / " + numB + " = " + numA / numB);
        } catch (Exception exception) {
            System.out.println("<Error>");
        }
    }
}
