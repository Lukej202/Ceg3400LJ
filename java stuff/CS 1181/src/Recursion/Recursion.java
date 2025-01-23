package Recursion;

import java.util.ArrayList;
import java.util.Arrays;


public class Recursion {
    public static void main(String[] args) {
        
        System.out.println(pow(2,10));
    }

    public static void foo(int times){
        if(times > 100){
            return;
        }
        System.out.println(times + " About to call myself...");
        foo(times + 1);
    }

    public static String reverse(String theString){
        // Base Case
        if(theString.length() == 0){
            return theString;
        }
        //divide the problem
        String firstChar = theString.substring(0, 1);

        //Have Faith
        String theRest = reverse(theString.substring(1));

        //put the pieces together
        return theRest + firstChar;
    }

    public static Integer sum(ArrayList<Integer> list){
        if(list.isEmpty()){
            return 0;
        }
        Integer firstNum = list.remove(0);

        Integer theRest = sum(list);

        return firstNum + theRest;
        
    }

    public static Integer max(ArrayList<Integer> list){
        
        if(list.isEmpty()){
            return 0;
        }

        Integer firstNum = list.remove(0);

        Integer nextNum = max(list);

        if(firstNum > nextNum){
            return firstNum;
        }else return nextNum;
    }

    public static int fac(int value){
        if(value == 1){
            return 1;
        }
        return value * fac(value-1);
    }

    public static int pow(int num, int power){
        if(power == 1){
            return num*power;
        }
        return num * pow(num, power - 1);
    }
}


