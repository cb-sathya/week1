/** 
*This class implements an application that recieves a matrix as an input and rotates the matrix towards left or right based on the user unput
*/




import java.util.Scanner;


class Matrix{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);	
		int [][] a= new int[3][3];						//Intialize the array
		int row,col;
		String choice;


		
		System.out.println("enter the matrix");
		for(row=0;row<=2;row++){						//obtain the input matrix
			for(col=0;col<=2;col++){
				a[row][col]=scanner.nextInt();
			}
		}



		
		System.out.println("How do you want to rotate the matrix?(left/right)");
		choice=scanner.next();							//obtain the direction of rotation
		System.out.println("The output matrix is:");




		if(choice.equals("left")){						//If the matrix is to be rotated to its left
			for(col=2;col>=0;col--){
				for(row=0;row<=2;row++){
					System.out.print(a[row][col]+"  ");
				}
				System.out.println();
			}
		}
			
		
		
		if(choice.equals("right")){						//If the matrix is to be rotated to its right
			for(col=0;col<=2;col++){
				for(row=2;row>=0;row--){
					System.out.print(a[row][col]+"  ");
				}
				System.out.println();
			}
		}
	}
}







