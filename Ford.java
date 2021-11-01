package assignment2java;

public class Ford extends Car{
	int year;
	int manufacDiscount;
	Ford(int speed,double regularPrice,String color,int year,int manfacdiscount)
	{
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacDiscount=manfacdiscount;
	}
		public double getsaleprice()
		{
			return super.getsaleprice()-manufacDiscount;
		}
	public static void main(String args[])
	{
		Ford f1=new Ford(2500,1500000,"blue",2020,5000);
		System.out.println(f1.getsaleprice());
	}

}
