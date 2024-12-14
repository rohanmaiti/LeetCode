/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
        return false;

        targetSum -= root.val;
        if(root.left == null && root.right== null && targetSum == 0)
        {
            return true;
        }
        if(root.left == null && root.right== null && targetSum != 0)
        {
            return false;
        }
        boolean leftStatus = false;
        boolean rightStatus = false;
        if(root.left != null){
         leftStatus = hasPathSum(root.left,targetSum);
        }
        if(leftStatus == true)
        return true;
        if(root.right != null){
         rightStatus = hasPathSum(root.right,targetSum);
        }
        if(leftStatus == true || rightStatus == true)
        return true;
        else {
            return false;
        }


    }
}