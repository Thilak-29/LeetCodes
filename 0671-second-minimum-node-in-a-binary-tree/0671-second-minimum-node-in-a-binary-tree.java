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
    public void dfs(TreeNode root, Set<Integer> uniques) {
        if (root != null) {
            uniques.add(root.val);
            dfs(root.left, uniques);
            dfs(root.right, uniques);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null)return -1;
        Set<Integer> uniques = new HashSet<Integer>();
        dfs(root, uniques);
        if (uniques.size() < 2) {
            return -1;
        }
        ArrayList<Integer> sorted = new ArrayList<>(uniques);
        Collections.sort(sorted);
        return(sorted.get(1));
    }
}