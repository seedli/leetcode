package seed.leetcode.demo;

/**
 * Created by User on 2017/1/26.
 */
public class A19_RemoveNodeFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode Node = head;
        int length = 0;

        while(Node != null){
            length ++;
            Node = (Node == null) ? Node : Node.next;
        }
        System.out.println("length="+length);
        if(length == 1){
            head = null;
        }else{
            int IdxToRemove = length - n + 1; //Index start with 1
            System.out.println("IdxToRemove="+IdxToRemove);
            Node = head; //back to head

            if(IdxToRemove == 1){ // remove first
                System.out.println("remove first");
                head = Node.next;
            }else if(IdxToRemove == length){ // remove last
                System.out.println("remove last");
                for(int i=1; i<=length; i++){
                    System.out.println("Node:"+Node.val);
                    if(i == IdxToRemove - 1){
                        Node.next = null;
                        break;
                    }
                    Node = Node.next;
                }
            }else{ //remove middle
                System.out.println("remove middle");
                ListNode TmpNode = new ListNode(0);
                for(int i=1; i<=length; i++){
                    System.out.println("Node:"+Node.val);
                    if( i == IdxToRemove-1){
                        TmpNode = Node;
                    }
                    if( i == IdxToRemove+1){
                        TmpNode.next = Node;
                    }
                    Node = Node.next;
                }
            }
        }
        return head;
    }
}
