package leetcode;

public class ReverseList {
    /* public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        int[] list = createListfromListNode(head);
        list = reverseList(list);
        return createListNodefromList(list);
    }

    public ListNode createListNodefromList(int[] list) {
        ListNode head = new ListNode(list[0]);
        ListNode current = head;
        for (int i = 1; i < list.length; i++) {
            current.next = new ListNode(list[i]);
            current = current.next;
        }
        return head;
    }

    public int[] createListfromListNode(ListNode head) {
        int[] list = new int[0];
        ListNode current = head;
        while (current != null) {
            list = addElement(list, current.val);
            current = current.next;
        }
        return list;
    }

    public int[] addElement(int[] list, int element) {
        int[] newList = new int[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            newList[i] = list[i];
        }
        newList[list.length] = element;
        return newList;
    }

    public int[] reverseList(int[] list) {
        int[] reversedList = new int[0];
        for (int i = list.length - 1; i >= 0; i--) {
            reversedList = addElement(reversedList, list[i]);
        }
        return reversedList;
    }

    public int[] insertElement(int[] list, int element) {
        int[] newList = new int[list.length + 1];
        int i = 0;
        while (i < list.length && list[i] < element) {
            newList[i] = list[i];
            i++;
        }
        newList[i] = element;
        while (i < list.length) {
            newList[i + 1] = list[i];
            i++;
        }
        return newList;
    } */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        ReverseList rl = new ReverseList();
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversedList = rl.reverseList(list);
        ListNode.display(reversedList);
    }
}
