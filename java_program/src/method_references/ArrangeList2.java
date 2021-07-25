package method_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        list = new ArrayList<>(list);

        Consumer<List<Integer>> consumer = Collections::reverse; // 메소드 참조 기반 람다식
        consumer.accept(list); // accept 메서드를 호출 시 전달되는 인자를 reverse 메서드를 호출하면서 전달한다.
        System.out.println(list);
    }
}
