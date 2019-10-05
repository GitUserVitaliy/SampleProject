package lesson5_analyze;

public class KeyWordAnalyzer {
    protected String[] keyWords;
    public boolean analyze(String text) {
        for (int i = 0; i < keyWords.length; i++) {
            if (text.indexOf(keyWords[i]) != -1) {
                return false;
            }
        }
        return true;
    }
}
