package studentCoursesBackup.util;

import studentCoursesBackup.myTree.Node;

public class TreeBuilder {



	
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
	
	public void inorder(Node root) {
		if(root == null) {
			return ;
		}
		inorder(root.left);
		System.out.println(root.bNo+" "+ root.courseName );
		inorder(root.right);
		
		
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
////		Node node1 = move(node,bNo);
//		if(node1.courseName.contains(course)) {
//			 node1.courseName.remove(course);
//		}
//		return node1;
		return null;
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
	public Node move(Node root, int bNo,String course) {
//	    System.out.println("I am ");
		if (bNo == root.bNo) {
	    	if(root.courseName.contains(course))
	    		root.courseName.remove(course);
	        
	    	return root;   
	    }
	    if (bNo > root.bNo && root.left!= null && root.right != null) {
	        return move(root.right,bNo,course);
	    }
	    if(root.left== null && root.right == null &&  root.bNo != bNo)
			return root;
		
	    return move(root.left,bNo,course);
	}
		
}