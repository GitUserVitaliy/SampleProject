package lesson5.analyze;

public class KeyWordAnalyzer implements Analyzer{
    protected String[] keyWords;
    public boolean analyze(String text) {
        for (int i = 0; i < keyWords.length; i++) {
            if (text.contains(keyWords[i])) {
                return false;
            }
        }
        return true;
    }
}
