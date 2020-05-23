package com.leetcode.solutions;

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
class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p==null && q!=null)||(q==null && p!=null))
            return false;
        
        if(p==null && q==null)
            return true;
        
        if(p.val!=q.val)
            return false;
        
        return true && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}