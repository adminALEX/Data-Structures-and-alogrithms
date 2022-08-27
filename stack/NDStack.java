package stack;

public class NDStack {
    int[] stack;
    int top = 0;
    NDStack(int n){
        stack = new int[n];
    }

    public void push(int i) {
        if(top<0)
            System.out.println("Stack is empty");

        else{
            stack[top] = i;
            System.out.println("Pushed : " + stack[top]);
            top++;

        }
    }

    public void display() {
        int temp = top-1;
        while(temp>=0){
            System.out.println(stack[temp]);
            temp--;
        }
    }

    public void peek() {
        System.out.println("Peek :"+ stack[top-1]);
    }

    public void pop() {
        if(top<0)
            System.out.println("Stack underflow");

        else{
            System.out.println("Popped element is : " + stack[top-1]);
            top--;
        }
    }
}
