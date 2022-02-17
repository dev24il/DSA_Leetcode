package binarytree;

import java.util.ArrayList;
import java.util.List;

public class B1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root == null){
            return arr;
        }

        inorder(root, arr);
        return arr;
    }

    public void inorder(TreeNode root, List<Integer> arr){
        if(root == null){
            return;
        }

        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
    }
}
