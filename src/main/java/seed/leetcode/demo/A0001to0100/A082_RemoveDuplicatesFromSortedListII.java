package seed.leetcode.demo.A0001to0100;

import seed.leetcode.demo.ListNode;

/**
 * Created by seedli on 2017/2/16.
 */
public class A082_RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode node = new ListNode(head.val-1);
        node.next = head;
        ListNode newHead = node;
        ListNode dummy = node;

        while(node.next != null){
            if(dummy.next.val == dummy.val){
                dummy = dummy.next;
            }else{
                dummy = dummy.next;
                node.next = dummy;
                if(dummy.next == null || dummy.next.val != dummy.val){
                    node = node.next;
                }
            }
            if(dummy.next == null) node.next = null;
        }
        return newHead.next;
    }

}
