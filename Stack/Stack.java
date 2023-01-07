public class Stack{
    public static void main(String[] args) {
        DStack ds = new DStack();
        ds.push(5);
        ds.push(10);
        ds.push(20);
        ds.display();
        ds.peek();
        ds.pop();
        System.out.println("\n\n\n");
        NDStack nds = new NDStack(5);
        nds.push(23);
        nds.push(11);
        nds.pop();
        nds.push(14);
        nds.push(54);
        nds.push(671);
        nds.pop();
        nds.pop();
        nds.push(99);
        nds.push(901);
        nds.push(77);
        nds.pop();
        nds.display();
        nds.peek();
    }
}
