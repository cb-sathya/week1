/**
*This class implements an application to find the indices of each character in the given string and to add the indices of each character and to check if that sum is odd or *even
*/


import java.util.Scanner;

class Indices{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);	//Initialize scanner
		String input;
		int sum=0;  				//Initialize "sum" as 0

		System.out.println("enter the string:");
		input=scanner.next();  			//store the string in variable "input"
		
		for(int i=0;i<input.length();i++){
			 sum=sum+input.charAt(i);   	//Find and add each index of the string to the variable "sum"
		}
		
		if(sum%2==0){				//If the final summation is perfectly divisible by 2 then the sum of indices is even
			System.out.println("Even");
		}
		else{					//If the final summation is not perfectly divisible by 2 then the sum of indices is odd
			System.out.println("Odd");
		}
	}
}	

