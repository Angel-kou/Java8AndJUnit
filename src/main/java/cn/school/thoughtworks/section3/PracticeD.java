package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeB practiceB = new PracticeB();
        Map<String, Integer> map = new HashMap<>();
        String key = "";
        int value=0;
        for (String s:collectionA) {
            key = s;
            value = 1;
            if(s.contains("-")){
                key = s.substring(0,1);
                value = Integer.parseInt(s.substring(2,s.length()));
            }
            if(map.keySet().contains(key)){
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,value);
            }
        }
        map = practiceB.createUpdatedCollection(map,object);
        return map;
    }
}
