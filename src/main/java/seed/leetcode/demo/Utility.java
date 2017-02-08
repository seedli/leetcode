package seed.leetcode.demo;

import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 2017/2/2.
 */
public class Utility {

    public static void printListNodeVal(ListNode node){
        if(node == null){
            return;
        }
        ListNode head = new ListNode(0);
        while(node != null){
            System.out.print(node.val);
            if(node.next != null){
                System.out.print("->");
            }
            node = node.next;
        }
        node = head;
        System.out.println();
    }

    public static ListNode ListToListNode(List list){
        ListNode node = new ListNode(0);
        ListNode head = node;
        if(list.size() == 0) return null;

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            node.next = new ListNode(0);
            node = node.next;
            node.val = iterator.next();
        }
        return head.next;
    }

}
