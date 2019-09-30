package lesson4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestArrays {
    @Test
    public void testArray() {
        int arr[] = {1,2,3,4,5};
        double result = Arrays.sA(arr);
        assertEquals(3,result);
    }
    @Test
    public void testEmptyArray() {
        int arr[] = {};
        double result = Arrays.sA(arr);
        assertEquals(0,result);
    }
}
