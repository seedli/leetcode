package seed.leetcode.demo.A101to200;

//https://leetcode.com/problems/path-sum-ii/description/

import seed.leetcode.demo.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class A113_PathSumII {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null) return result;

        backtracking(root, sum, new ArrayList<>());

        return result;
    }

    private void backtracking(TreeNode node, int sum, List<Integer> record){

        //copy record to a new ArrayList and add current node value
        List<Integer> nRecord = new ArrayList<>(record);
        nRecord.add(node.val);

        //calculate sum
        sum = sum - node.val;

        if(node.left == null && node.right == null){
            if(sum == 0){
                result.add(nRecord);
            }
            return;
        }else if(node.left != null && node.right == null){
            backtracking(node.left, sum, nRecord);
        }else if(node.left == null && node.right != null){
            backtracking(node.right, sum, nRecord);
        }else{
            backtracking(node.left, sum, nRecord);
            backtracking(node.right, sum, nRecord);
        }
    }


}
