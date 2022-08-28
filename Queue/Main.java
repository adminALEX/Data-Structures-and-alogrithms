package Queue;
 
public class Main
{
    public static void main (String[] args)
    {
        Queue q = new Queue(5);
        System.out.println(q);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        System.out.println("The queue size is " + q.size());

        q.dequeue();
        System.out.println("The queue size is " + q.size());

        System.out.println(q); //Gives an output of ClassName@MemoryLocation

        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}
