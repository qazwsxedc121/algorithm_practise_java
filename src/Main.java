import BinarySearchTree.BinarySearchTree;
import Util.Task;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static class ListCollector implements Task{
        public List<Integer> l = new ArrayList<Integer>();
        @Override
        public void run(Object o) {
            l.add((Integer) o);

        }
    }
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println(bst.isEmpty());

        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(1);
        ListCollector t = new ListCollector() ;
        bst.inorderWalk(t);
        System.out.println(t.l);
    }
}
