/** 
* This class implements an applicatiom that finds the simple interest and the compound interest values given pricipal, rate of interest, number of years as an input
*/



import java.lang.*;
import java.util.Scanner;

class Interest_calc{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		double principal,interest_rate,no_of_years;
		double si,ci;
		String choice;
		
		System.out.println("enter the pricipal amount:"); //input principal value
		principal=scanner.nextDouble();
		System.out.println("enter the rate of interest:"); //input the rate of interest
		interest_rate=scanner.nextDouble();
		System.out.println("enter the number of years:");  //input number of years
		no_of_years=scanner.nextDouble();

		System.out.println("SI or CI?");
		choice=scanner.next();

		if(choice.equalsIgnoreCase("SI")){   //if the user chooses SI then the simple interest is calculated
			si=(principal*no_of_years*interest_rate)/100;
			System.out.println("The simple Interest is: "+si); 
		}
		
		if(choice.equalsIgnoreCase("CI")){   //if the user chooses CI then the compound interest is calculated
			ci=principal*(Math.pow((1+(interest_rate/100)),no_of_years));
			System.out.println("The annual compound interest is: "+ci);
		}
	}
}



