package lesson3;

import java.util.Scanner;

public class StringBadWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println("Enter word: ");
        String word = sc.next();
        /*int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == word.charAt(0)) {
                if(word.length() > str.length() - i) {
                    for (int j = 0; j < word.length(); j++) {
                        if(word.charAt(j) == str.charAt(i)) {
                            count++;
                        }
                        i++;
                    }
                }
            }
        }
        if(count - 1 == word.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        */
        System.out.println(str.indexOf(word));
        System.out.println(str.contains(word));
    }
}
