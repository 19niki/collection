package Set;

import java.util.*;

public class Bag {

	public static void main(String[] args) 
	{
    HashSet<Book> bag=new HashSet<>();
    bag.add(new Book(45,"niki",45));
    bag.add(new Book(55,"iki",89));
    bag.add(new Book(45,"niki",45));
   Iterator<Book> il=bag.iterator();
   while(il.hasNext())
   {
	   System.out.println(il.next());
   }
   ArrayList<Book> a=new ArrayList<>(bag);
   
   Collections.sort(a);
   for(Book b: a)
   {
	   b.details();
   }
   // System.out.println(bag);


	}

}
