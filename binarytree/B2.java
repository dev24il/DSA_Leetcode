package binarytree;

public class B2 {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }

        int lt = maxDepth(root.left);
        int rt = maxDepth(root.right);
        return Math.max(lt, rt) + 1;
    }
}
