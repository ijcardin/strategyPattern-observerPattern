package part1and2;

import java.util.ArrayList;
/**
 * 
 * @author Ian
 * This interface is the basis for all sort strategies and all strategies that are added must implement
 * the abstract class.
 * @param <T>
 */
public interface Sorter<T>  {

	abstract void sort(ArrayList<Item> nums);

}
