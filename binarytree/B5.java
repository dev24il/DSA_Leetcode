package binarytree;

public class B5 {
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeavesHelper ( root , root ) ;
    }
    
    public int sumOfLeavesHelper ( TreeNode node , TreeNode parent ){
        if( node == null ){
            return 0 ;
        }
        if( node == parent.left && ( node.left == null && node.right == null ) ) {
            return node.val ;
        }
        int leftVal = sumOfLeavesHelper ( node.left , node ) ;
        int rightVal = sumOfLeavesHelper ( node.right , node ) ;
        return leftVal + rightVal ;
    }
}
