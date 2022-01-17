package Collection_FrameWork_day14;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_demo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(new Integer(10));
		ll.add("hi");
		ll.addFirst("hello");
		ll.add(0, 20);
		ll.add(2, 30);
		Iterator i1 = ll.iterator();
		while (i1.hasNext()) {
			Object o = i1.next();
			System.out.println(o);
		}

	}

}
