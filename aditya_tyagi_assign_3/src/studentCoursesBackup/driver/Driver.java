package studentCoursesBackup.driver;

import java.io.IOException;

import studentCoursesBackup.myTree.BinarySearchTree;
import studentCoursesBackup.myTree.Node;
import studentCoursesBackup.util.FileProcessor;

public class Driver {
	public static void main(String[] args) throws IOException {
		System.out.println("Checking BST with user input");
		BinarySearchTree bst = new BinarySearchTree();
		Node node;
		
		//will need try-catch block
		String input = args[0];
//		System.out.println(input);
		FileProcessor file = new FileProcessor(input);
		
		
		String line;
		while((line = file.readLine()) != null) { 
			//line = file.readLine();
//			System.out.println(line);
			String splitLine[] = line.split(":");
//			System.out.println(splitLine[0]);

//			System.out.println(splitLine[1]);
			node = bst.insertNode(Integer.parseInt(splitLine[0]), splitLine[1]);
			bst.inorder(node);
		}
		//node = bst.insertNode(arg, courseNew)
		
			
	
			
		
//		Validation vd = new Validation();
//		vd.cmdValidation(args);
//		StringProcessor str = new StringProcessor();
//		String input = str.processing(file);
		
//		node = bst.insertNode(1200, "A");
//		node = bst.insertNode(1201, "A");
//		node = bst.insertNode(1202, "A");
//		node = bst.insertNode(1200, "B");
//		node = bst.insertNode(1200, "B");
//		node = bst.insertNode(1201, "B");
//		node = bst.insertNode(1200, "A");
		
		
//		bst.inorder(node);// printing tree in ascending order as according to the Bno
		 
		

		
	}
	
	
}
