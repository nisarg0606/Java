package leetcode;

public class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /*
         * Input: list1 = [1,2,4], list2 = [1,3,4]
         * Output: [1,1,2,3,4,4]
         */
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        if (list1.val < list2.val) { // if l1.val is less than l2.val
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }


    public static void main(String[] args) {
        MergeTwoLinkedList mtl = new MergeTwoLinkedList();
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode mergedList = mtl.mergeTwoLists(list1, list2);
        mergedList.display();
    }
}
