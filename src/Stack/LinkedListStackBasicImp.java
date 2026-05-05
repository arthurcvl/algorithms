package Stack;


class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; this.next = null; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

public class LinkedListStackBasicImp {

    private Node head;
    private int counter;

    public LinkedListStackBasicImp(){
        head = null;
        counter = 0;
    }

    public void add(int value){
        head = new Node(value, head);
        counter++;
    }

    public int pop(){
        if(head == null) return -1;

        Node destroyNode = head;
        head = head.next;
        counter--;
        return destroyNode.val;
    }

    public int peek(){
        if(head == null) return -1;
        return head.val;
    }

    public int size(){
        return counter;
    }

}
