/**
 * 
 */
package Generics;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author user
 *
 */
public class Generic_ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //generic type
		list.add("india");
		list.add("bangalore");

		String country = list.get(0);
		System.out.println("element is "+ country);
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext());
		System.out.println(itr.next());

	}

}
