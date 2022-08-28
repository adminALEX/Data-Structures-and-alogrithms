package Queue.Queuebyclass;

import java.util.Queue;
import java.util.Stack;

public class Reverse{

    public void reversify(Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        while(!q.isEmpty())
            st.push(q.remove());
        while(!st.isEmpty()){
            q.add(st.pop()); 
        }
    }
    
}
