package homework1;

import java.util.Scanner;

public class FourNumbers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        if (num1*num2*num3 == num4) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
