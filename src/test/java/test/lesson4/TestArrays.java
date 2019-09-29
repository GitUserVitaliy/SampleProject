package test.lesson4;

import lesson4.Arrays;
import lesson4.DeleteBadWords;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrays {
    @Test
    public void testArray() {
        int arr[] = {1,2,3,4,5};
        double result = Arrays.sA(arr);
        assertEquals(3,result);
    }
}
