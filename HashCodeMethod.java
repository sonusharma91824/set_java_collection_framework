package set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashCodeMethod {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("t");
        s.add("u");
        s.add("w");
        s.add("h");

        System.out.println(s.hashCode());

    }
}
