package seed.leetcode.demo.A001to100;

import seed.leetcode.demo.ListNode;

/**
 * Created by User on 2017/3/3.
 */
public class A092_ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n || head == null || head.next == null) return head;

        ListNode fakeHead = new ListNode(0);
        ListNode nodeM = new ListNode(0), nodeN = new ListNode(0), beforeM = new ListNode(0);
        fakeHead.next = head;
        head = fakeHead;

        int idx = 0;

        //find m, n
        while(head != null){
            if(idx+1 == m){
                beforeM = head;
                nodeM = head.next;
            }
            if(idx+1 == n){
                nodeN = head.next;
            }
            if(idx+1 > n) break;

            head = head.next;
            idx++;
        }

        //reverse the list from m to n
        while(beforeM.next != nodeN){
            beforeM.next = beforeM.next.next;
            nodeM.next = nodeN.next;
            nodeN.next = nodeM;
            nodeM = beforeM.next;
        }

        return fakeHead.next;
    }


}
