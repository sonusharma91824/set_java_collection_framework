package set.TreeSetMethods;

import java.util.SortedSet;
import java.util.TreeSet;

public class DescendingIteratorMethod {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<>() ;
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("t");
        s.add("u");
        s.add("w");
        s.add("h");


        s.descendingIterator().forEachRemaining(System.out::println);

    }
}
