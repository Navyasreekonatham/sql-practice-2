package assignment2java;

public class Car {
	int speed;
	double regularprice;
	String color;
	
	Car(){}//default constructor
		//parameter constructor
	Car(int a, double b, String c){
		this.speed=a;
		this.regularprice=b;
		this.color=c;
	}
     
     public double getsaleprice() {
   	  return this.regularprice;       }
     
     public  static void main(String args[]) {
    	 Car c1= new Car(1000,500000,"blue");
			 System.out.println(c1.getsaleprice());
		}
   
     }


