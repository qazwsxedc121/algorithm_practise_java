package BinarySearchTree;

import Util.Task;

/**
 * User: guoxc
 * Date: 15-5-15
 * Time: 15:34
 */
class TreeNode {
    TreeNode left;
    TreeNode right;
    TreeNode parent;
    int value;
    public TreeNode(TreeNode p, int v){
        left = null;
        right = null;
        parent = p;
        value = v;
    }
    public void inorderTreeWalk(Task t){
        if(left != null){
            left.inorderTreeWalk(t);
        }
        t.run(value);
        if(right != null){
            right.inorderTreeWalk(t);
        }

    }
}
