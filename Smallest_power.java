/** 
*This class implements an application to find the smallest power of x that is greater than the value of y
*/
import java.util.Scanner;
import java.lang.*;

class Smallest_power{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);						//Intialize Scanner	
		int x,y,power,smallest_power=0;

		System.out.println("enter the value for x:");
		x=scanner.nextInt();								//Obtain x value
		System.out.println("enter the value for y:");
		y=scanner.nextInt();								//Obtain y value
		
		for(power=0;power<y;power++){							//check each power of x until the value becomes greater than y
			if(Math.pow(x,power)>y){
				smallest_power=power;						//store the smallest power of x greater than y in smallest_power
				break;
			}
		}
		
		System.out.println("The smallest power of "+x+" that is greater than "+y+" is "+smallest_power);				//display the smallest power
	}
}
