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
    static TreeNode fin(int []nums,int s,int e){
        if(s>e){
            return null;
        }else{
            int mid=(s+e)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=fin(nums,s,mid-1);
            root.right=fin(nums,mid+1,e);
        return root;
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       return fin(nums,0,nums.length-1);
      
        
    }
}