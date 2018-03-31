package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> result = collection1.stream()
                .filter(s->collection2.stream().filter(list->list.contains(s)).count()!=0)
                .collect(Collectors.toList());
        return result;
    }
}
