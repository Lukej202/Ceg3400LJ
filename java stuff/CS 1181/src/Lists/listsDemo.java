package Lists;

import java.util.*;

public class listsDemo {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>(Arrays.asList(3,5,7,9,78,52));

        myList.add(19);
        myList.remove(0);

        System.out.println(myList);

    }
}
