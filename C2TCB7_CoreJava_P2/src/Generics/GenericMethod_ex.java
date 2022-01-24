/**
 * 
 */
package Generics;

/**
 * @author user
 *
 */
public class GenericMethod_ex {
	
	
	/**
	 * @param args
	 */
	public static <E> void displayArrayElements(E[] elements) {

		for (E element : elements) {
			System.out.println("element is: " + element);
		}
	}

	public static void main(String[] args) {
		GenericMethod_ex obj=new GenericMethod_ex();
		Integer[] intarray= {10,20,30,40};
		String[] str= {"abc","progarm", "learing"};
		
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str);

	}

}
