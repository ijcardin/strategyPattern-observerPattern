package part1and2;

import java.math.BigDecimal;

/* ENSF 480 - Lab 5 Exercise A and B
 * M. Moussavi, October 2018
 */

class Item <E extends Number> implements Comparable<Item>{
	private E item;
	public Item(E value) {
		item = value;
	}
	
	public void setItem(E value){
		item = value;
	}
	
	public E getItem(){
		return item;
	}
	/**
	 * Since variables of type number do not implement comparable, this function compares the numbers by converting
	 * them into big decimal format and using compareTo.
	 * @param o
	 * @return
	 */
	@Override
	public int compareTo(Item o) {
		BigDecimal b1 = new BigDecimal(this.getItem().doubleValue());
	    BigDecimal b2 = new BigDecimal(o.getItem().doubleValue());
	    
	    if(b1.compareTo(b2) > 0)
	    	return 1;
	    else
	    	return -1;
	}

}
