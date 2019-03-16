package part3;

import java.util.ArrayList;

public class FiveRowsTableObserver implements Observer {
	private Subject objectToWatch;
	private ArrayList<Double> listToWatch;
	/**
	 * constructor that connects the class variable objectToWatch with the object being passed in and then 
	 * adds this to the arraylist of Observers
	 * @param data
	 */
	public FiveRowsTableObserver(Subject data) {
		objectToWatch = data;
		follow();
	}
	/**
	 * connects the class variable listToWatch with the list being passed in
	 */
	@Override
	public void update(ArrayList<Double> list) {
		listToWatch = list;
		display();	
	}
	/**
	 * Prints appropriate notifcation message and outputs the list using five rows
	 */
	public void display() {
		System.out.println("\nNotification to Five-Rows Table Observer: Data Changed: ");
		int count = 0;
		for(int i = 0; i < listToWatch.size(); i++) {
			if(i + 10 < listToWatch.size()) {
				System.out.print(listToWatch.get(i) + " " + listToWatch.get(i+5) + " " + listToWatch.get(i+10) + "\n");
				count += 3;
			}
			else if(i + 5 < listToWatch.size()) {
				System.out.print(listToWatch.get(i) + " " + listToWatch.get(i+5));
				count += 2;	
			}
			if(count == listToWatch.size())
				break;
		}
		System.out.println();
	}
	/**
	 * Adds the object to the list of observers
	 */
	public void follow() {
		objectToWatch.addObserver(this);
	}
	/**
	 * removes the object from the list of observers
	 */
	public void unfollow() {
		objectToWatch.removeObserver(this);
	}

}
