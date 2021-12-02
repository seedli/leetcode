package seed.leetcode.demo.A001to100;

import seed.leetcode.demo.ListNode;

/**
 * Created by User on 2017/2/17.
 */
public class A086_PartitionList {

    public ListNode partition(ListNode head, int x) {
        if(head==null) return null;
        if(head.next == null) return head;

        ListNode fakeHead = new ListNode(x-1);
        fakeHead.next = head;
        ListNode node = head;
        head = fakeHead;

        while(node.next != null){
            if(node.val < x){
                head = head.next;
                node = node.next;
            }else if(node.val >= x && node.next.val < x){ //??�到比X小�?? 移到??�面
                ListNode tmpNode = node.next;
                node.next = tmpNode.next;
                tmpNode.next = head.next;
                head.next = tmpNode;
                head = head.next;
            }else if(node.val >= x){
                node = node.next;
            }

        }
        return fakeHead.next;
    }

}
