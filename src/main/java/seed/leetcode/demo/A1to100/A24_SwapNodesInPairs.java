package seed.leetcode.demo.A1to100;

import seed.leetcode.demo.ListNode;
import seed.leetcode.demo.Utility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seedli on 2017/1/31.
 */
public class A24_SwapNodesInPairs {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        Utility.printListNodeVal(swapPairs(Utility.ListToListNode(list)));
    }

    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode HeadNode = head.next;
        ListNode prevNode = null;

        while(head != null && head.next != null){
            ListNode first = head;
            ListNode second = head.next;
            first.next = head.next.next;
            second.next = first;

            if(prevNode != null){
                prevNode.next = second;
            }

            head = first.next;
            prevNode = first;
        }

        return HeadNode;
    }
}
