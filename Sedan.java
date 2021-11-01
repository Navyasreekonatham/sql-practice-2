package assignment2java;

public class Sedan extends Car{
	int length;
	Sedan(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color);
		this.length=length;
	}
	public double getsaleprice()
	{
		if(length>20)
		{
			return super.getsaleprice()-(0.05*super.getsaleprice());
		}
		else
		{
			return super.getsaleprice()-(0.1*super.getsaleprice());
		}
	}
	public static void main(String args[])
	{
		Sedan s=new Sedan(280,1400000,"grey",300);
		System.out.println(s.getsaleprice());
	}
	

}
	


