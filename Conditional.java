/**
*This class implements an application that uses conditional statement to check if the *entered grade is considered as pass (if grade is greater than or equal to 50) or fail
*/


import java.util.Scanner;
class Conditional{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);	//Intialize scanner
		int grade;
		System.out.println("Enter grade");
		grade=scanner.nextInt();			//Obtain the grade
		
		if(grade>=50)    				//conditional block
		System.out.println("Congratulations, you have passed");
		else
		System.out.println("Sorry, you have failed");
	}
}
