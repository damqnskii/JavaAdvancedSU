package Generics;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>  {
    private List<T> values;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s%n", value.getClass().getName(), value.toString()));
        }
        return sb.toString();
    }

    public Box () {
        this.values = new ArrayList<>();
    }

    public List<T> getValues() {
        return values;
    }

    public void setValues(List<T> values) {
        this.values = values;
    }
    public void  swap (int first, int second) {
        T temp = values.get(first);
        values.set(first, values.get(second));
        values.set(second, temp);

    }

    public int compare(T element) {
        int count = 0;
        for (T value : values) {
            if (value.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }


}
