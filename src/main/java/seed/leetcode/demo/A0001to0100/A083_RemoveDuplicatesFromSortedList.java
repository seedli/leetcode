package seed.leetcode.demo.A0001to0100;

import seed.leetcode.demo.ListNode;

/**
 * Created by seedli on 2017/2/16.
 */
public class A083_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;

        ListNode newHead = head;
        ListNode tmpNode = head.next;

        while(tmpNode != null){
            if(head.val == tmpNode.val){
                tmpNode = tmpNode.next;
            }else{
                head.next = tmpNode;
                head = head.next;
            }
            if(tmpNode == null){
                head.next = null;
            }
        }
        return newHead;
    }
}
