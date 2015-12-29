/** 
* This class implements an application that keeps track of all the employee,customers and vechicles in the service station and also stores the invoices of the employee
*/

import java.util.Scanner;
import java.util.ArrayList;

class Person{						//class person contains the name,age,contact details
	String name;
	int age;
	long contact;
	Person(String name,int age,long contact){
		this.name=name;
		this.age=age;
		this.contact=contact;
	}
	void toDisplay(){
		System.out.print("Name:  "+name+"  Age:  "+age+"  Contact:  "+contact+"\n");	
	}
}


class Employee extends Person{		//class Employee inherits members of Person class and contains the empID
	int empId;
	Employee(String name,int age,long contact,int empId){
		super(name,age,contact);
		this.empId=empId;
	}
	void toDisplay(){
		System.out.println("EmployeeID:  "+empId);
		super.toDisplay();
	}
	String getName(){
		return super.name;
	}
}

class Customer extends Person{		//class Customer inherits members of Person class and contains the customerID
	int customerId;
	Customer(String name,int age,long contact,int customerId){
		super(name,age,contact);
		this.customerId=customerId;
	}
	void toDisplay(){
		System.out.println("\nCustomerID:  "+customerId);
		super.toDisplay();
	}
	String getName(){
		return super.name;
	}
}

class Vehicle{						//class Vehicle contains all the details of the vehicle
	String brand;
	String color;
	String service;
	double serviceCharge;
	Vehicle(String brand,String color,String service){
		this.brand=brand;
		this.color=color;
		this.service=service;
		switch(service){
			case "bike":
				serviceCharge=200;
			case "car":
				serviceCharge=1000;
			case "bus":
				serviceCharge=3000;
		}
	}
	void toDisplay(){				//method to display the vehicle details
		System.out.print("Brand:"+brand+"\t"+"color:"+color+"\t"+"service:"+service+"\t"+"Service Charge:"+serviceCharge);
	}
	void displayServiceCharge(){			//Displays servcice charge of all vehicles
		System.out.println("Type:  "+service+"  ServiceCharge:  "+serviceCharge);
	}
}

class Invoice{				//contains invoice details
	String nameOfOwner;
	Vehicle vehicle;
	double totalAmount;
	String assingedEmployee;
	Invoice(String assingedEmployee,String nameOfOwner,Vehicle vehicle){
		this.nameOfOwner=nameOfOwner;
		this.assingedEmployee=assingedEmployee;
		this.vehicle=vehicle;
		totalAmount=vehicle.serviceCharge*2;
	}
	void toDisplay(){
		System.out.println("Name of Owner:  "+nameOfOwner+"\nVehicle Details:  ");
		vehicle.toDisplay();
		System.out.print("\nAssigned Employee:  "+assingedEmployee+"\nTotalAmount:  Rs."+totalAmount);
	}

	String getNameOfOwner(){
		return nameOfOwner;
	}

	String getNameOfEmployee(){
		return assingedEmployee;
	}
}

class Servicestation{
	public static void main(String args[]){
		ArrayList <Invoice> invoices=new ArrayList<Invoice>();
		ArrayList <Customer> customers=new ArrayList<Customer>();
		ArrayList <Employee> employees=new ArrayList<Employee>();
		ArrayList <Vehicle> vehicles=new ArrayList<Vehicle>();
		String vehicleColor,vehicleBrand,vehicleService;

		Scanner scanner=new Scanner(System.in);
		int choice;
		do{
			System.out.println("1.ADD CUSTOMER");
			System.out.println("2.ADD EMPLOYEE");
			System.out.println("3.ADD INVOICE");
			System.out.println("4.EXIT\n");
	
			choice=scanner.nextInt();
			switch(choice){
				case 1:	
					System.out.println("Enter name,age,contact,customerId");
					customers.add(new Customer(scanner.next(),scanner.nextInt(),scanner.nextLong(),scanner.nextInt()));
					break;
				case 2:
					System.out.println("Enter name,age,contact,empId");
					employees.add(new Employee(scanner.next(),scanner.nextInt(),scanner.nextLong(),scanner.nextInt()));
					break;
				case 3:
					System.out.println("Enter vehicle brand");
					vehicleBrand=scanner.next();
					System.out.println("Enter color of vehicle");
					vehicleColor=scanner.next();
					System.out.println("Enter type of vehicle(Car,Bike,Bus)");
					vehicleService=scanner.next();
					Vehicle vehicle=new Vehicle(vehicleBrand,vehicleColor,vehicleService);
					vehicles.add(vehicle);
					System.out.println("Enter the employee name and customer name");
					invoices.add(new Invoice(scanner.next(),scanner.next(),vehicle));
					break;
				default:
					break;
			}	
		}while(choice<4);
	
		for(Vehicle v: vehicles){
			v.displayServiceCharge();
		}
		
		for(Employee emp:employees){
			emp.toDisplay();
			int i=0;
			System.out.println("INVOICES");
			for(Invoice invoice:invoices){
				if(emp.getName().equalsIgnoreCase(invoice.getNameOfEmployee())){
					invoice.toDisplay();
					i++;	
				}
			}
			if(i==0){
				System.out.println("NONE");
			}
		}

		for(Customer customer:customers){
			customer.toDisplay();
			int i=0;
			System.out.println("INVOICES");	
			for(Invoice invoice:invoices){
				if(customer.getName().equalsIgnoreCase(invoice.getNameOfOwner())){
					invoice.toDisplay();
					i++;	
				}
			}
			if(i==0){
				System.out.println("NONE");
			}
		}

	}
}
		
		
			

	

		
