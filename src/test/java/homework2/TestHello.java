package homework2;

import lesson4.Arrays;
import lesson4.DeleteBadWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {
    @Test
    public void TestString() {
        boolean result = Hello.stringHello("Здравствуйте");
        assertEquals(true,result);
    }
    @Test
    public void TestStringА() {
        boolean result = Hello.stringHello("Здравствуйте, как проходит ваша жизнь?");
        assertEquals(true,result);
    }
    @Test
    public void TestStringB() {
        boolean result = Hello.stringHello("Как дела? Здравствуйте, как проходит ваша жизнь?");
        assertEquals(false,result);
    }
    @Test
    public void TestStringC() {
        boolean result = Hello.stringHello("");
        assertEquals(false,result);
    }

}
