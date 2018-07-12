package studentCoursesBackup.util;

import java.util.ArrayList;



import studentCoursesBackup.myTree.Node;

public class TreeBuilder {
	ArrayList<Node>arrli;
	ArrayList<Node>arrli1;
	ArrayList<Node>arrli2;

	public TreeBuilder() {
		this.arrli = new ArrayList<Node>();
		this.arrli1 = new ArrayList<Node>();
		this.arrli2 = new ArrayList<Node>();
	}
	



	private Node addRecursive(Node current, int value, String courseNew) {
	    if (current == null) {
	    	current = new Node(value,null,null);
	    	current.courseName.add(courseNew);
	    	return current;
//	        return new Node(value);
	        
	    }
	 
	    if (value < current.bNo) {
	        current.left = addRecursive(current.left, value, courseNew);
	    } if (value > current.bNo) {
	        current.right = addRecursive(current.right, value,courseNew);
	    } if(value == current.bNo) {
	        // value already exists
	    	if(current.courseName.contains(courseNew))
	    			return current;
	    	else
	    		current.courseName.add(courseNew);
	    }
	 
	    return current;

	}
	
	

	public Node insertNode(Node node,int bNo, String courseNew) {
		Node root = addRecursive(node, bNo, courseNew);
		return root;
		
	}
	
	
	
	public  ArrayList<Node> inorderRecursive(Node root){
		
			if (root == null){
				return null;
			}else{
				inorderRecursive(root.left);
				arrli.add(root);
				inorderRecursive(root.right);
			}
			return arrli;
		}
	public  ArrayList<Node> inorderRecursive1(Node root){
		
		if (root == null){
			return null;
		}else{
			inorderRecursive1(root.left);
			arrli1.add(root);
			inorderRecursive1(root.right);
		}
		return arrli1;
	}
	public  ArrayList<Node> inorderRecursive2(Node root){
		
		if (root == null){
			return null;
		}else{
			inorderRecursive2(root.left);
			arrli2.add(root);
			inorderRecursive2(root.right);
		}
		return arrli2;
	}
	
	
	
	public String printNodes(Node root) {
		if(root == null) {
			return "";
		}
		printNodes(root.left);
		System.out.println(root.bNo+" "+ root.courseName );
		printNodes(root.right);
		
		return "" ;
	}
	public boolean searchNode(Node root, int bno) {
	    if (root == null) {
	        return false;
	    } 
	    if (bno == root.bNo) {
	        return true;
	    } 
	    return bno < root.bNo
	      ? searchNode(root.left, bno)
	      : searchNode(root.right, bno);
	}
	
	public Node deleteCourses(Node node, int bNo, String course) {
		Node node1 = move(node,bNo);
		if(node1.courseName.contains(course)) {
			 node1.courseName.remove(course);
		}
		return node1;

	}
	
	public Node search(Node root, int bNo) {
		if(root.bNo == bNo) {
			return root;
		}
		if (bNo > root.bNo) {
	        return search(root.right,bNo);
	    }
		
		
	    return search(root.left,bNo);
	}
	private Node move(Node root, int bNo) {
//	    System.out.println("I am ");
		if (bNo == root.bNo) {
			 return root;   
		}
		if (bNo > root.bNo) {
			return move(root.right,bNo);
		}
		return move(root.left,bNo);
		}
		
}