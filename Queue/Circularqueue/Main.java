package Queue.Circularqueue;


public class Main {
    public static void main(String[] args) {
        Circularqueue cq = new Circularqueue(6);

        cq.enqueue(12);
        cq.enqueue(43);
        cq.enqueue(45);
        cq.enqueue(22);
        cq.enqueue(11);
        System.out.println(cq);
        cq.dequeue();
        cq.dequeue();
        System.out.println(cq);
        cq.enqueue(78);
        System.out.println(cq);
        cq.enqueue(7823);
        System.out.println(cq);
        cq.enqueue(56);
        cq.dequeue();
        cq.enqueue(65);
        System.out.println(cq);

    }
}
