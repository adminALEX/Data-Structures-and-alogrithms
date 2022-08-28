package Stack;
public class DStack{


    Node top = null;

    void pop() {
        if(top==null){
            System.out.println("Underflow");
        }
        else{
            System.out.println("Popped element is "+top.data);
            top = top.next;
            display();
        }
    }

    void display() {
        Node temp=top;
        if(temp==null){
            System.out.println("No elements to display.");
        }
        else{
            while(temp!=null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    
    void push(int i) {

        Node newNode = new Node(i);
        newNode.next = top;
        top = newNode;
        System.out.println("pushed "+top.data);
        display();
        
    }

    public void peek() {
        System.out.println("Peeked value is : " + top.data);
    }

}