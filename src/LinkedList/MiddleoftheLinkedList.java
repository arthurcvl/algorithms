package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode a = head;
        ListNode c = head;

        while(a != null && a.next != null){
            a = a.next.next;
            c = c.next;
        }
        return c;
    }
}
