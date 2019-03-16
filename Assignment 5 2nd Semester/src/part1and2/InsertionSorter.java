package part1and2;

import java.util.ArrayList;
/**
 * 
 * @author Ian
 * This is a generic class that receives an ArrayList of type Item and uses the insertion sort to sort it.
 * @param <T>
 */
public class InsertionSorter<T> implements Sorter<T> {

	@Override
	public void sort(ArrayList<Item> nums) {
		
		for (int i = 1, j; i < nums.size(); i++){
			Item temp = nums.get(i);
			for (j = i; j > 0 && temp.compareTo(nums.get(j-1)) < 0; j--)
				nums.set(j, nums.get(j-1));
			nums.set(j, temp);
		}		
	}
}
