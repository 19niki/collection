package Assigment;
import java.util.*;
public class Driver1 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	ArrayList<Book1> b=new ArrayList<Book1>();
	b.add(new Book1(1,"java","Abc"));
	b.add(new Book1(2,"Sql","Pqr"));
	b.add(new Book1(2,"Selenium","xyz"));
	Iterator<Book1> il=b.iterator();
	int count=0;
	System.out.println("Enter the Book Title to be removed : ");
	String title = s.next() ;
	for(int i=0; i<b.size();i++)
	{
	if(b.get(i).name.equalsIgnoreCase(title))	
	{
		b.remove(i);
	}
	}
System.out.println(b.size());
}
}
