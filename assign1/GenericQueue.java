package assign1;

import java.util.*;

public class GenericQueue {
    public static <T> T[] getDuplicates(T[] array) {
        Set<T> set = new HashSet<>();
    
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    set.add(array[i]);
                }
            }
        }
        return set.toArray(Arrays.copyOf(array, set.size()));
    }

    public static <T extends Number> double getAverage(List<T> list) {
        double sum = 0;
        for (T item : list) {
            sum += item.doubleValue();
        }
        return sum / list.size();
    }

    public static <T extends Comparable<T>> T getSmallest(List<T> list) {
        T smallest = list.get(0);
        for (T item : list) {
            if (item.compareTo(smallest) < 0) {
                smallest = item;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, 3, 4, 4, 5, 5, 5 };
        Integer[] duplicates = getDuplicates(arr);
        for (Integer item : duplicates) {
            System.out.println(item);
        }
        System.out.println("Average: " + getAverage(Arrays.asList(arr)));
        System.out.println("Smallest: " + getSmallest(Arrays.asList(arr)));
    }
}
