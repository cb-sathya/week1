/**
*This class implements an application to add two values (X and y) and to store the *result of addition in a variable z and to display the result
*/
import java.util.Scanner;
class Add{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);  //Initialize scanner 

		System.out.println("Enter the first number");
		int x=scanner.nextInt(); 		// obtain the first variable
		System.out.println("Enter the second number");
		int y=scanner.nextInt(); 		//obtain the second variable

		int z; 					//third variable that will contain the added value
		z=x+y;					 //The numbers are added
		System.out.println("The sum of x & y is z="+z); //the sum is displayed
	}
}
		
