package set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IsEmptyAndIterator {
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

        // isEmpty method is used to find that the set is empty or not
        System.out.println(s.isEmpty() +" - set is not empty ");



        // iterator method is used to iterate Elements of set
        Iterator<String> it = s.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
