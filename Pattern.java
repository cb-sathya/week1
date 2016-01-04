/**
*This pattern class implements an application that display the specified pattern
*       1
*     1 2 1
*   1 2 3 2 1
* 1 2 3 4 3 2 1
*/
import java.util.Scanner;
class Pattern{
	public static void main(String args[]){
		int row,inc,space,control,input;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		input=scanner.nextInt()+1;
		for(row=1;row<=input;row++){					//controls number of rows
			space=input-row;
			inc=0;					
			for(control=1;control<input||inc>1;control++){  		 	
				if(control<=space){				//prints space
					System.out.print("  ");
				}
				else if(control<input){			//prints the left half of the pattern
					inc++;	
					System.out.print(inc+" ");
				}
				else{					//printd the right half of the pattern
					inc--;
					System.out.print(inc+" ");
				}
					
			}
			System.out.println();
		}
	}
}
