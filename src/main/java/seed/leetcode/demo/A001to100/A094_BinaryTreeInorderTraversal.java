package seed.leetcode.demo.A001to100;

import seed.leetcode.demo.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by User on 2017/3/8.
 */
public class A094_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

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

        return result;
    }

    //push TreeNode to the stack until the TreeNode.left is null
    private void pushStack(Stack<TreeNode> stack, TreeNode node){
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }
}
