/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        ListNode listNodeHead = new ListNode(-1);
        ListNode listNode = listNodeHead;
        while (listNode1 != null && listNode2 != null) {
            ListNode next;
            if (listNode1.val < listNode2.val) {
                next = new ListNode(listNode1.val);
                listNode1 = listNode1.next;
            } else {
                next = new ListNode(listNode2.val);
                listNode2 = listNode2.next;
            }
            listNode.next = next;
            listNode = listNode.next;
        }
        listNode.next = listNode1 == null ? listNode2 : listNode1;
        return listNodeHead.next;
    }
}

