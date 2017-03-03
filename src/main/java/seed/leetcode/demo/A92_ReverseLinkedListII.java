package seed.leetcode.demo;

/**
 * Created by User on 2017/3/3.
 */
public class A92_ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n || head == null || head.next == null) return head;

        ListNode fakeHead = new ListNode(0);
        ListNode nodeM = new ListNode(0), nodeN = new ListNode(0), beforeM = new ListNode(0), beforeN = new ListNode(0);
        fakeHead.next = head;
        head = fakeHead;

        int idx = 0;

        //get m, n
        while(head != null){
            if(idx+1 == m){
                beforeM = head;
                nodeM = head.next;
            }
            if(idx+1 == n){
                beforeN = head;
                nodeN = head.next;
            }
            if(idx+1 > n) break;

            head = head.next;
            idx++;
        }

        //switch m,n
        ListNode tmpNext = nodeN.next;
        beforeM.next = nodeN;
        beforeN.next = nodeM;
        nodeN.next = nodeM.next;
        nodeM.next = tmpNext;


        return fakeHead.next;
    }


}
