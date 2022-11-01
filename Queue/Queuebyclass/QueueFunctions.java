package Queue.Queuebyclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;
import java.util.Stack;

public class QueueFunctions{

    public void reversify(Queue<String> q) {
        Stack<String> st = new Stack<String>();
        while(!q.isEmpty())
            st.add(q.remove());
        while(!st.isEmpty()){
            q.add(st.pop()); 
        }
    }

    public Queue<String> sort(Queue<String> q) {

        ArrayList<String> arr = new ArrayList<>();
        while(!q.isEmpty()){
        arr.add(q.poll());
    }
    Collections.sort(arr);
    for (String string : arr) {
        q.add(string);
    }

    return q; 
}
}
