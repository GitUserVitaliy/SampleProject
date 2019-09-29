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



}
