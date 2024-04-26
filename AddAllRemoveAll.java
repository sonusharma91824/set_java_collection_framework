package set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class AddAllRemoveAll {
    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        s.add("d");
        s.add("c");
        s.add("e");
        s.add("g");
        Set<String> s1 = new HashSet<String>();
        s1.add("t");
        s1.add("c");
        s1.add("d");
        s1.add("e");

        // addALL method is used to concate two set
          s.addAll(s1);
        System.out.println(s);



        // removeAll method is used to remove all same elements from the set 1 and print the remaining elements of the set 1
        s.removeAll(s1);
        System.out.println("remaining elements"  + s);  //  remaining elements[g]
    }
}
