/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static TreeNode solution(TreeNode root,TreeNode p,TreeNode q){
        if(root == null)
        return null;
        if(root == p)
        return p;
        else if(root == q)
        return q;

        TreeNode leftCall = solution(root.left, p, q);
        TreeNode rightCall = solution(root.right, p, q);
        if(leftCall == null && rightCall == null)
        return null;
        else if(leftCall != null && rightCall != null)
        return root;
        else if(leftCall != null)
        return leftCall;
        else return rightCall;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return solution(root,p,q);
    }
}