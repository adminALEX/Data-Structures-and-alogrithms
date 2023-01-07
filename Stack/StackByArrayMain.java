
public class StackByArrayMain {

    public static void main(String[] args) {
        StackByArray stack = new StackByArray(5);
        stack.push(23);
        stack.push(43);
        stack.push(5);
        // stack.push(87);
        stack.pop();
        stack.peek();
        stack.printStack();
    }

}