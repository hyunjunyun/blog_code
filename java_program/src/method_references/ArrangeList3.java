package method_references;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ArrangeList3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        list = new ArrayList<>(list);
        ReverseSort reverseSort = new ReverseSort();

        Consumer<List<Integer>> consumer = reverseSort::sort;
        consumer.accept(list);
        System.out.println(list);
    }
}

class ReverseSort {
    public void sort(List<?> list) {
        Collections.reverse(list);
    }
}
