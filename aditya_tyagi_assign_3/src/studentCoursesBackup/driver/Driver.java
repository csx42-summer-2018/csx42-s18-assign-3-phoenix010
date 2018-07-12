package studentCoursesBackup.driver;

import java.io.IOException;

import java.util.Scanner;



import studentCoursesBackup.myTree.Node;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.TreeBuilder;
import studentCoursesBackup.myTree.Mode;
import studentCoursesBackup.util.Results;



public class Driver {
	static TreeBuilder bst = new TreeBuilder();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
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
			
			// works when you have unique bNo in the input
			if(!bst.searchNode(node,value)) { 
				node = bst.insertNode(node,value, splitLine[1]);
				backup_Node_1= bst.insertNode(backup_Node_1,value, splitLine[1]);
				backup_Node_2= bst.insertNode(backup_Node_2, value, splitLine[1]);
			}
			else {// if we get same bno and same subject.
					node = bst.insertNode(node,value, splitLine[1]);
					Mode m1 = Mode.INSERT;
					Node[] newNode = node.notifyObservers(node,backup_Node_1,backup_Node_2,splitLine[1],m1); 
					backup_Node_1 = newNode[0];
					backup_Node_2 = newNode[1];
			}
		}
		
		bst.inorder(node);
		System.out.println();
		bst.inorder(backup_Node_1);
		System.out.println();
		bst.inorder(backup_Node_2);
		System.out.println("ADIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIDDDDDDDDDDDDDDDDDDDDDDDDDDIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
		Results result1 = new Results();
		Results result2 = new Results();
		Results result3 = new Results();

//		result1.writeToFile1(bst.inorder(node));
//		result3.writeToFile1(bst.inorder(backup_Node_2));
//		System.out.println(s);
//		result2.writeToFile1(bst.inorder(backup_Node_2));
//		result2.writeToFile2(bst.inorder(backup_Node_1));
//		result3.writeToFile3(bst.inorder(backup_Node_2));
//		results.writeToFile(bst.inorder(node);

		System.out.println("Code for Deletion");
		String delete = args[1];
		FileProcessor file1 = new FileProcessor(delete);
	    Node node1 = null;
		String line1;
		System.out.println(delete);
		while((line1 = file1.readLine()) != null) { 
			String splitLine1[] = line1.split(":");
			int val1 = Integer.parseInt(splitLine1[0]);
			if(bst.searchNode(node, val1)) {
			node1 = bst.move(node,val1,splitLine1[1]);
			}
		}	
			
			
			
			
			
			
			
			
			
			
			
			
			
//			del(node,backup_Node_1,backup_Node_2,splitLine1[0], splitLine1[1]);
		
		bst.inorder(node1);
//		System.out.println();
		
		
//		System.out.println();
//		bst.inorder(backup_Node_1);	
//		System.out.println();
//		bst.inorder(backup_Node_2);
		
		
	
//		System.out.println("**********");
//		bst.inorder(backup_Node_1);
//		System.out.println("***********");
//		bst.inorder(backup_Node_2);
////		searchBno(node);
		}
	
//	public static void del(Node node, Node backup_Node_1, Node backup_Node_2,String bNo,String courseName) {
//		try {
//			Node[] newNode = new Node[2];
//			int val2 = Integer.parseInt(bNo);
//			if(bst.searchNode(node,val2)) {
//				//delete function call
//				bst.deleteCourses(node, val2, courseName);
//				Mode m1 = Mode.INSERT;
//				newNode = node.notifyObservers(node,backup_Node_1,backup_Node_2,courseName,m1); 
//				backup_Node_1 = newNode[0];
//				backup_Node_2 = newNode[1];
//				}
//			
////			returnStrings(newNode);
//
////			else 
////				System.out.println("Bno is not in our database");
//				
//			
//		}catch(NumberFormatException eq) {
//			System.out.println("Invalid Input. You cant input characters. You need to type integers");
//		}
//	
//	}
}