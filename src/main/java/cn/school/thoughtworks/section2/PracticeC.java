package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> map = new HashMap<>();
        String key = "";
        int value=0;
        for (String s:collection1) {
            key = s;
            value = 1;
            if(s.contains("-")||s.contains(":")||s.contains("[")){
                key = s.substring(0,1);
                if(!s.contains("[")){
                    value = Integer.parseInt(s.substring(2,s.length()));
                }else {
                    value = Integer.parseInt(s.substring(2, s.length() - 1));
                }
            }
            if(map.keySet().contains(key)){
                map.put(key,map.get(key)+value);
            }else {
                map.put(key,value);
            }
        }
        return map;
    }
}
