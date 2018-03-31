package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeB practiceB = new PracticeB();
        Map<String, Integer> map = new HashMap<>();
        for (String s:collectionA) {
            if(map.keySet().contains(s)){
                map.put(s,map.get(s)+1);
            }else {
                map.put(s,1);
            }
        }
        map =practiceB.createUpdatedCollection(map,object);
        return map;
    }
}
