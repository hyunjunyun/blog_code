package method_references;

import java.util.*;
import java.util.function.Consumer;

public class ArrangeList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        list = new ArrayList<>(list);

        Consumer<List<Integer>> consumer = l -> Collections.reverse(l); // 람다식
        consumer.accept(list);
        System.out.println(list);



    }
}
