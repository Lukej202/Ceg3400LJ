package Labs;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class Lab09 {
    public static void main(String[] args) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(2);
        s.push(2);
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(3);
        q.offer(1);
        q.offer(2);
        q.offer(1);

        System.out.println(TileGame.tileGame(s, q));

    }
}
