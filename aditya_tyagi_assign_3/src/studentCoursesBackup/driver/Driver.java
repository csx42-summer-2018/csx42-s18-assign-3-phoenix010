package studentCoursesBackup.driver;

import studentCoursesBackup.myTree.BinarySearchTree;
import studentCoursesBackup.myTree.Node;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Checking BST with user input");
		BinarySearchTree bst = new BinarySearchTree();
		Node node;
		node = bst.insertNode(1200, "A");
		node = bst.insertNode(1201, "A");
		node = bst.insertNode(1202, "A");
		node = bst.insertNode(1200, "B");
		node = bst.insertNode(1200, "B");
		node = bst.insertNode(1201, "B");
		node = bst.insertNode(1200, "A");
		
		bst.inorder(node);
		 
		
//		bst.inorder(root);

		
	}
}
