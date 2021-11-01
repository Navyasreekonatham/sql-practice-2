package assignment2java;

public class Product {
  int proid;
  String proname;
  double proprice;
  
  Product(int id, String  name,  double price){
	  this.proid=id;
	  this.proname=name;
	  this.proprice= price;
  }
  public void display() {
	  System.out.println(proid);
	  System.out.println(proname);
	  System.out.println(proprice);
  }
  
  public double totalprice(double gst) {
	  return this.proprice+gst;
  }
  public static void main(String args[]) {
	  Product e1= new Product(4,"SUMA",88);
	      e1.display();
	 System.out.println(e1.totalprice(18)) ;   
	     
	 
	  
  }
}
