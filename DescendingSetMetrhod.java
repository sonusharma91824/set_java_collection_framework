package set.TreeSetMethods;

import java.util.TreeSet;

public class DescendingSetMetrhod {
    public static void main(String[] args) {

            TreeSet<Integer> s = new TreeSet<>() ;
            s.add(56);
            s.add(78);
            s.add(567);
            s.add(345);
            s.add(87);
            s.add(134);
            s.add(287);

        System.out.println(s.descendingSet());

        }
}
