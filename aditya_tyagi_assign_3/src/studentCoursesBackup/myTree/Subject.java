package studentCoursesBackup.myTree;

public interface Subject {

//	public void registerObserver(Observer o);
//	public void removeObserver(Observer o);
	public Node[] notifyObservers(Node node, Node backup_Node_1, Node backup_Node_2, String subject,Mode m1);
}
