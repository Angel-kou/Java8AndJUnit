package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> sameCharacter = collectionA.keySet().stream()
                .filter(s->object.get("value").contains(s))
                .collect(Collectors.toList());
        for (String key:collectionA.keySet()) {
            if (sameCharacter.contains(key)){
                collectionA.put(key,collectionA.get(key)-collectionA.get(key)/3);
            }
        }
        return collectionA;
    }
}
