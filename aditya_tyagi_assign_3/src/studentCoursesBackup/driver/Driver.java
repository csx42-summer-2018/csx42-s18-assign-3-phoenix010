package studentCoursesBackup.driver;

import java.io.IOException;

import java.util.Scanner;



import studentCoursesBackup.myTree.Node;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.TreeBuilder;

public class Driver {
	static TreeBuilder bst = new TreeBuilder();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException,CloneNotSupportedException{
		System.out.println("Checking BST with user input");
		
		
		Node node = null;
		Node backup_Node_1=null;
		Node backup_Node_2 = null;
		
		//will need try-catch block
		//will need try-catch block
		String input = args[0];
		System.out.println(input);
		
		FileProcessor file = new FileProcessor(input);
				
		String line;
		
		while((line = file.readLine()) != null) { 
			
			String splitLine[] = line.split(":");
			int value = Integer.parseInt(splitLine[0]);
			node = bst.insertNode(node,value, splitLine[1]); 
		}
		bst.inorder(node);
		
		
//		System.out.println();
//		bst.inorder(backup_Node_1);
//		System.out.println();
//		bst.inorder(backup_Node_2);

		
		/**
		 * @ Hardcoded inputs
		 */
		
		/*
		node = bst.insertNode(1200, "A");
		node = bst.insertNode(1200, "C");
		node = bst.insertNode(1201, "A");
		node = bst.insertNode(1201, "B");
		node = bst.insertNode(1202, "A");
		node = bst.insertNode(1200, "B");
		System.out.println("Aditya");
		
		*/
		
		
		
//		System.out.println("************************");
//		bst.inorder(backup_Node_1);
//		System.out.println("************************");
//		bst.inorder(backup_Node_2);
		/*
		System.out.println("Code for Deletion");
		String delete = args[1];
		FileProcessor file1 = new FileProcessor(delete);
	
		String line1;
		System.out.println(delete);
		while((line1 = file1.readLine()) != null) { 
			String splitLine1[] = line1.split(":");
			del(node,splitLine1[0], splitLine1[1]); 
		}
		bst.inorder(node);
		searchBno(node);
		}
	
	public static void del(Node node, String bNo,String courseName) {
		try {
			int val2 = Integer.parseInt(bNo);
			if(bst.searchNode(node,val2)) {
				//delete function call
				bst.deleteCourses(node, val2, courseName);
				}
//			else 
//				System.out.println("Bno is not in our database");
				
			
		}catch(NumberFormatException eq) {
			System.out.println("Invalid Input. You cant input characters. You need to type integers");
		}
	

	}
	*/
	
	
	
  }
}
