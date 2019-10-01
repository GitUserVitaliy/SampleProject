package homework2;

public class Hello {
    public static boolean stringHello(String phrase) {
        String wordHello = "Здравствуйте";
        if(phrase.startsWith(wordHello)) {
            return true;
        } else {
            return false;
        }
    }
}
