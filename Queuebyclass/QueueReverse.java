package Queuebyclass;

import java.util.ArrayDeque;
import java.util.Queue;


public class QueueReverse {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q1 = new ArrayDeque<>();
        q.add(10);
        System.out.println(q);

        System.out.println(q1);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        Reverse r = new Reverse();
        r.reversify(q);
        System.out.println(q);
    }
}
