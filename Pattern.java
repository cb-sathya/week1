/**
*This pattern class implements an application that display the specified pattern
*    1
*   121
*  12321
* 1234321
*/
import java.util.Scanner;
class Pattern{
	public static void main(String args[]){
		int row,inc,dec,space,control,input;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		input=scanner.nextInt();
		for(row=1;row<=input;row++){					//controls number of rows
			space=input-row;
			inc=1;					
			for(control=1;control<=input;control++){  		 	
				if(control<=space){				//prints space
					System.out.print("  ");
				}
				else{						//prints the left half of the pattern
					System.out.print(inc+" ");
					inc++;
				}
					
			}
				
	 		for(dec=inc-2;dec>0;dec--){   				//prints the right half of the pattern
				System.out.print(dec+" ");
			}
			System.out.println();
		}
	}
}
