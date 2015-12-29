/**
*This class uses the access modifiers in java and implements an application that maintains a simple book stall
*/

package bookstall;
import java.util.Scanner;

public class Author{
	private String name;		//private members
	private String email;	
	private char gender;
	
	public Author(String name,String email,char gender){	//constructor
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	public String getName(){		//public methods
		return name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public char getGender(){
		return gender;
	}
	public String toDisplay(){
		return name+" ("+gender+") at "+email;
	}

	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		Author author=new Author("R.K. Narayan","rknarayan2gmail.com",'M');
		System.out.println(author.toDisplay());
		System.out.println("Enter a new email Id");
		author.setEmail(scanner.next());
		System.out.println("Name: "+author.getName());
		System.out.println("Email: "+author.getEmail());
		System.out.println("Gender: "+author.getGender());
	}
}


		
