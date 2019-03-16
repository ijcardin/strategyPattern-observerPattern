package part1and2;
import java.util.ArrayList;
/**
 * 
 * @author Ian
 * This is a generic class that receives an ArrayList of type Item and uses the selection sort to sort it.
 * @param <T>
 */
public class SelectionSorter<T> implements Sorter<T> {

	@Override
	public void sort(ArrayList<Item> nums) {

		for (int i = 0; i < nums.size()-1; i++){
			int min = i;
			for (int j = i + 1; j < nums.size(); j++)
				if(nums.get(j).compareTo(nums.get(min)) < 0)
					min = j;
			Item temp= nums.get(min);
			nums.set(min, nums.get(i));
			nums.set(i, temp);
		}		
	}	
}
