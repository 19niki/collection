package Set;

import java.util.HashSet;

public class Sample4 {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(10);
		h.add(20);
		h.add(45);
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(45);
		System.out.println(h.containsAll(h1));
		System.out.println(h);
	}

}
