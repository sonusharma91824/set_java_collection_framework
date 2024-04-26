package set.TreeSetMethods;

import java.util.TreeSet;

public class FloorMethod {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(56);
        s.add(78);
        s.add(567);
        s.add(345);
        s.add(87);
        s.add(134);
        s.add(287);


        //  with thw help of floor method we can find less then or equal element of the given element

        System.out.println(s.floor(345
        )); // 567


    }}
