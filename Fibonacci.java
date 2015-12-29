/**
*This class implements an application that displays the fibonacci series upto the *given limit
*/

import java.util.Scanner;

class Fibonacci{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);		//intialize scanner
		int a,b,c,limit;
		System.out.println("Enter the limit: ");  	//get the limit of the series
		limit=scanner.nextInt();

							//intialize
		a=0;
		b=1;

							//Start printing the series

		System.out.println("The fibonacci series is:");
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		for(;c<limit;){				//for each step the two preceeding terms of the series are added to provide the next term
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
			
		
