package lesson4;

public class DeleteBadWords {
    public static String deleteBadWords(String str,String word) {
        if(word.length() != 0) {
            return str.replaceAll(word,"***");
        } else {
            return str;
        }
    }
}
