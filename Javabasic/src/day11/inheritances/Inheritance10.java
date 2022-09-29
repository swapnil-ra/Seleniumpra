package day11.inheritances;
//parent class
class Company{
	Company(){
		this(123);
		this.display(50);
		System.out.println("this is company cons");
	}
	Company(int g){
		this.display(25,26);
		System.out.println("this is pera cons");
		System.out.println("value of g"+g);
	}
	void display( int x) {
		System.out.println("value of x"+x);
		System.out.println("first methoad of class company");
				
	}
	 void display(int a,int b) {
		System.out.println("secound methoad of class company");
		System.out.println("value of a "+a);
		System.out.println("value of b "+b); 
	}
	 void display( double a,int b  ) {
		 System.out.println("thired methoad of class company");
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		
	}	
}
class Empolyee extends Company{	
	Empolyee(){
		this(123);
		super.display(90);
		this.display(15.6, 21);
		System.out.println("this is non -per empolyee cons");
	}
	Empolyee(int a){
		super(85);
		super.display(97,98);
		this.print(10);
		System.out.println("this is pera cons");	
	}
	void print ( int a) {
		System.out.println("first methoad of class employee ");
		//final int a=25;
		System.out.println(a);
				
	}
	 void print(int a,int b) {
		System.out.println("secound methoad of class employee");
		System.out.println("value of a "+a);
		System.out.println("value of b "+b); 
	}
	 void print( double a,int b  ) {
		System.out.println("thired methoad of class employee");
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		
	}

	 
}
public  class Inheritance10 {

	public static void main (String[]arge) {
		Company d1=new Company();
		Company d2=new Company(67);
		System.out.println("***************************");
		Empolyee f1=new Empolyee ();
		Empolyee f2= new Empolyee(44);
		
	}
		

	}


