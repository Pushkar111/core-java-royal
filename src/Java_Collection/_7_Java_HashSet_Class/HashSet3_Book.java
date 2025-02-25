package Java_Collection._7_Java_HashSet_Class;

import java.util.HashSet;
import java.util.Iterator;

class Book
{
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int quntity;

	public Book(int id, String name, String author, String publisher, int quntity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quntity = quntity;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getPublisher()
	{
		return publisher;
	}

	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}

	public int getQuntity()
	{
		return quntity;
	}

	public void setQuntity(int quntity)
	{
		this.quntity = quntity;
	}

}

public class HashSet3_Book
{
	public static void main(String[] args)
	{
		HashSet<Book> hs = new HashSet<Book>();

		Book b1 = new Book(101, "Killer", "Jhon", "Scribner", 12);
		Book b2 = new Book(101, "Killer", "Jhon", "Scribner", 12);
		Book b3 = new Book(103, "1984", "George", "Warburg", 14);
		Book b4 = new Book(104, "Pride", "Austen", "Egerton", 15);
		Book b5 = new Book(105, "Rider", "Salinger", "Company", 16);

		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);

		Iterator<Book> itr = hs.iterator();
		itr.forEachRemaining(b -> {
			System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPublisher() + "\t"
					+ b.getQuntity());
		});

		System.out.println();

		hs.forEach(b -> {
			System.out.println(b.getId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPublisher() + "\t"
					+ b.getQuntity());
		});
	}
}
