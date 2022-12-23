public class LinkedListNode {
    int val;
    LinkedListNode next;

    LinkedListNode() {
    }

    LinkedListNode(int x) {
        val = x;
    }

    LinkedListNode(int x, LinkedListNode next) {
        val = x;
        this.next = next;
    }

    public static LinkedListNode createLinkedList(int[] arr) {
        LinkedListNode head = new LinkedListNode(arr[0]);
        LinkedListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new LinkedListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static LinkedListNode mergeLinkedLists(LinkedListNode l1, LinkedListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val < l2.val) {
            l1.next = mergeLinkedLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeLinkedLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 4 };
        int[] arr2 = { 1, 3, 4 };
        LinkedListNode l1 = createLinkedList(arr1);
        LinkedListNode l2 = createLinkedList(arr2);
        LinkedListNode result = mergeLinkedLists(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null)
                System.out.print(", ");
            result = result.next;
        }
    }
}
