package Assigment;

public class Marker implements Comparable <Marker>
{
  private int id;
  private String color;
  private int price;
  Marker()
  {
	  
  }
  Marker(int id, String color, int price)
  {
	  this.id=id;
	  this.color=color;
	  this.price=price;
	  }

public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id=id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public void details() {
	System.out.println("pen id:"+id);
	System.out.println("pen price:"+price);
	System.out.println("pen color:"+color);
	System.out.println("=================================");
}
public String toString()
{
	return "id:"+id +"color:"+color+"price"+price;
}
@Override
public int compareTo(Marker o) {
if(this.getId()>o.getId())
{
	return 1;
}
else if(this.getId()<o.getId())
{
	return -1;
}
else
	
	return 0;
/* to search by string
 * return this.getColor().compareTo(o.getColor());
 */
}
}
