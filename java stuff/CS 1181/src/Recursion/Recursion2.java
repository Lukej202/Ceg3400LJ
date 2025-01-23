package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Recursion2 {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(42,53,12,9,21));
        // System.out.println(sort(list));
        System.out.println(perm("the"));
    }

    public static Integer min(ArrayList<Integer> i){
        if(i.size() == 1){
            return i.get(0);
        }
        Integer firstNum = i.remove(0);

        Integer rest = min(i);

        if(firstNum < rest){
            return firstNum;
        }else return rest;
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> list){
        if(list.size() == 1){
            return list;
        }

        ArrayList<Integer> theRest = new ArrayList<>(list);
        Integer first = theRest.remove(0);

        ArrayList<Integer> result = sort(theRest);
        int position = 0;
        while(position < result.size() && result.get(position) < first){
            position++;
        }
        result.add(position, first);
        return result;
    }

    public static ArrayList<String> perm(String theString){
        
        ArrayList<String> result = new ArrayList<>();
        
        if(theString.length() <= 1){
            result.add(theString);
            return result;
        }

        for(int i = 0; i < theString.length(); i++){
            String current = theString.substring(i, i+1);
            String theRest = theString.substring(0, i) + theString.substring(i+1);
            ArrayList<String> subPerms = perm(theRest);
            for(String s: subPerms){
                result.add(current + s);
            }
        }
        return result;
    }

    public static boolean palChecker(String s){
        if(s.length() == 1 || s.length() == 0){
            return true;
        }

        String s1 = s.substring(0, 1);
        String s2 = s.substring(s.length()-1);

        boolean b = palChecker(s.substring(1,s.length()-1));

        if(b = false){
            System.out.println(b);
            System.exit(0);
        }

        if(s1.equalsIgnoreCase(s2)){
            return true;
        }else return false;
    }
}
