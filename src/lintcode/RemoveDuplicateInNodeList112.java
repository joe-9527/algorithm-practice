package lintcode;

import lintcode.common.ListNode;

import java.util.HashSet;

public class RemoveDuplicateInNodeList112 {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        HashSet<Integer> exists = new HashSet<>();
        exists.add(head.val);

        // 每次判断当前节点的下一节点是否重复
        ListNode curNode = head;
        while (curNode.next != null) {
            if (exists.contains(curNode.next.val)) {
                curNode.next = curNode.next.next;
            } else {
                exists.add(curNode.next.val);
                curNode = curNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(2, null);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        RemoveDuplicateInNodeList112 ins = new RemoveDuplicateInNodeList112();
        ListNode head = ins.deleteDuplicates(node1);
        ListNode.printNodeList(head);
    }

}

