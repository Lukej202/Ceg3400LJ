package Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab07 {
    public static void main(String[] args) {
        List<Athlete<Integer>> list = new ArrayList<>();

        list.add(new Athlete<Integer>("Jhon Doe", "Baseball", 13));
        list.add(new Athlete<Integer>("Albert Snow", "Baseball", 15));
        list.add(new Athlete<Integer>("Mark Trainer", "Basketball", 7));
        list.add(new Athlete<Integer>("Trevor Spade", "Football", 23));
        list.add(new Athlete<Integer>("Mark Bale", "Basketball", 3));
        list.add(new Athlete<Integer>("Harvey Ralf", "Swimming", 13));
        list.add(new Athlete<Integer>("Trom Trapper", "Football", 20));
        System.out.println("Unsorted List");
        for(Athlete<Integer> a: list){
            System.out.println(a);
        }
        System.out.println();
        Collections.sort(list);
        System.out.println("Sorted by sport and then name");
        for(Athlete<Integer> a: list){
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Sorted by sport and then ranking");
        ComparatorClass com = new ComparatorClass();
        Collections.sort(list, com);

        for(Athlete a: list){
            System.out.println(a);
        }
    }
}
