package binarytree;

public class B4 {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode temp = new TreeNode(root.val);
        temp.left = invertTree(root.right);
        temp.right = invertTree(root.left);
        return temp;
    }
}
