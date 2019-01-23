public class IntersectionTwoList160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int aLength = getNodeLength(headA);
        int bLength = getNodeLength(headB);

        ListNode aNode = headA, bNode = headB;

        if (aLength > bLength) {
            for (int i = 0; i < aLength - bLength; i++) {
                aNode = aNode.next;
            }
        }

        if (aLength < bLength) {
            for (int i = 0; i < bLength - aLength; i++) {
                bNode = bNode.next;
            }
        }

        while (aNode != bNode) {
            aNode = aNode.next;
            bNode = bNode.next;
        }
        return aNode;
    }

    private int getNodeLength(ListNode head) {
        if (head == null) {
            return 0;
        }
        int length = 1;
        ListNode next = head.next;
        while (next != null) {
            length++;
            next = next.next;
        }
        return length;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
