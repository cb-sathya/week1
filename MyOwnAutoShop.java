/**
This class implements an application that uses inheritance to keep track of available cars
*/

class Car{
	int speed;
	double regularPrice;
	String color;
	Car(int speed,double regularPrice,String color){
		this.speed=speed;
		this.regularPrice=regularPrice;
		this.color=color;
	}
	double getSalePrice(){
		return regularPrice;
	}
	void Display(){
		System.out.println("Car with speed "+speed+" km/hr at a price of Rs."+regularPrice+" painted "+color+"\n");
	}
}

class Truck extends Car{
	int weight;
	Truck(int speed,double regularPrice,String color,int weight){
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	double getSalePrice(){
		if(weight>2000){
			return (super.getSalePrice()-(super.getSalePrice()*10)/100);
		}
		else{
			return (super.getSalePrice()-(super.getSalePrice()*20)/100);
		}
	}
	void Display(){
		System.out.println("Truck with speed "+super.speed+" km/hr at a price of Rs."+super.regularPrice+" painted "+super.color+" available at a discounted price of Rs."+getSalePrice()+"\n");
	}
}

class Ford extends Car{
	int year;
	int manufacturerDiscount;
	Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount){
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	double getSalePrice(){
		return (super.getSalePrice()-((super.getSalePrice()*manufacturerDiscount)/100));
	}
	void Display(){
		System.out.println("Ford with speed "+super.speed+" km/hr at a price of Rs."+super.regularPrice+" painted "+super.color+" available at a discounted price of Rs."+getSalePrice()+"\n");
	}
}

class Sedan extends Car{
	int length;
	Sedan(int speed,double regularPrice,String color,int length){
		super(speed,regularPrice,color);
		this.length=length;
	}
	double getSalePrice(){
		if(length>20){
			return (super.getSalePrice()-(super.getSalePrice()*5)/100);
		}		
		else{
			return (super.getSalePrice()-(super.getSalePrice()*10)/100);
		}
	}
	void Display(){
	System.out.println("Ford with speed "+super.speed+" km/hr at a price of Rs."+super.regularPrice+" painted "+super.color+" available at a discounted price of Rs."+getSalePrice()+"\n");
	}
}

class MyOwnAutoShop{
	public static void main(String args[]){
		
		Sedan sedan =new Sedan(100,1000000,"black",25);
		Ford ford1=new Ford(180,2500000,"blue",1995,10);
		Ford ford2=new Ford(130,1500000,"red",1991,15);
		Car car=new Car(100,500000,"white");
		
		sedan.Display();
		ford1.Display();
		ford2.Display();
		car.Display();
	}
}
		
