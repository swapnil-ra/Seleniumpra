package assignment2;

public class Demo {
	static int X;
	double salary;
	{
		System.out.println("hi i m non static block");
	}
	static {
	         System.out.println("hi im static block");
	
	}
	static void display() {
		System.out.println("I am static methoad display()");
	}
	void print() {
		System.out.println("I am non-static methoad print()");
	}
 void print12(int a) {
	 System.out.println("value of A"+a);
 }
 void print12(int a,double b) {
	 System.out.println("value of A"+a);
	 System.out.println("Value of B"+b);
 }
 Demo(){
	 System.out.println("this is zero pyarameter");
 }
Demo(int g){
	//.out.println("value of g"+g);
	
}
Demo(double h){
	this(22);
	 System.out.println("value of h"+h);
	
	
	
}
Demo(int m, double n,int k){
	this(23.5);System.out.println("this three perymeter cons");
	
}
	public static void main(String[] args) {
		//System.out.println("main() Starts");
		//Demo r1=new Demo();
		System.out.println("***********************");
		//System.out.println();
		display();
		System.out.println();
		Demo r2=new Demo();
		Demo r3=new Demo();
		r3.print12(12);
		r3.print12(23,35.5);
		System.out.println(call123.abc);
		call123 b1=new call123();
		System.out.println(b1.k);
		call123 b2=new call123();
		System.out.println("call123"+b2.age);
		Demo c1=new Demo(34.6);
		Demo c2=new Demo(25,30.5,28);
	
		
		
	   // System.out.println("main() ends");
	}
	
}
class call123{
	static int abc=67;
	double k=99;
      int age=88;
 //non static block
{
	
	double salary=46000.45;
		System.out.println("I am non-static block class call123 ");
}
static
{
	int age=18;
	System.out.println("I am static block class call123 "+age);
}

 }	
	

