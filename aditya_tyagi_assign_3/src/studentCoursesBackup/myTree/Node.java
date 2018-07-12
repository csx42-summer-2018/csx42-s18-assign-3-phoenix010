package studentCoursesBackup.myTree;
import java.util.ArrayList;


public class Node implements Subject,Observer {
	public int bNo;
	public Node reference_1;
	public Node reference_2;
	private ArrayList<Observer> observer ;   //Arraylist of listners
	public ArrayList<String> courseName;//ArrayList of Courses
	public Node left;
	public Node right;
	
	public Node(int bNo, Node reference_1, Node reference_2) {
		this.bNo = bNo;
		this.courseName = new ArrayList<String>(); 
		this.observer =  new ArrayList<Observer>();
		this.left = null;
		this.right = null;
		this.reference_1 = reference_1;
		this.reference_2 = reference_2;

	}

	public ArrayList<Observer> getObserver() {
		return observer;
	}

//	
//	public Node getReference_1() {
//		return reference_1;
//	}
//
//	public Node getReference_2() {
//		return reference_2;
//	}

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


	
//	@Override
//	public void registerObserver(Observer o) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void removeObserver(Observer o) {
//		// TODO Auto-generated method stub
//		int i = observer.indexOf(o);
//		observer.remove(i);
//	}




	@Override
	public Node[] updateAllListners(Node node, Node backup_Node_1,Node backup_Node_2,String subject,Mode m1) {
		
//		System.out.println("Update for Insertion");
		if(m1.name().equalsIgnoreCase("INSERT")) {
		
//		backup_Node_1.courseName(node.getCourseName());
		backup_Node_1.courseName.clear();
		backup_Node_1.courseName.addAll(node.getCourseName());
		
		backup_Node_2.courseName.clear();
		backup_Node_2.courseName.addAll(node.getCourseName());
		
		Node[] newArray= new Node [2];
		
		newArray[0] = backup_Node_1;
		newArray[1] = backup_Node_2;
		
		return newArray;
		}
		if(m1.name().equalsIgnoreCase("DELETE")) {
			backup_Node_1.courseName.remove(subject);
			backup_Node_2.courseName.remove(subject);
			Node[] newArray= new Node [2];
			newArray[0] = backup_Node_1;
			newArray[1] = backup_Node_2;
			return newArray;
		}
		return null;
				
		
//		Node head = node;
//		node.reference_1 = head;
//		head.courseName = backup_Node_1.courseName;
//		
//		node.reference_2 = head;
//		head.courseName = backup_Node_2.courseName;
		
	}

@Override
public Node[] notifyObservers(Node node, Node backup_Node_1, Node backup_Node_2, String subject,Mode m1) {// If you add return statement then this error will be removed.
	
//	System.out.println("Notifying for insertion");

	Node[] newNode = updateAllListners(node, backup_Node_1, backup_Node_2,subject,m1);
	return newNode;

}
	
	
}
