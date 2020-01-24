package Set;

public class Book implements Comparable<Book>
{
   int id;
   String name;
   int price;
   Book()
   {
   
   }
public Book(int id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
@Override
public String toString()
{
	return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
}
public boolean equals(Object o)
{
	Book temp = (Book)o;
	return this.id==temp.id &&
			this.name.equals(temp.name) &&
			this.price==temp.price;
}
public int hashCode()
{
	int hc=0;
	hc=hc+Integer.valueOf(id).hashCode();
	hc=hc+name.hashCode();
	hc=hc+Double.valueOf(price).hashCode();
	return hc;
}
void details()

{
System.out.println("id:"+id);
System.out.println("name:"+name);
System.out.println("price:"+price);
}
@Override
public int compareTo(Book o) {
	// TODO Auto-generated method stub
	return name.compareTo(o.name);
}
}
