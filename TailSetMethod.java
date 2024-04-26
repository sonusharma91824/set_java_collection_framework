package set.SortedSetMethods;

import java.util.SortedSet;
import java.util.TreeSet;

public class TailSetMethod {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<>() ;
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("t");
        s.add("u");
        s.add("w");
        s.add("h");


        System.out.println(s);   // [c, d, e, h, t, u, w]

        System.out.println(s.tailSet("t"));  // [t, u, w]
    }
}
