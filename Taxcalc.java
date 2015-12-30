/** 
This class implements an application to calculate the tax amount for a list employees (both male and female)
*/
import java.util.Scanner;
import java.util.ArrayList;

class EmployeeDetails{			//class that stores the employee details and calculates the tax amount
	String name;
	char gender;
	double income;
	static double taxAmount;
	
	EmployeeDetails(String name,char gender,double income){
		this.name=name;
		this.gender=gender;
		this.income=income;
	}
			//The static class that calculates the tax amount to be paid by considering the gender and the total income
	static void calculate(char gender,double income){	
		if(gender=='M'||gender=='m'){
			if(income>500000){
				taxAmount=(20*income)/100;
			}
			else if(income>250000){
				taxAmount=(10*income)/100;
			}
		}
		else if(gender=='F'||gender=='f'){
			if(income>500000){
				taxAmount=(17*income)/100;
			}
			else if(income>250000){
				taxAmount=(7*income)/100;
			}
		}
		else{
			System.out.println("error");
		}
	}		
	
 	void display(){		//Prints the final report with the names and tax amounts to be paid
		System.out.println(name+" | "+ gender+" | "+income+" | "+taxAmount);
	}
}	

class Taxcalc{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		String name;
		char gender;
		double income;
		String choice;
		ArrayList<EmployeeDetails> emplist =new ArrayList<EmployeeDetails>();
			//The  details of the employee are entered
		do{
			System.out.println("Enter the details of the employee (Name,gender,income)");
			name=scanner.next();
			gender=scanner.next().charAt(0);
			income=scanner.nextDouble();
			
			emplist.add(new EmployeeDetails(name,gender,income));
			
			System.out.println("Do you want to continue? (y/n)");
			choice=scanner.next();
		}while(choice.equalsIgnoreCase("y"));
			//The tax amounts are calculated and displayed
		for(EmployeeDetails ed: emplist){
			ed.calculate(ed.gender,ed.income);			
			ed.display();
		}
	}
}
			
	
