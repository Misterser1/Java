package Task2;

import java.util.List;
import java.util.stream.Collectors;

public class BeginA {
    public List<String> allA(List<String> stringList) {
       return stringList.stream()
               .filter(str -> str.startsWith("A"))
               .collect(Collectors.toList());
    }
}
