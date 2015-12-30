/**
*This class sorts the the list of employees added by the user based on the employee name,salary,age using comparator as anonymous class
*/

import java.util.*;

class EmployeeAdd{				//Class stores the details of the employees
	String name;
	double salary;
	int age;
	
	EmployeeAdd(String name,double salary,int age){
		this.name=name;
		this.salary=salary;
		this.age=age;
	}

	void toDisplay(){
		System.out.println("Name:   "+name+"  Salary:   "+salary+"  Age:   "+age);
	}
}

public class Employee1{				//contains the anonymous classes
	public static void main(String args[]){
		ArrayList <EmployeeAdd> employees=new ArrayList<EmployeeAdd>();
		Scanner scanner=new Scanner(System.in);
		String choice;
		String name;
		double salary;
		int age;

		do{				//populates the instances
			System.out.println("Enter the Employee details:\n");
			System.out.println("Name:");
			name=scanner.next();
			System.out.println("Salary:");
			salary=scanner.nextDouble();
			System.out.println("Age:");
			age=scanner.nextInt();
			
			employees.add(new EmployeeAdd(name,salary,age));
			System.out.println("Do you want to continue?(yes/no)");
			choice=scanner.next();
		}while(choice.equalsIgnoreCase("yes"));

	
						//Sorts by name
		System.out.println("SORTING BY NAME");

		Collections.sort(employees,new Comparator(){
			public int compare(Object o1,Object o2){
				EmployeeAdd e1=(EmployeeAdd) o1;
				EmployeeAdd e2=(EmployeeAdd) o2;
				return (e1.name.compareTo(e2.name));
			}
		});
	
						//after sorting by name
		for(EmployeeAdd emp:employees){
			emp.toDisplay();
		}

						//Sorts by salary
		System.out.println("SORTING BY SALARY");

		Collections.sort(employees,new Comparator(){
			public int compare(Object o1,Object o2){
				EmployeeAdd e1=(EmployeeAdd) o1;
				EmployeeAdd e2=(EmployeeAdd) o2;
				if(e1.salary==e2.salary){
					return 0;
				}
				else if(e1.salary>e2.salary){
					return 1;
				}
				else{
					return -1;
				}
			}
		});
					
						//after sorting by salary
		
		for(EmployeeAdd emp:employees){
			emp.toDisplay();
		}
		
						//sorting by age
		System.out.println("SORTING BY AGE");
		
		Collections.sort(employees,new Comparator(){
			public int compare(Object o1,Object o2){
				EmployeeAdd e1=(EmployeeAdd) o1;
				EmployeeAdd e2=(EmployeeAdd) o2;
				if(e1.age==e2.age){
					return 0;
				}
				else if(e1.age>e2.age){
					return 1;
				}
				else{
					return -1;
				}
			}
		});
						//after sorting by age
		for(EmployeeAdd emp:employees){
			emp.toDisplay();
		}
	}
}

		
		

		
