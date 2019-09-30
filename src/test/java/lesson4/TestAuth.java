package lesson4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAuth {
    @Test
    public void testIncorrect() {
        boolean result = Auth.logIn("root","toor");
        assertEquals(false,result);
    }
    @Test
    public void testCorrect() {
        boolean result = Auth.logIn("root","toor");
        assertEquals(false,result);
    }
}
