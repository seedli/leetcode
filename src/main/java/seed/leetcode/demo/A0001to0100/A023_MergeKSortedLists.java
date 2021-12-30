package seed.leetcode.demo.A0001to0100;

import seed.leetcode.demo.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 2017/2/2.
 */
public class A023_MergeKSortedLists {

    //TLE
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) return null;
        else if(lists.length==1) return lists[0];

        ListNode head = new ListNode(0);
        int smallistIdx = -1;
        int smallist = Integer.MAX_VALUE;
        for(int i=0; i<lists.length; i++){
            if(lists[i] != null && lists[i].val < smallist){
                smallist = lists[i].val;
                smallistIdx = i;
            }
        }
        if(smallistIdx == -1) return null;

        head = lists[smallistIdx];
        for(int i=0; i<lists.length; i++){
            if(i==smallistIdx) continue;
            head = mergeTwoLists(head,lists[i]);
        }
        return head;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        ListNode head = new ListNode(0); //?¸?”¨???
        ListNode node = new ListNode(0); //è¢«æ?†ç??

        if(l1.val < l2.val){
            head = l1;
            node = l2;
        }else{
            head = l2;
            node = l1;
        }
        ListNode realHead = head;

        while(head.next != null && node !=null){
            if(node.val >= head.val){
                if(head.next.val > node.val){
                    ListNode tmpNode = node;
                    node = node.next;
                    tmpNode.next = head.next;
                    head.next = tmpNode;
                }
                head = head.next;
            }
        }
        if(node != null){
            head.next = node;
        }

        return realHead;
    }

    //TLE
    public ListNode mergeKLists_OLD(ListNode[] lists) {
        ListNode theNode = new ListNode(0);
        ListNode head = theNode;

        boolean AllEnd = false;

        while( ! AllEnd){
            AllEnd = true;
            int Smaller = Integer.MAX_VALUE;
            int SmallerIdx = 0;
            for(int i=0; i<lists.length; i++){
                if(lists[i] == null){
                    continue;
                }
                AllEnd = false;
                if(lists[i].val < Smaller){
                    Smaller = lists[i].val;
                    SmallerIdx = i;
                }
            }
            if( ! AllEnd){
                theNode.next = lists[SmallerIdx];
                theNode = theNode.next;
                if(lists[SmallerIdx].next == null){
                    lists[SmallerIdx] = null;
                }else{
                    lists[SmallerIdx] = lists[SmallerIdx].next;
                }
            }
        }

        return head.next;
    }


}
