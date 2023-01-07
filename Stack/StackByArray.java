public class StackByArray {
    int size;
    int[] stack;
    int top;
    StackByArray(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }
    public void push(int n){
        if(top<size){
            stack[++top] = n;
            printStack();
        }
        else
            System.out.println("Stack is full");
    }
    protected void printStack() {
        for (int i = 0; i <=top; i++) {
            System.out.print(stack[i]+"\t");
        }
        System.out.println();
    }
    public void peek(){
        if(top>=0)
            System.out.println(stack[top]);
        else{
            System.out.println("Stack is empty");
            System.exit(0);
    }
    }
    public void pop(){
        if(top>0){
            System.out.println("Popped element is " +stack[top--]);
        }
        else{
            System.out.println("Stack is empty");
            System.exit(0);
        }
    }

}
