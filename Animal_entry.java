/**
*This program implements a class that requests the users to enter the details of the animals 
*it implements another class to store the details obtained from the user
*/

import java.util.Scanner;
import java.util.ArrayList;

class Animal{			//class animal contains a constructor that stores the values of the animals obtained in different instances
	int age,id;
	String name,type;
	
	Animal (int n_age,String n_name,String n_type,int n_id){
		age=n_age; 	//age of the animal
		name=n_name;	//name of the animal
		type=n_type;	//type of the animal (carnivore or herbivore)
		id=n_id;	//id of the animal
	}
}



public class Animal_entry{
	public static void main(String args[]){
		Scanner scanner=new  Scanner(System.in);     	
		int age,number=0;
		String name,type,choice;
		
		//create an array list of type animal object to add new details dynamically
		ArrayList<Animal> animal= new ArrayList<Animal>();	

		do{
			System.out.println("Enter the details of the animal- age,name,type (carnivore or herbivore)");
			age=scanner.nextInt();
			name=scanner.next();
			type=scanner.next();
			number++;				//Number of animals added is tracked by using this variable
			animal.add(new Animal(age,name,type,number));
			System.out.println("Number of animals entered: "+number);
			System.out.println("Do you want to add another animal to the list?(y/n):");
			choice=scanner.next();			
		}while(choice.equalsIgnoreCase("y"));		//repeat the loop until the user enters no
		System.out.println("Total number of animals entered are (is): "+number+"\n Thank you");
	}
}
			
			
		
		
