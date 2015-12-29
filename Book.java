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
	
	Book( String name,Author[] authors,double price,int qtyInStock){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		for(int i=0;i<authors.length;i++){
			this.authors.add(authors[i]);
		}
	}

	Book( String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
		this.authors.add(author);
	}

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

	void toDisplay(){
		System.out.println(this.getName()+" by ");
		for(Author author:authors){
			System.out.print(","+author.toDisplay());
		}
		System.out.println("\nPrice:\t$"+getPrice());
		System.out.println("Number of books available:    "+getQtyInStock());
	}
	void printAuthors(){
		for(Author author:authors){	
			author.toDisplay();
		}
	}
	void addAuthors(Author author){
		authors.add(author);
	}

	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
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
		Book book=new Book(name,authors,scanner.nextDouble(),scanner.nextInt());
		book.toDisplay();
		Author author=new Author("R.K. Narayan","rknarayan2gmail.com",'M');
		book.addAuthors(author);
		book.printAuthors();
		book.toDisplay();
	}
}
			
			
			

	

		
