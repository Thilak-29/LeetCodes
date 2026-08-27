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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        postorder(root,li);
        return li;
    }
    void postorder(TreeNode root,List<Integer> li){
        if(root == null){
            return;
        }
        li.add(root.val);
        postorder(root.left,li);
        postorder(root.right,li);
        
    }
}