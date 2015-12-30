/**
*This class implements an application to demonstrate the concepts of interfaces and abstract classes
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

abstract class Animals implements Type,Mobility{	     //the base class that contains methods to print the name of the animal and the mode of locomotion
	abstract void movement();
	abstract void printName();
}

abstract class Mammal extends Animals{				//contains the subclasses ie animals that are mammals
	abstract void movement();
	abstract void printName();
}
		
abstract class Bird extends Animals{				//contains the subclasses ie animals that are birds
	abstract void movement();		
	abstract void printName();
}
	
interface Type{							//interface for asserting herbivorous nature
	String isHerbivore();
}

interface Mobility{						//interface for asserting the ability to fly
	String canFly();
}

	
class Bat extends Mammal implements Type,Mobility{		//sub class bat derived from class mammal and implements the two interfaces
	void movement(){
		System.out.println("Bats are carnivorous mammals that can fly");
	}
	public String isHerbivore(){
		return "no";
	}
	public String canFly(){
		return "yes";
	}
	public void printName(){
		System.out.println("Bat");
	}
}


class Dog extends Mammal implements Type,Mobility{		//sub class dog derived from class mammal and implements the two interfaces
	void movement(){
		System.out.println("dogs are carnivorous mammals that walks");
	}
	public String isHerbivore(){
		return "no";
	}
	public String canFly(){
		return "no";
	}
	public void printName(){
		System.out.println("Dog");
	}
}

class Cow extends Mammal implements Type,Mobility{		//sub class cow derived from class mammal and implements the two interfaces
	void movement(){
		System.out.println("cows are herbivorous mammals that walks");
	}
	public String isHerbivore(){
		return "yes";
	}
	public String canFly(){
		return "no";
	}
	public void printName(){
		System.out.println("Cow");
	}
}

class Ostrich extends Bird implements Type,Mobility{		//sub class Ostrich derived from class bird and implements the two interfaces
	void movement(){
		System.out.println("Ostriches are herbivorous birds that cannot fly");
	}
	public String isHerbivore(){
		return "yes";
	}
	public String canFly(){
		return "no";
	}
	public void printName(){
		System.out.println("Ostrich");
	}
}
	
class Parrot extends Bird implements Type,Mobility{		//sub class parrot derived from class bird and implements the two interface
	void movement(){
		System.out.println("Parrots are herbivorous birds that can fly");
	}
	public String isHerbivore(){
		return "yes";
	}
	public String canFly(){
		return "yes";
	}
	public void printName(){
		System.out.println("Parrot");
	}
}

class Animalslist{
	public static void main(String args[]){
		String choice,continueList;
		ArrayList<Animals> animals =new ArrayList <Animals>(); 
		Scanner scanner=new Scanner(System.in);
		do{
								//animals are added
			System.out.println("Enter the animal that you want to add(parrot,ostrich,cow,dog,bat)");
			choice=scanner.next();
			switch(choice){
				case "parrot":	
					animals.add(new Parrot());
					break;
				case "ostrich":
					animals.add(new Ostrich());
					break;
				case "cow":
					animals.add(new Cow());
					break;
				case "dog":
					animals.add(new Dog());
					break;
				case "bat":
					animals.add(new Bat());
					break;
				default:
					System.out.println("INVALID CHOICE");
					break;
			}
			System.out.println("Do you want to continue?(yes/no)");
			continueList=scanner.next();
		}while(continueList.equalsIgnoreCase("yes"));
		
								//displays the mode of locomotion of animals added
		System.out.println("\n\n\nThe mode of locomotion of the animals entered");
		for(Animals anim: animals){
			anim.movement();
		}
								//displays the herbivorous animals added
		System.out.println("\n\n\nAll the animals entered that are herbivores:");
		for(Animals anim:animals){
			if(anim.isHerbivore().equals("yes")){
				anim.printName();
			}
		}
								//displays the animals added that can fly
		System.out.println("\n\n\nAll the animals that can fly:");
		for(Animals anim: animals){
			if(anim.canFly().equals("yes")){
				anim.printName();
			}
		}
	}
}
