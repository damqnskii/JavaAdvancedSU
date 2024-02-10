package Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList <T extends Comparable<T> > {
    private List<T> list;
    public CustomList (){
        this.list = new ArrayList<>();
    }
    public void add (T element) {
        list.add(element);
    }
    public T remove (int index) {
        return list.remove(index);
    }
    public boolean contains (T element) {
        if(list.contains(element)) {
            return true;
        }
        return false;
    }
    public void swap (int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    public int countGreaterThan(T element) {
        int count = 0;
        for (T value : list) {
            if (value.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {

        T max = Collections.max(list);
        return max;
    }
    public T getMin() {
        T min = Collections.min(list);
        return min;
    }

    public List<T> getList() {
        return list;
    }
    public int size() {
        return  list.size();
    }
    public T get (int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (T value : list) {
            sb.append(value.toString()).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
