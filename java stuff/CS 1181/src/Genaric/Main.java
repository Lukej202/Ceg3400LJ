package Genaric;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String[]args){
    LottoBag<Integer> i = new LottoBag<>();
    i.add(9);
    i.add(12);
    i.add(7);
    i.add(11);
    i.add(15);
    System.out.println(i.draw());
    }

    public static <T> void printMe(T item){
        System.out.println("Item to print out " + item);
    }

    public static <T extends Comparable<T>> T min(T first, T second, T third){
        T minVal = first;
        if(minVal.compareTo(second) > 0){
            minVal = second;
        }
        if(minVal.compareTo(third) > 0){
            minVal = third;
        }

        return minVal;

    }
    public static <T> void printArray(T theArray[]){
        for(int i = 0; i < theArray.length; i++){
            System.out.print(theArray[i]);
            if(i < theArray.length - 1){
                System.out.print(", ");

            }
        }
    } 

    public static <T> ArrayList<T> removeTwo(ArrayList<T> list){
        ArrayList<T> lt = new ArrayList<>();
        if(list.size() > 1){
            lt.add(list.get(0));
            list.remove(0);
        }
        if(list.size() > 2){
            lt.add(list.get(1));
            list.remove(1);
        }
        return lt;
    }


}
