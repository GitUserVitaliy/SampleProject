package lesson3;

import java.util.Scanner;

public class Exell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        float length = sc.nextFloat();
        System.out.println("Enter E: ");
        float e = sc.nextFloat();
        float var = 0;
        if(length > 0 && e >=0) {
            while(true) {
                System.out.println("Enter variable: ");
                var = sc.nextFloat();
                if (var != 0)
                {
                    if(var >= (length - e) && var <= (length + e)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("Exit");
                    System.exit(0);
                }
            }
        }
    }
}


