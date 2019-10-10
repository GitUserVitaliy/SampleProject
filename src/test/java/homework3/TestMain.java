package homework3;

import com.github.javafaker.Faker;
import com.sun.corba.se.spi.ior.MakeImmutable;
import com.sun.org.apache.xerces.internal.impl.xpath.XPath;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testDeletelong() {
        List<String> testArrayMax = new ArrayList<>();
        List<String> testArrayMin = new ArrayList<>();
        Faker faker = new Faker(new Locale("ru"));
        testArrayMax.add("Hello?");
        testArrayMax.add("Its boring");
        testArrayMax.add("Java One Love");
        testArrayMax.add("Minecraft its my life!!!");
        testArrayMax.add("Java vs Tolya");
        testArrayMin.add("Hello?");
        testArrayMin.add("Its boring");
        testArrayMin.add("Java One Love");
        testArrayMin.add("Java vs Tolya");
        Main.deleteLong(testArrayMax,13);
        assertEquals(testArrayMin,testArrayMax);
    }
    @Test
    public void testSymmetricDifference() {
        Set<Integer> setFirst = new HashSet<>();
        Set<Integer> setSecond = new HashSet<>();
        setFirst.add(1);
        setFirst.add(2);
        setFirst.add(3);
        setFirst.add(6);
        setFirst.add(8);
        setSecond.add(2);
        setSecond.add(3);
        setSecond.add(4);
        setSecond.add(5);
        setSecond.add(7);
        Set<Integer> setResult = new HashSet<>();
        setResult.add(1);
        setResult.add(4);
        setResult.add(5);
        setResult.add(6);
        setResult.add(7);
        setResult.add(8);
        assertEquals(setResult,Main.symmetricDifference(setFirst,setSecond));
    }
    @Test
    public  void testCountInList() {
        List<String> list = new ArrayList<>();
        list.add("Adidas");
        list.add("StoneIsland");
        list.add("Adidas");
        list.add("Adidas");
        list.add("Adidas");
        list.add("StoneIsland");
        list.add("Nike");
        list.add("Nike");
        list.add("Reebook");
        list.add("Reebook");
        Map<String,Integer> map = new HashMap<>();
        map.put("Adidas", 4);
        map.put("StoneIsland", 2);
        map.put("Nike", 2);
        map.put("Reebook",2);
        assertEquals(map,Main.countInList(list));
    }

}
