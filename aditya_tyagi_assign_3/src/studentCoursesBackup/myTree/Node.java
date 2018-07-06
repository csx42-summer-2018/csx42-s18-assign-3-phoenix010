package studentCoursesBackup.myTree;


import java.util.ArrayList;
import java.util.List;

public class Node {
	public int bNo;
	public ArrayList<String> courseName; 
	Node left;
	Node right;
	
	public Node(int bNo) {
		this.bNo = bNo;
		this.courseName = new ArrayList<String>();
        this.left = null;
		this.right = null;

	}

	public int getbNo() {
		return bNo;
	}

	public ArrayList getCourseName() {
		return courseName;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
	
//	 public static Node createNode(int bNo, String courseName) {
//	        return new Node(bNo, courseName);
//	    }
	
}
