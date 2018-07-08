package studentCoursesBackup.driver;

import java.io.IOException;

import java.util.Scanner;

import studentCoursesBackup.myTree.BinarySearchTree;
import studentCoursesBackup.myTree.Node;
import studentCoursesBackup.util.FileProcessor;

public class Driver {
	static BinarySearchTree bst = new BinarySearchTree();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.println("Checking BST with user input");

		Node node = null;
		
		//will need try-catch block
		String input = args[0];
		System.out.println(input);
		
		FileProcessor file = new FileProcessor(input);
				
		String line;
		
		while((line = file.readLine()) != null) { 
			
			String splitLine[] = line.split(":");
			int value = Integer.parseInt(splitLine[0]);
			node = bst.insertNode(value, splitLine[1]); 
		}
		
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
		bst.inorder(node);		
		
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
//		searchBno(node);
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
	
	public static void searchBno(Node node) {
		System.out.println("Enter the Bno you want to search");
		String value = scanner.nextLine();
		try {
			int val = Integer.parseInt(value);
			if(bst.searchNode(node,val)) 
				System.out.println("Bno is in our database");
			else
				System.out.println("Bno is not in our database");

		}catch(NumberFormatException eq) {
			System.out.println("Invalid Input. You cant input characters. You need to type integers");
		}
		
	}
}
