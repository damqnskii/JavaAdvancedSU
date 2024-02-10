package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListUtils <T> {
    public static <T extends Comparable<T>> T getMax (List<T> list) {
        return Collections.max(list);
    }
    public static <T extends Comparable<T>> T getMin (List<T> list) {
        return Collections.min(list);
    }

    private static <T> void ensureNotEmpty(List<T> list) {
        if(list.isEmpty()) {
            throw new IllegalArgumentException("The List is Empty");
        }
    }
}
