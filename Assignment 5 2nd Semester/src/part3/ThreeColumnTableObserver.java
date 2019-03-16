package part3;

import java.util.ArrayList;

public class ThreeColumnTableObserver implements Observer {
	private Subject objectToWatch;
	private ArrayList<Double> listToWatch;
	/**
	 * constructor that connects the class variable objectToWatch with the object being passed in and then 
	 * adds this to the arraylist of Observers
	 * @param data
	 */
	public ThreeColumnTableObserver(Subject data) {
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
	 * Prints appropriate notifcation message and outputs the list with three columns
	 */
	public void display() {
		System.out.println("\nNotification to Three-Column Table Observer: Data Changed: ");
		int columnCount = 0;
		for(int i = 0; i < listToWatch.size(); i++) {
			if(columnCount == 2) {
				System.out.print(listToWatch.get(i) + "\n");
				columnCount = 0;
			}
			else {
				System.out.print(listToWatch.get(i) + " ");
				columnCount++;
			}
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
