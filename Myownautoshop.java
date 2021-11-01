package assignment2java;

public class Myownautoshop {
	Myownautoshop(int speed,double regularPrice,String color,int length)
	{
		super();
	}
	Myownautoshop(int speed,double regularPrice,String color, int year, int manfacdiscount)
	{
		super();
	}
	Myownautoshop(int speed,double regularPrice,String color)
	{
		super();
	}
	public static void main(String[] args) 
	{
		Car Car = new Car (0104, 100000.0, "black");
		Sedan Sedan = new Sedan(0314, 4000000.0, "grey",190);
		Ford Ford1 = new Ford (1433,3000000.0,"Blue",2015, 500);
		Ford Ford2 = new Ford (7777,1400000.0,"green",2017, 1000);
		System.out.println("Sedan Price "+ Sedan.getsaleprice()+"\n");
		System.out.println("Ford1 Price "+ Ford1.getsaleprice()+"\n");
		System.out.println("Ford2 Price "+ Ford2.getsaleprice()+"\n");
		System.out.println("Car Price "+ Car.getsaleprice()+"\n");
	}

}
