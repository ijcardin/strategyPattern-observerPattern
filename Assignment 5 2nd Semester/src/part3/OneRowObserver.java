package part3;

import java.util.ArrayList;

public class OneRowObserver implements Observer {
	private Subject objectToWatch;
	private ArrayList<Double> listToWatch;
	/**
	 * constructor that connects the class variable objectToWatch with the object being passed in and then 
	 * adds this to the arraylist of Observers
	 * @param data
	 */
	public OneRowObserver(Subject data) {
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
	 * Prints appropriate notifcation message and outputs the list in one row
	 */
	public void display() {
		System.out.println("\nNotification to One-Row Table Observer: Data Changed: ");
		for(int i = 0; i < listToWatch.size(); i++)
			System.out.print(listToWatch.get(i) + " ");	
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
