class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;
    }

    public void preorder(TreeNode root, List<Integer> ans) {

        // Base Case
        if(root == null)
            return;

        // Visit Root
        ans.add(root.val);

        // Traverse Left
        preorder(root.left, ans);

        // Traverse Right
        preorder(root.right, ans);
    }
}