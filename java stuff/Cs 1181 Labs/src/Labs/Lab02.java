package Labs;

import java.util.ArrayList;
import java.util.Collections;

public class Lab02 {
    public static void main(String[]args){
        Golfer g1 = new Golfer("John", "Smith",11 , 16);
        Golfer g2 = new Golfer("David", "Smith", 11, 16);
        Golfer g3 = new Golfer("David", "Taylor", 11, 2);

        ArrayList<Golfer> list = new ArrayList<Golfer>();

        list.add(g1);
        list.add(g2);
        list.add(g3);

        System.out.println("Unsorted List");
        for(Golfer g: list){
            System.out.println(g);
        }
        System.out.println("-------------------");
        System.out.println("Sorted List");
        Collections.sort(list);
        for(Golfer g: list){
            System.out.println(g);
        }
    }
}
