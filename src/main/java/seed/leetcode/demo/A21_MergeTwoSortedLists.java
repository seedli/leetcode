package seed.leetcode.demo;

/**
 * Created by User on 2017/2/18.
 */
public class A21_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        ListNode head = new ListNode(0); //選用的
        ListNode node = new ListNode(0); //被拆的

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

}
