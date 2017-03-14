package seed.leetcode.demo.A1to100;

import seed.leetcode.demo.ListNode;

/**
 * Created by seedli on 2017/2/12.
 */
public class A61_RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head == null || head.next == null) return head;
        int length = 1;

        //check length of list
        ListNode headCopy = head;
        while(headCopy.next != null){
            length++;
            headCopy = headCopy.next;
        }
        //make k shorter
        if(k > length){
            k = k%length;
        }

        for(int i=0; i<k; i++){
            ListNode itr=head;
            while(itr.next.next != null){
                itr = itr.next;
            }
            itr.next.next = head;
            head= itr.next;
            itr.next = null;
        }
        return head;
    }

}
