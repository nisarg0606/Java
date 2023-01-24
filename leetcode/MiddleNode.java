package leetcode;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int middle = (count % 2 == 0) ? (count / 2) + 1 : (count + 1) / 2;
        int i = 1;
        while (i < middle) {
            head = head.next;
            i++;
        }
        return head;
    }

    public void display(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        MiddleNode mn = new MiddleNode();
        ListNode.display(mn.middleNode(list));
        list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode.display(mn.middleNode(list));
    }
}
