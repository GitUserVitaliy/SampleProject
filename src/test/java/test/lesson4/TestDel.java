package test.lesson4;

import lesson4.DeleteBadWords;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestDel {
    @Test
    public void testString() {
        String result = DeleteBadWords.deleteBadWords("I love drugs", "love");
        assertEquals("I *** drugs", result);
    }
    @Test
    public void testEmpty() {
        String result = DeleteBadWords.deleteBadWords("", "love");
        assertEquals("", result);
    }
    @Test
    public void testCorrect() {
        String result = DeleteBadWords.deleteBadWords("I love cats", "chair");
        assertEquals("I love cats", result);
    }
    @Test
    public void testStringNew() {
        String result = DeleteBadWords.deleteBadWords("I love drugs, and cats", "drugs");
        assertEquals("I love ***, and cats", result);
    }
    @Test
    public void testTwice() {
        String result = DeleteBadWords.deleteBadWords("I love drugs, and drugs", "drugs");
        assertEquals("I love ***, and ***", result);
    }
    @Test
    public void testWord() {
        String result = DeleteBadWords.deleteBadWords("I love drugs, and drugs", "");
        assertEquals("I love drugs, and drugs", result);
    }
}

