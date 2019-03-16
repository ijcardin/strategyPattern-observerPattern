package part3;

import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
	
	private ArrayList<Double> data;
	private ArrayList<Observer> allObservers;
	/**
	 * default constructor that initializes both class variables of ArrayList<Double> and ArrayList<Observer>
	 */
	public DoubleArrayListSubject() {
		data = new ArrayList<Double>();
		allObservers = new ArrayList<Observer>();
	}
	/**
	 * prints out all the doubles inside the data ArrayList
	 */
	public void display() {
		for(int i = 0; i < data.size(); i++)
			System.out.print(data.get(i));
	}
	/**
	 * receives an array of type double and fills up the data arraylist
	 * @param arr
	 */
	public void populate(double[] arr) {
		for(int i = 0; i < arr.length; i++)
			data.add(arr[i]);
	}
	/**
	 * Adds a double to the existing ArrayList, also lets other observers know about the change
	 * @param num
	 */
	public void addData(double num) {
		data.add(num);
		notifyObserver();
	}
	/**
	 * Changes an existing element in the ArrayList and lets all the observers know about the change
	 * @param num
	 * @param index
	 */
	public void setData(double num, int index) {
		data.set(index, num);
		notifyObserver();
	}
	/**
	 * Adds an observer to the observer ArrayList
	 */
	@Override
	public void addObserver(Observer o) {
		allObservers.add(o);
	}
	/**
	 * Removes an observer from the observer ArrayList
	 */
	@Override
	public void removeObserver(Observer o) {
		allObservers.remove(o);
	}
	/**
	 * notifies the observers currently stored in the observer ArrayList about any changes.
	 */
	@Override
	public void notifyObserver() {
		for (Observer o: allObservers){
			o.update(data);
		}
	}

}
