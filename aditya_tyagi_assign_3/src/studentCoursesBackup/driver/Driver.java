package studentCoursesBackup.driver;

import java.io.IOException;

import java.util.Scanner;

import studentCoursesBackup.myTree.BinarySearchTree;
import studentCoursesBackup.myTree.Node;
import studentCoursesBackup.util.FileProcessor;

public class Driver {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.println("Checking BST with user input");
		BinarySearchTree bst = new BinarySearchTree();
		Node node = null;
		
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
		
		System.out.println("Enter the Bno you want to delete");
		String value1 = scanner.nextLine();
		try {
			int val = Integer.parseInt(value);
			bst.deleteNode(node, val);
			System.out.println("Bno deleated");
			bst.inorder(node);
		}catch(NumberFormatException eq) {
			System.out.println("Invalid Input. You cant input characters. You need to type integers");
			eq.printStackTrace();
		}
		
		
				
		
		
		

		
	}
	
	
}
