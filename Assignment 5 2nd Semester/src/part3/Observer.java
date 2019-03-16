package part3;

import java.util.ArrayList;
/**
 * interface whose purpose is to define the method update that all observers must implement
 * @author Ian
 *
 */
public interface Observer {
	public void update(ArrayList<Double> list);
}
