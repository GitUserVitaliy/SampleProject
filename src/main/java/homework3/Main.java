package homework3;

import java.util.*;

public class Main {
    public static void deleteLong(List<String> list,int maxLength) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > maxLength) {
                list.remove(i);
                i--;
            }
        }
    }
    public static Set<Integer> symmetricDifference(Set<Integer> setFirst, Set<Integer> setSecond) {
        Set<Integer> setResult = new HashSet<>(setFirst);
        setResult.addAll(setSecond);
        Set<Integer> intersection= new HashSet<>(setFirst);
        intersection.retainAll(setSecond);
        setResult.removeAll(intersection);
        return setResult;
    }
    public static Map<String,Integer> countInList(List<String> list) {
        Map<String,Integer> map = new HashMap<>();
        for (String current : list) {
            if(map.containsKey(current)) {
                map.put(current,map.get(current) + 1);
            } else {
                map.put(current,1);
            }
        }
        return map;
    }

}
