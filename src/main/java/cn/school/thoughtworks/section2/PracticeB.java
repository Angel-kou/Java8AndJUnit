package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> map = new HashMap<>();
        String key = "";
        int value=0;
        for (String s:collection1) {
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
        return map;
    }
}
