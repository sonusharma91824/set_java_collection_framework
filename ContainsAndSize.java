package set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class ContainsAndSize {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(3);
        h.add(6);
        h.add(1);
        h.add(2);
        h.add(0);

        System.out.println(h);


        // contains methoids check that a particullary element us present in set or not
        System.out.println("is element 5 is present in set  "+ h.contains(5));


        // size method gives the sizeor length of set in integer
        System.out.println("the sizeet is "+h.size());
    }
}
