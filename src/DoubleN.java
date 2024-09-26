import java.util.List;
import java.util.stream.Collectors;

public class DoubleN {
    public List<Integer> doubleNum(List<Integer> numb) {
       return numb.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());
    }
}
