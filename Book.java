/** 
*This class implements an application to keep track of a simple book stall
*/

import java.util.Scanner;
import bookstall.Author;
import java.util.ArrayList;

class Book{
	private String name;
	ArrayList<Author> authors=new ArrayList<Author>();
	private double price;
	private int qtyInStock=0;
			//constructor to add a book with several authors
	Book( String name,Author[] authors,double price,int qtyInStock){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		for(int i=0;i<authors.length;i++){
			this.authors.add(authors[i]);
		}
	}
			//constructor to add a book with single authors
	Book( String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		this.authors.add(author);
	}
			//get and set methods to store and retrieve the book details
	public String getName(){
		return name;
	}
	public ArrayList<Author> getAuthors(){
		return authors;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price=price;
	}
	
	int getQtyInStock(){
		return qtyInStock;
	}
	
	void setQtyInStock(int qtyInStock){
		this.qtyInStock=qtyInStock;
	}

	void toDisplay(){			//displays the details of the book
		System.out.println(this.getName()+" by ");
		for(Author author:authors){
			System.out.print(","+author.toDisplay());
		}
		System.out.println("\nPrice:\t$"+getPrice());
		System.out.println("Number of books available:    "+getQtyInStock());
	}
	void printAuthors(){			//method to print the authors of a particular book
		for(Author author:authors){	
			System.out.println(author.toDisplay());
		}
	}
	void addAuthors(Author author){		//method to add a new author to the book
		authors.add(author);
	}

	public static void main(String args[]){
		ArrayList<Book> books=new ArrayList<Book>();
		Scanner scanner=new Scanner(System.in); 	
		Book book;
						//populating data
		do{
			System.out.println("Enter the deatils of the book:\n Name:");
			String name=scanner.next();
			System.out.println("Written by how many authors?");
			int noOfAuthors=scanner.nextInt();
			int i=0;
			Author[] authors=new Author[noOfAuthors];
			System.out.println("Enter the details of the authors");
			do{			
				System.out.println("Enter name,email,gender(M/F)");
				authors[i]=new Author(scanner.next(),scanner.next(),scanner.next().charAt(0));
				i++;
			}while(i<noOfAuthors);
			System.out.println("Price of the book and quantity available:");
			book=new Book(name,authors,scanner.nextDouble(),scanner.nextInt());
			books.add(book);
			System.out.println("Do you want to continue?(y/n)");
		}while(scanner.next().equals("y"));
						//Add an author for a particular book
		Author author=new Author("R.K. Narayan","rknarayan2gmail.com",'M');
		book.addAuthors(author);
						//display the authors for a particular book
		System.out.println
		book.printAuthors();
						//Print the details of books availabe
		for(Book bk:books){
			bk.toDisplay();
		}
	}
}
			
			
			

	

		
