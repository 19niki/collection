package Set;

import java.util.HashSet;

public class Sample2 {

	public static void main(String[] args) {
		HashSet h=new HashSet();	
           h.add(10);
           h.add(20);
           h.add(30);
           HashSet h1=new HashSet();
           h1.add(30);
           h1.add(45);
           h1.add(20);
         h.addAll(h1);// add all distinct elements form h1 to h
         System.out.println(h);
         System.out.println("size of set one:"+h.size());
         System.out.println("size of set two:"+h1.size());
         
	}

}
