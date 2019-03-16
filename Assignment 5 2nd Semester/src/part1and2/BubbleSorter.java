package part1and2;

import java.util.ArrayList;
/**
 * 
 * @author Ian
 * This is a generic class that receives an ArrayList of type Item and uses the bubblesort to sort it.
 * @param <T>
 */
public class BubbleSorter<T> implements Sorter<T> {

	@Override
	public void sort(ArrayList<Item> nums) {

		for (int i = 0; i < nums.size() - 1; i++){
			for (int j = nums.size() -1 ; j > i; j--){
				if(nums.get(j).compareTo(nums.get(j-1))< 0) {
					Item temp = nums.get(j-1);  
					nums.set(j-1, nums.get(j));
					nums.set(j, temp);
				}
			}
		}
	}
}
