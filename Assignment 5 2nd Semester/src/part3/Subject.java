package part3;
/**
 * Framework whose purpose is to add, remove, and notify the observer of any changes.
 * @author Ian
 *
 */
public interface Subject {
	
	public void addObserver (Observer o);
	public void removeObserver (Observer o);
	public void notifyObserver ();
	
}
