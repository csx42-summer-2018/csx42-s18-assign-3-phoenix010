package studentCoursesBackup.myTree;

public class BinarySearchTree {

	Node root;

	
	private Node addRecursive(Node current, int value, String courseNew) {
	    if (current == null) {
	    	current = new Node(value);
	    	current.courseName.add(courseNew);
	    	return current;
//	        return new Node(value);
	        
	    }
	 
	    if (value < current.bNo) {
	        current.left = addRecursive(current.left, value, courseNew);
	    } else if (value > current.bNo) {
	        current.right = addRecursive(current.right, value,courseNew);
	    } else {
	        // value already exists
	    	if(current.courseName.contains(courseNew))
	    			return current;
	    	else
	    		current.courseName.add(courseNew);
	    }
	 
	    return current;

	}
	
	

	public Node insertNode(int bNo, String courseNew) {
		// TODO Auto-generated method stub
		root = addRecursive(root, bNo, courseNew);
		return root;
		
	}
	
	public void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.bNo+" "+ root.courseName );
		inorder(root.right);
	}
	
}
