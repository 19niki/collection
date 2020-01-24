package Assigment;

public class Book1 {

	int id;
	String name;
	String author;
	Book1()
	{
		
	}
	@Override
	public String toString() 
	{
		return " ";
	}
	public Book1(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	void details()
	{
      System.out.println("Book id:"+id);
      System.out.println("Book name:"+name);
      System.out.println("Book author:"+author);
	}

}
