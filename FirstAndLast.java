package set.SortedSetMethods;

import java.util.*;

public class FirstAndLast {
    public static void main(String[] args) {
    SortedSet<String> s = new TreeSet<>() ;
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("t");
        s.add("u");
        s.add("w");
        s.add("h");

        System.out.println(s);

        //first method give the first element of the set
        System.out.println("first element of the set is "+ s.first());


        // last method will give the last element of the set
        System.out.println("last element of the set is " + s.last());


    }
}
