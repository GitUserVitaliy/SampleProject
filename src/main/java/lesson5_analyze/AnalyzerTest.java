package lesson5_analyze;

import java.util.Scanner;

public class AnalyzerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Analyzer[] analyzers = new Analyzer[3];
        analyzers[0] = new LengthAnalyzer(200);
        analyzers[1] = new SpamAnalyzer(new String[]{"кредит","микрозайм"});
        analyzers[2] = new SwearAnalyzer();
        System.out.println("Enter string: ");
        String text = sc.next();
        int count = 0;
        for (int i = 0; i < analyzers.length; i++) {
            System.out.println(analyzers[i].analyze(text));
            count++;
        }
        if(count == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
