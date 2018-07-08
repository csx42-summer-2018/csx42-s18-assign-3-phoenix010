package studentCoursesBackup.myTree;

//Reference of BST "http://baeldung.com/java-binary-tree"
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

	private Node deleteRecursive(Node current, int value) {
		if(current == null)
			return null;
		
		if(value == current.bNo) {
			//....Node to delete found
			
			// a node has no children 
			if (current.left == null && current.right == null) {
			    return null;
			}
			// a node that has exactly one child
			if (current.right == null) {
			    return current.left;
			}
			 if (current.left == null) {
			    return current.right;
			}
			 // a node that has two children
			 int smallestValue = findSmallestValue(current.right);
			 current.bNo = smallestValue;
			 current.right = deleteRecursive(current.right, smallestValue);
			 return current;
		      }
		  
		
		if(value < current.bNo) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
		return current;
	}
	
	public void deleteNode(Node root, int value) {
		deleteRecursive(root, value);
	}
	
	private int findSmallestValue(Node root) {
	    return root.left == null ? root.bNo : findSmallestValue(root.left);
	}
	
	public void deleteCourses(Node node, int bNo, String course) {
		System.out.println("Deletion of Course");
		node = move(node,bNo);
		System.out.println(node.getbNo());
		if(node.courseName.contains(course)) {
			System.out.println("LOL");
			node.courseName.remove(course);
			inorder(node);
			System.out.println("*******************");
		}
		else {
			System.out.println("Course is not present");
		}
    }
	private Node move(Node root, int bNo) {
	    System.out.println("I am ");
	    if (bNo == root.bNo) {
	        return root;   //LINE 12
	    }
	    if (bNo > root.bNo) {
	        return move(root.right,bNo);
	    }
	    return move(root.left,bNo);
	}
		
}
	

