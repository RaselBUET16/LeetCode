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
 class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; left = null; right = null;}
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public void insert(int val) {
        if (val < this.val) {
            if (this.left == null) {
                this.left = new TreeNode(val);
            } else {
                this.left.insert(val);
            }
        } else {
            if (this.right == null) {
                this.right = new TreeNode(val);
            } else {
                this.right.insert(val);
            }
        }
    }
}

class Solution {
   public TreeNode sortArr(int[] nums, int i, int j) {
       if (i == j) {
           return new TreeNode(nums[i]);
       }
       if (i > j) {
           return null;
       }
       int rootIndex = (int)(Math.ceil((i+ j)/2));
       TreeNode root = new TreeNode(nums[rootIndex]);
       root.left = sortArr(nums, i, rootIndex - 1);
       root.right = sortArr(nums, rootIndex+1, j);
       return root;
   }
   public TreeNode sortedArrayToBST(int[] nums) {
       TreeNode root = sortArr(nums, 0, nums.length - 1);
       return root;
   }
}