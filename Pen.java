package Assigment;

import java.util.List;

public class Pen implements Comparable
{
private int pid;
private String name;
private String color;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
Pen()
{
}
public Pen(int pid, String name, String color) {
	super();
	this.pid = pid;
	this.name = name;
	this.color = color;
}
public void details() {
	System.out.println("pen id:"+pid);
	System.out.println("pen name:"+name);
	System.out.println("pen color:"+color);
	System.out.println("=================================");
}
public String toString()
{
	
	
	return " ";
	
}
/*@Override
public int compareTo(Pen o) 
{
  if(this.getPid()>o.getPid())
  {
  return 1;
  }
  else if(this.getPid()<o.getPid())
  {
	  return -1;
  }
  else
	0  return 0;
	*/
@Override
public int compareTo(Object o) {
	if(this.getPid()>((Pen)o).getPid())
	{
		return 1;
	}
	else if(this.getPid()<((Pen)o).getPid())
	{
		return -1;
	}
	else
	return 0;
}
}

