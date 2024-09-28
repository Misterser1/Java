package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.addAll(Arrays.asList("Armenia", "Any", "Lion","First","Aster","Long","Aron"));

        BeginA result = new BeginA();
        List<String> stringList1 = result.allA(stringList);
        stringList1.forEach(System.out::println);
    }
}
