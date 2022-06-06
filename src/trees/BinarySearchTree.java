package trees;

/*

    * Binary Tree

    - Every node has 0, 1 or 2 children.
    - Children are referred to as left child and right child.
    - In practice, we use binary search trees.

    * Binary Search Tree (BST)

    - Can perform insertions, deletions, and retrievals in O(logn) time.
    - The left child always has a smaller value than its parent.
    - The right child always has a larger value than its parent.
    - This means everything to the left of the root is less than the value of the root, and everything
to the right of the root is greater than the value of the root.
    - Because of that, we can do a binary search.

    * Traversal

    - Level -> visit nodes on each level.
    - Pre-order -> visit the root of every subtree first.
    - post-order -> visit the root of every subtree last.
    - in-order -> visit left child, then root, then right child.
 */
public class BinarySearchTree {

    public static void main(String[] args) {

        Tree intTree = new Tree();

        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();
        System.out.println();

        intTree.traversePreOrder();
        System.out.println();

        intTree.traversePosOrder();
        System.out.println();


//        System.out.println(intTree.get(27));
//        System.out.println(intTree.get(17));
//        System.out.println(intTree.get(8888));
//
//        System.out.println(intTree.min());
//        System.out.println(intTree.max());

//        intTree.delete(8888);
//        intTree.traverseInOrder();
//        System.out.println();

    }
}
