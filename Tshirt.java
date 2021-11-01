package assignment2java;

public class Tshirt {
     String color;
     String material;
     String design;
     
     Tshirt(){}  
     
     Tshirt(String a, String b, String c){
    	 this.color=a;
         this.material=b;
         this.design=c;
     } 
     public void display() {
    	 System.out.println(color+" "+material+" "+design);   
    	 }
     
     public String small(String d) {
    	 return this.color+material+design;
     }
     public String large(String d) {
    	 return this.color+material+design;
     }
     
     public String xtralarge(String d) { 
    	 return this.color+material+design;
     }
     public static void main (String []args) {
    	 Tshirt t1 =new Tshirt("small:"+"navy","randon","grapic");
    	         t1.display();
    	 Tshirt t2 =new Tshirt("large:"+"blue","fiber","polo");
                 t2.display();  
         Tshirt t3 =new Tshirt("xtralarge:"+"green","polyester","raglan");
                 t3.display();        
}
}

