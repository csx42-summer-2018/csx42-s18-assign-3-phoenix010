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
//		BinarySearchTree bst = new BinarySearchTree();
		Node node = null;
		
		//will need try-catch block
		String input = args[0];
		System.out.println(input);
		String delete = args[1];
		FileProcessor file = new FileProcessor(input);
		
		String line;
		
		while((line = file.readLine()) != null) { 
			//line = file.readLine();
//			System.out.println(line);
			String splitLine[] = line.split(":");
			int value = Integer.parseInt(splitLine[0]);
//			System.out.println(splitLine[0]);
//			System.out.println(splitLine[1]);
//			node = bst.insertNode(Integer.parseInt(splitLine[0]), splitLine[1]);
			node = bst.insertNode(value, splitLine[1]); 
//			bst.inorder(node);

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
		/**
		 * The below code is for searching Bno
		 */
		/*
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
		
		*/
		
		/**
		 * The below code is for deleting nodes
		 */
		/*
		System.out.println("Enter the Bno you want to delete");
		String value1 = scanner.nextLine();
		try {
			int val = Integer.parseInt(value1);
			bst.deleteNode(node, val);
			System.out.println("Bno deleated");
			bst.inorder(node);
		}catch(NumberFormatException eq) {
			System.out.println("Invalid Input. You cant input characters. You need to type integers");
			eq.printStackTrace();
		}
			*/
	/*
		System.out.println("Enter the bno and the Coursename for the deletion Operation");
		System.out.println("Enter the bno");
		String in = scanner.nextLine();
		System.out.println("ENter the CourseName");
		String cr = scanner.nextLine();
		*/
//		String in = "1202";
//		String cr = "B";
//		del(node,in,cr);
//		bst.inorder(node);
				
		
		

		
	}
	
	public static void del(Node node, String bNo,String courseName) {
		/*try {
			int val2 = Integer.parseInt(bNo);
			if(bst.searchNode(node,val2)) {
				//delete function call
				bst.deleteCourses(node, val2, courseName);
				}
			else
				System.out.println("Bno is not in our database");

		}catch(NumberFormatException eq) {
			System.out.println("Invalid Input. You cant input characters. You need to type integers");
		}*/
		
		
		try {
			int val2 = Integer.parseInt(bNo);
			bst.deleteCourses(node, val2, courseName);
		}catch(NumberFormatException eq) {
			System.out.println("Invalid Input. You cant input characters. You need to type integers");
		}
				

	}
	
	
}
