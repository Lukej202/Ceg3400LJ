package Labs;

import java.util.*;

public class TileGame {
    /**
     * The game for the Lab checks each case for 1 2 and 3 and checks to see if it pops an item out of the stack if it will pop a null item
     * so it does not throw an exception
     * @param stack the stack for the game
     * @param q the queue for the game 
     * @return returns the number of turns it took for the stack to be empty
     */
    public static int tileGame(ArrayDeque<Integer> stack, Queue<Integer> q){
        //the number of turns for the stack to be empty
        int count = 0;
        System.out.println(stack);
        //loops through until the stack is empty
        while(!stack.isEmpty()){
            //checks the first item in the satack to check which case needs to be performed
            int num = stack.pop();
            //if num = 1 pops the first item in the stack
            if(num == 1){
                //if there is nothing in the stack it does nothing 
                if(stack.peek() !=null){
                stack.pop();
                }
                count++;
                //if num = 2 pops the 2 more items from the stack
            }else if(num == 2){
                //if there is nothing in the stack it does not do anything
                if(stack.peek() != null){
                stack.pop();
                }
                //if there is nothing in the stack it does not do anything
                if(stack.peek()!= null){
                stack.pop();
                }
                count++;
                //if num = 3 it takes the first 3 items from the queue and puts them in the stack
            }else if(num == 3){
                for(int i = 0; i < 3; i++){
                    stack.push(q.poll());
                }
                count++;
            }
            System.out.println(stack);
        }
        return count;
    }
}
