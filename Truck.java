package assignment2java;

public class Truck extends Car{
	int weight;
	
	Truck(int speed,double regularPrice,String color,int weight)
	{
		super(speed,regularPrice,color);
		this.weight=weight;
	}
	public double getSalePrice()
	{
		if(weight>2000)
		{
			return super.getsaleprice()-(0.1*super.getsaleprice());
		}
		else
		{
			return super.getsaleprice()-(0.2*super.getsaleprice());
		}
	}
	public static void main(String args [])
	{
		Truck t1=new Truck(200,1700000,"black",5000);
		System.out.println(t1.getSalePrice());
	}
	
	

}
