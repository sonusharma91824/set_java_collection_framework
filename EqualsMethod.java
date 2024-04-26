package set.SortedSetMethods;

import java.util.SortedSet;
import java.util.TreeSet;

public class EqualsMethod {
    public static void main(String[] args) {


        SortedSet<String> set1 = new TreeSet<>();
        SortedSet<String> set2 = new TreeSet<>();

        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        set2.add("apple");
        set2.add("banana");
        set2.add("orange");

        System.out.println(set1.equals(set2));

    }
}