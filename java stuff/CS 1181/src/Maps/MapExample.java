package Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample{
    public static void main(String[] args) {
        Map<Integer, String> checkouts = new HashMap<>();

        checkouts.put(123, "Raymer");
        checkouts.put(345, "Wiscgoll");
        checkouts.put(778, "Raymer");
        checkouts.put(668, "Doom");
        System.out.println(checkouts.get(668));

        Set<Integer> allEqNums = checkouts.keySet();
        ArrayList<Integer> orderNums = new ArrayList<>(allEqNums);
        Collections.sort(orderNums);
        for(Integer item: orderNums){
            System.out.println("Item # " + item + " checked out to " + checkouts.get(item));
        }
    }
}