package Queue.Circularqueue;

import java.util.Arrays;

public class Circularqueue {

    int q[];
    int qsize;
    int rear;
    int front;

    Circularqueue(int l){
        q = new int[l];
    }
    public void enqueue(int i) {
        if(qsize==q.length)
            throw new StackOverflowError("Stack is Full");
        q[rear] = i;
        rear = (rear+1)%q.length;
        qsize++;
    }

    public void dequeue() {
        q[front] = 0;
        front = (front+1)%q.length;
        qsize--;
    }

    @Override
    public String toString() {
        return Arrays.toString(q);
    }

    
    
}
