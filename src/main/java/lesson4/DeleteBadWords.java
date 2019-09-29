package lesson4;

public class DeleteBadWords {
    public static String deleteBadWords(String str,String word) {
        if(str.length() != 0)
        {
            int pos = str.indexOf(word);
            String result = "";
            for (int i = 0; i < pos; i++) {
                result = result + str.charAt(i);
            }
            result = result + "***";
            for (int i = pos + word.length(); i < str.length(); i++) {
                result = result + str.charAt(i);
            }
            System.out.println(str);
            System.out.println(result);
            return result;
        } else {
            return str;
        }
    }
}
