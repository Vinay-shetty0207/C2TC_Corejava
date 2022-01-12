package General;

import java.util.ArrayList;

public class OddNum {

	public static void main(String[] args) {
		ArrayList e=new ArrayList();
		e.add(4);
		e.add(3);
		e.add(5);
		e.add(6);
		e.add(7);
		e.add("sam");
		e.add('c');
		e.add(3.3777);
		//System.out.println(a1);
		System.out.println("the odd numbers are");
		for(int i=0;i<e.size();i++)
		{
			Object obj=e.get(i);
			if(obj instanceof Integer)
			{
				int a=(Integer)obj;
				if(a%2!=0)
				{
					System.out.println(a);
				}
			}
		}
		
	}

}
