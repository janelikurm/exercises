import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambaPractice {

    List<Integer> multiplyListElementsByTwo(List<Integer> initialList) {

        return initialList.stream().map(number -> number*2).toList();
//        List<Integer> newList = new ArrayList<>();
//        for (int i : initialList) {
//            newList.add(i * 2);
//        }
//        return newList;
    }
}
