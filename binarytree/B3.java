package binarytree;

public class B3 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if((p==null && q!=null) || (p!=null && q==null)){
            return false;
        }

        if(p.val != q.val){
            return false;
        }
        boolean lt = isSameTree(p.left, q.left);
        boolean rt = isSameTree(p.right, q.right);
        return lt && rt;
    }
}
