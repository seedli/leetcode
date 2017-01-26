package seed.leetcode.demo;

public class AddTwoNumbers {

    public static void main(String[] args){

    }

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

            if(l1 != null && l1.next != null){
                l1 = l1.next;
            }else{
                l1 = null;
            }
            if(l2 != null && l2.next != null){
                l2 = l2.next;
            }else{
                l2 = null;
            }
        }

        return ansHead.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}


