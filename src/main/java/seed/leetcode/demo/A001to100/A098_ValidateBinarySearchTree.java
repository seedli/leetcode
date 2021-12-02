package seed.leetcode.demo.A001to100;

import seed.leetcode.demo.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by User on 2017/3/14.
 */
public class A098_ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;

        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        pushStack(stack, node);

        while( ! stack.isEmpty()){
            node = stack.pop();
            result.add(node.val);
            if (node.right != null){
                pushStack(stack, node.right);
            }
        }
        int val = result.pop();
        while(!result.isEmpty()){
            int compare = result.pop();
            if(val >= compare) return false;
            val = compare;
        }
        return true;
    }

    //push TreeNode to the stack until the TreeNode.left is null
    private void pushStack(Stack<TreeNode> stack, TreeNode node){
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }

}
