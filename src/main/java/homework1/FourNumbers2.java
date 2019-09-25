package homework1;

import java.util.Scanner;

public class FourNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if (num1 * num2 * num3 == num4) {
            System.out.println("Yes " + num4);
        } else {
            if (num1 * num2 * num4 == num3) {
                System.out.println("Yes " + num3);
            }  else {
                if (num1 * num4 * num3 == num2) {
                    System.out.println("Yes " + num2);
                } else {
                    if (num4 * num2 * num3 == num1) {
                        System.out.println("Yes " + num1);
                    } else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
