/**This class implements an application to perform factorial function using iterator class as an inner class
*/

import java.util.Scanner;
import java.util.Iterator;


public class Factorial implements Iterable<Integer>{		//class that implements Iterable interface
	int lowerLimit;
	int upperLimit;
	String string="\"";
	Factorial(int lowerLimit,int upperLimit){		//sets the upper and lowers limits
		this.lowerLimit=lowerLimit;
		this.upperLimit=upperLimit;
	}
	
	public Iterator<Integer> iterator(){				//iterator method that calls the inner class
		return new cbIterator();			
	}
	
	class cbIterator implements Iterator<Integer>{		//class that implements and overrides the Iterator interface
		int pointer;
			
		cbIterator(){
			pointer=lowerLimit;
		}

		public boolean hasNext(){			//this method returns whether there is a next element or not
			return this.pointer<=upperLimit;
		}
		
		public Integer next(){			//this method returns the current itrator and increments the pointer to the next value
			if(hasNext()){
				int current=pointer;
				pointer++;
				return current;
			}
			else{
				return 0;
			}
		
		}
			
	}
	
	public void addFact(int fact){			//finds the factorial of the current iterator and adds it to the string
		int factorial=1;
		for(int i=2;i<=fact;i++){
			factorial=factorial*i;
		}
		string=string+factorial+",";
	}

	public String toString(){							//returns the factorial values
		return string+"\b\"";
	}

	
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the lowerlimit and the upper limit");
		Factorial f=new Factorial(scanner.nextInt(),scanner.nextInt());
		
		Iterator<Integer> iterate=f.iterator();		//create an instance of the inner class that implements and overrides the iterator method
		while(iterate.hasNext()){		//iterate through each value and finds their factorials
			int value=iterate.next();
			f.addFact(value);			
		}
		
		System.out.println(f.toString());
	}
}
		
	
			
	
	
