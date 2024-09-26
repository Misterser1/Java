import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(24);
        integerList.add(6);
        integerList.add(10);

        DoubleN ne = new DoubleN();

        List<Integer> doubleList = ne.doubleNum(integerList);

        doubleList.forEach(System.out::println);
    }
}
