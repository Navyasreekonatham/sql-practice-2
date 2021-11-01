package assignment2java;

public class Student {
    int stuid;
    String stuname;
    int  stucls;
    
    Student(){} //default constructor
    
    Student(int id, String name, int cls){
    	this.stuid=id;
    	this.stuname=name;
    	this.stucls=cls;
    	}
public void display() {
	 System.out.println(stuid);
	 System.out.println(stuname);
	 System.out.println(stucls);
 }
    public static void main(String args[]) {
    	Student s1= new Student(45,"prabhu",5);
    	    s1.display();
    	Student s2= new Student(55,"navya",9);
    	    s2.display();   
    }
}