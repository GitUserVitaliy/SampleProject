package lesson5.analyze;

public class LengthAnalyzer implements Analyzer {
    private int length;
    public LengthAnalyzer(int length) {
        this.length = length;
    }
    public boolean analyze(String text) {
        if(text.length() > length) {
            return true;
        } else {
            return false;
        }
    }
}
