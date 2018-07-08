package studentCoursesBackup.myTree;


import java.util.ArrayList;


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

	public ArrayList<String> getCourseName() {
		return courseName;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}
	
}
