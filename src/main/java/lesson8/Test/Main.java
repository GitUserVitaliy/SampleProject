package lesson8.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers -->");
        try {
            int numA = sc.nextInt();
            int numB = sc.nextInt();
            System.out.println(numA + " / " + numB + " = " + numA / numB);
        } catch (InputMismatchException exception) {
            System.out.println("<ScannerError>");
        } catch (ArithmeticException exception) {
            System.out.println("<Error>");
        }
    }
}
