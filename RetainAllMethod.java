package set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class RetainAllMethod {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("t");
        Set<String> s1 = new HashSet<String>();
        s1.add("u");
        s1.add("d");
        s1.add("c");


        // retain method find same elements from both the set
        s.retainAll(s1);
        System.out.println(s);

    }
}
