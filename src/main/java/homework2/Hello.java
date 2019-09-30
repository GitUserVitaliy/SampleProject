package homework2;

public class Hello {
    public static boolean stringHello(String phrase) {
        String wordHello = "Здравствуйте";
        if(phrase.indexOf(wordHello) != -1) {
            if(phrase.indexOf(wordHello) == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
