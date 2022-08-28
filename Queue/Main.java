package Queue;
 
public class Main
{
    public static void main (String[] args)
    {
        Queue q = new Queue(5);
 
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(324);
        q.enqueue(12);
        q.enqueue(24);

        System.out.println("The front element is " + q.peek());
        q.dequeue();
        System.out.println("The front element is " + q.peek());
 
        System.out.println("The queue size is " + q.size());
 
        q.dequeue();
        q.dequeue();
 
        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}
