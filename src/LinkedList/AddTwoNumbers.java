package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int overflow = 0;
        int sum;
        ListNode head = new ListNode();
        ListNode next = head;
        while(l1 != null || l2 != null || overflow != 0){
            sum = l1 != null && l2 != null ? l1.val + l2.val :
                    l1 != null ? l1.val : l2 != null ? l2.val : 0;

            overflow = createNewNode(next, sum, overflow);
            next = next.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return head.next;
    }

    public static int createNewNode(ListNode left, int sum, int overflow){
        int aValue;
        int totalSum = sum + overflow;
        if(totalSum > 9){
            aValue = totalSum % 10;
            overflow = totalSum / 10;
        } else {
            aValue = totalSum;
            overflow = 0;
        }

        left.next = new ListNode(aValue);

        return overflow;
    }

}
