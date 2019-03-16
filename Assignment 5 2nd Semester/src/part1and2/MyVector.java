package part1and2;

import java.util.ArrayList;
/**
 * 
 * @author Ian
 * Generic class that is initialized by an integer which defines the size of the arraylist class variable. This class can 
 * be any type Number
 * @param <E>
 */
public class MyVector<E> {
	
	private ArrayList<Item> storageM;
	private Sorter sorter;
	/**
	 * constructor that receives an integer n and creates an arraylist of size n
	 * @param n
	 */
	public MyVector(int n) {
		storageM = new ArrayList<Item>(n);
	}
	/**
	 * Receives an ArrayList of type item and creates a shallow copy with the class variable storageM
	 * @param a
	 */
	public MyVector(ArrayList<Item> a) {
		storageM = a;
	}
	/**
	 * adds an Item to the arraylist
	 * @param newItem
	 */
	public void add(Item newItem) {
		storageM.add(newItem);
	}
	/**
	 * This will set the type of sort we want to implement on our arraylist
	 * @param s
	 */
	public void setSortStrategy(Sorter<E> s) {
		sorter = s;
	}
	/**
	 * This prints out all the elements in the arraylist.
	 */
	public void display() {
		for(int i = 0; i < storageM.size();i++)
			System.out.println(storageM.get(i).getItem());
	}
	/**
	 * implements the sort method defined in the concrete classes.
	 */
	public void performSort() {
		sorter.sort(storageM);
	}
}
