/**
*This class implements an application that gets an array as input and finds the smallest and the biggest of the elements in the array
*/

import java.util.Scanner;

class Small_big{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		int array_len,smallest,biggest=0,i;
		System.out.println("Enter the array length: ");
		array_len=scanner.nextInt();						//get array length

		int[] array=new int[array_len];
		System.out.println("Enter the elements in the array: ");
		for(i=0;i<array_len;i++){						//get the elements in the array
			array[i]=scanner.nextInt();
		}
		smallest=array[0];

											//finding the smallest and biggest elements in the array
	
		for(i=0;i<array_len;i++){
			if(array[i]>biggest){
				biggest=array[i];
			}
			else if(array[i]<smallest){
				smallest=array[i];
			}
		}

											//printing the smallest and the biggest

		System.out.println("The smallest element in the array is: "+smallest);
		System.out.println("The biggest element in the array is: "+biggest);
	}
}


		
				
		
