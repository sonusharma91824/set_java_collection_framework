package set;

import java.util.*;
import java.util.Set;

public class IteratorInSet {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<Integer>();
        SortedSet<Integer> s1 = new TreeSet() ;


             s1.add(78);
             s1.add(23);
             s1.add(57);
             s1.add(78);
             s1.add(98);
             s1.add(63);
             s1.add(52);

        System.out.println("ITERATOR");
                Iterator<Integer> it = s1.iterator();
                while (it.hasNext())
                {
                    System.out.println(it.next());
                }

        System.out.println("FOREACH");
                for(Integer uu :s1)
                {
                    System.out.println(uu);
                }
        System.out.println("STREAM");
        System.out.println(s1.stream().iterator().hasNext());


    }

        }