package homework5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

public class TestProgressions {
    @Test
    public void testAProgression_1() {
        List<Integer> list = new LinkedList<>();
        list.add(1);  list.add(2);  list.add(3);
        assertEquals(true,Progression.isArithmeticalProgression(list));
    }
    @Test
    public void testAProgression_2() {
        List<Integer> list = new LinkedList<>();
        list.add(5);  list.add(10);  list.add(15);
        assertEquals(true,Progression.isArithmeticalProgression(list));
    }
    @Test
    public void testAProgression_3() {
        List<Integer> list = new LinkedList<>();
        list.add(7);  list.add(10);  list.add(15);
        assertEquals(false,Progression.isArithmeticalProgression(list));
    }
    @Test
    public void testAProgression_4() {
        List<Integer> list = new LinkedList<>();
        list.add(5);  list.add(19);  list.add(15);
        assertEquals(false,Progression.isArithmeticalProgression(list));
    }
    @Test
    public void testAProgression_5() {
        List<Integer> list = new LinkedList<>();
        list.add(0);  list.add(0);  list.add(0);
        assertEquals(false,Progression.isArithmeticalProgression(list));
    }
    @Test
    public void testAProgression_6() {
        List<Integer> list = new LinkedList<>();
        list.add(1);  list.add(1);  list.add(1);
        assertEquals(false,Progression.isArithmeticalProgression(list));
    }
    @Test
    public void testGProgression_1() {
        List<Integer> list = new LinkedList<>();
        list.add(0);  list.add(0);  list.add(0);
        assertEquals(false,Progression.isGeometricalProgression(list));
    }
    @Test
    public void testGProgression_2() {
        List<Integer> list = new LinkedList<>();
        list.add(1);  list.add(2);  list.add(4);
        assertEquals(true,Progression.isGeometricalProgression(list));
    }
    @Test
    public void testGProgression_3() {
        List<Integer> list = new LinkedList<>();
        list.add(1);  list.add(1);  list.add(1);
        assertEquals(true,Progression.isGeometricalProgression(list));
    }
    @Test
    public void testGProgression_4() {
        List<Integer> list = new LinkedList<>();
        list.add(10);  list.add(30);  list.add(90);
        assertEquals(true,Progression.isGeometricalProgression(list));
    }
    @Test
    public void testGProgression_5() {
        List<Integer> list = new LinkedList<>();
        list.add(-1);  list.add(3);  list.add(1);
        assertEquals(false,Progression.isGeometricalProgression(list));
    }
    @Test
    public void testGProgression_6() {
        List<Integer> list = new LinkedList<>();
        list.add(4);  list.add(8);  list.add(16);
        assertEquals(true,Progression.isGeometricalProgression(list));
    }
}
