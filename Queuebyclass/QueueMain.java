package Queuebyclass;

import java.util.ArrayDeque;
import java.util.Queue;
public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1030);
        q.add(1020);
        q.add(10450);
        q.add(13450);
        q.add(167600);
        System.out.println(q);
    }
    
}
