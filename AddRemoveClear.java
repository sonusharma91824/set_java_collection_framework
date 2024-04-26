package set.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AddRemoveClear {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();


        // add method is  used to add element in the set
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("t");
        s.add("u");
        s.add("w");
        s.add("h");

        // this line of code will priunt the set of elements in the console
        System.out.println(s);

        // remove method is used to remove particular object(element) fromn the set
        s.remove("t");
        System.out.println("element t is removed from the set "+ s);

        // clear method is used to clear all elements from the set
           s.clear();
        System.out.println("all elements are cleared from the set and now set is empty  " +s);
    }



    }
