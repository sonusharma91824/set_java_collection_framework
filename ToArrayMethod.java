package set.HashSet;

import java.util.Arrays;
import java.util.HashSet;

public class ToArrayMethod {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("t");
        s.add("u");
        s.add("w");
        s.add("h");

        System.out.println("set - " + s);


        // with the help of toArray method we can convert set into array

        Object []a = s.toArray();
        for(Object s1 : a)
        {
            System.out.println(s1);
        }

    }
}
