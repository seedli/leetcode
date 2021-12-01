package seed.leetcode.demo.A001to100;

import seed.leetcode.demo.ListNode;

public class A2_AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode ansHead = ans;
        int CarryNum = 0;

        while(l1 != null || l2 != null || CarryNum != 0){
            ans.next = new ListNode(0);
            ans = ans.next;

            int L1 = l1 == null ? 0 : l1.val;
            int L2 = l2 == null ? 0 : l2.val;
            int Sum = (L1 + L2 + CarryNum) % 10;
            CarryNum = (L1 + L2) / 10;
            System.out.println(Sum + " " + CarryNum);

            ans.val = Sum;

            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }

        return ansHead.next;
    }
}


