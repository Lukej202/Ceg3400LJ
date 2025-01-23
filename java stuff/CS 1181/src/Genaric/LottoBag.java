package Genaric;
import java.util.ArrayList;
import java.util.Random;


public class LottoBag<E> {
    private ArrayList<E> contents;
    private Random rng;

    LottoBag(){
        contents = new ArrayList<E>();
        rng = new Random();
    }

    public boolean isEmpty(){ 
        return contents.isEmpty(); 
            } 
        
    public void clear(){ 
        contents.clear();
    } 

    public void add(E item){
        contents.add(item);
    }

    public E draw() throws RuntimeException{
        if(contents.size() < 1){
            throw new RuntimeException("Cannot draw from an empty bag");
        }
        int index = rng.nextInt(contents.size()); 
        E selectedItem = contents.remove(index); 
        return selectedItem;
    }
}
