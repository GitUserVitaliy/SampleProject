package homework1;

import java.util.Scanner;

public class FourTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = sc.nextInt();
        while(result != 1) {
            if(result % num1 == 0) {
                result = result / num1;
            }
            if(result % num2 == 0) {
                result = result / num2;
            }
            if(result % num2 != 0 && result % num2 != 0) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println(result);
    }
}
