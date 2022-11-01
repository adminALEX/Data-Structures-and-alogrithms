package Queue.Queuebyclass;

import java.util.ArrayDeque;
import java.util.Queue;


public class QueueMain {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<>();
        q.add("Hi");
        q.add("Hello");
        q.add("Clean");
        q.add("Axe");
        q.add("Ben");
        q.add("Click");
        q.add("XoXo");
        System.out.println(q);
        QueueFunctions r = new QueueFunctions();
        r.reversify(q);
        System.out.println(q);
        r.sort(q);
        System.out.println(q);
    }
}
