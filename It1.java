package Assigment;

import java.util.*;

public class It1 {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(100);
		l.add(150);
		l.add(200);
		l.remove(2);
		Iterator i=l.iterator();
		//l.remove(0); gives error 
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
