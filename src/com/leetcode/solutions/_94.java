package com.leetcode.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        TreeNode curr=root;
         while (curr != null || stack.size() > 0) 
        { 

            while (curr !=  null) 
            { 
                stack.push(curr); 
                curr = curr.left; 
            } 
             curr = stack.pop(); 
            result.add(curr.val);

            curr = curr.right; 
        }
        
        return result;
    }
}
