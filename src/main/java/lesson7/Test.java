package lesson7;

import java.util.*;


public class Test {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int b = 0;
        int max = 0;
        for (Integer current : arr) {
            if(map.containsKey(current)) {
                map.put(current,map.get(current) + 1);
            } else {
                map.put(current,1);
            }
        }
        for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
            max = pair.getValue();
            if(max > b) {
                b = pair.getValue();
            }
        }
        return b = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey();
    }

    public static void main(String[] args) {

    }
}












        /*
    public static void main(String[] args) {
        hurdleRace(5,new int[]{1,3,5,6,8});
    }
    static int hurdleRace(int k, int[] height) {
        int result = 0;
        int current = 0;
        for (int i = 0; i < height.length; i++) {
            current = result + height[i];
            while(current <= height[i]) {
                if(height[i] > k) {
                    current = result + height[i];
                    result++;
                }
                if (k >= height[i]) {
                    break;
                }
            }
        }
        return result;
    }
    */
