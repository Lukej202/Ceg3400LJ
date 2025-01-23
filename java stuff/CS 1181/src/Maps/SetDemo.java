package Maps;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(7);
        s1.add(5);
        s1.add(7);
        s1.add(3);

        Set<Integer> s2 = new HashSet<>(Arrays.asList(7,5,12,9));

        System.out.println(s1);
        System.out.println(s1.contains(5));
        System.out.println(s1.contains(9));
        
        //set intersection
        //s2.retainAll(s1);

        //set union
        s2.addAll(s1);


        
    }
}
