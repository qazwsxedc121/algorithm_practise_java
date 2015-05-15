package BinarySearchTree;

import Util.Task;

/**
 * User: guoxc
 * Date: 15-5-15
 * Time: 15:33
 */
public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int v){
        if(isEmpty()){
            root = new TreeNode(null, v);
            return;
        }
        TreeNode fast = root;
        TreeNode slow = fast;
        while (fast != null){
            slow = fast;
            if(v < fast.value){
                fast = fast.left;
            }else {
                fast = fast.right;
            }
        }
        if(v < slow.value){
            slow.left = new TreeNode(slow, v);
        }else{
            slow.right = new TreeNode(slow, v);
        }
    }

    public void inorderWalk(Task t){
        root.inorderTreeWalk(t);
    }
}
