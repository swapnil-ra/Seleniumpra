package assignment;

public class Demo {
	{ System.out.println("hi i am demo class");}
	static {System.out.println("hi static block of demo class");}
	int salery=20222;
	 public static void main(String[] arg) {
	System.out.println(print123.age);
	print123 c1=new print123();
	//System.out.println(c1.salary);
	System.out.println(c1.abc);
	Demo c2=new Demo();
	System.out.println(c2.salery);
	
	 }
	 
}	
	class print123{
		static  double age=23;
		int abc =56;
		print123(){
			int y=67;
			System.out.println("I am zero param constructor of ClassBody..");
		}
		static {
			 age=32;
			System.out.println("I am static initilization block or SIB");
		}
		
		{
			 double salary=55000.45;
			System.out.println("I am non-static initilization block or Instance Initilization block or IIB");
		}
		
		
		
		
	}
	