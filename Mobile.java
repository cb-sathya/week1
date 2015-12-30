/** 
*This class implements an application to create a list of mobiles with their names and remaining charge bu using annonymous class
*/
import java.lang.*;
import java.util.Scanner;
class Mobile{
	String name;
	int remainingCharge;

	void setName(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name:");
		name=scanner.next();
	}
		
	void setRemainingCharge(){
		remainingCharge=(int) (100*Math.random());
	}

	
	void createObjects(){
		Mobile microsoft =new Mobile(){
			void setName (){
				name="WindowsPhone";
			}
			void setRemainingCharge(){
				remainingCharge=50;
				System.out.println("Name:  "+name+"\tRemaining Charge:  "+remainingCharge);
			}
				
		};
		Mobile apple=new Mobile(){
			void setName(){
				name="Iphone5S";
			}
			void setRemainingCharge(){
				remainingCharge=90;
				System.out.println("Name:  "+name+"\t\tRemaining Charge:  "+remainingCharge);
			}
		};
		Mobile google=new Mobile(){
			void setName(){
				name="Nexus";
			}
			void setRemainingCharge(){
				remainingCharge=100;
				System.out.println("Name:  "+name+"\t\tRemaining Charge:  "+remainingCharge);
			}
		};
		
		microsoft.setName();
		microsoft.setRemainingCharge();
		apple.setName();
		apple.setRemainingCharge();
		google.setName();
		google.setRemainingCharge();
	}	
	

	public static void main(String args[]){
		Mobile mobile=new Mobile();
		mobile.createObjects();
	}
}

	
	
	

	
