package studentCoursesBackup.driver;

import studentCoursesBackup.myTree.BinarySearchTree;
import studentCoursesBackup.myTree.Node;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Checking BST with user input");
		BinarySearchTree bst = new BinarySearchTree();
//		Node root;
		bst.insertNode(1200, "A");
		bst.insertNode(1201, "A");
		bst.insertNode(1202, "A");
		bst.insertNode(1200, "B");
		
		
//		bst.inorder(root);

		
	}
}
