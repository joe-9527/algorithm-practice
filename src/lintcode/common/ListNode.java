package lintcode.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static void printNodeList(ListNode head) {
        if (head == null) {
            System.out.println(head);
        }

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
