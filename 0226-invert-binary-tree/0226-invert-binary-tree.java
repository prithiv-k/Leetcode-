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
    public TreeNode invertTree(TreeNode root) {
        inv(root);
        return root;
    }public void inv(TreeNode root){
        if(root==null){
            return ;
        }
        inv(root.left);
        inv(root.right);
        if(root.left!=null&&root.right!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
        }else if(root.left!=null&&root.right==null){
            root.right=root.left;
            root.left=null;
        }else{
            root.left=root.right;
            root.right=null;        }
        
    }
}