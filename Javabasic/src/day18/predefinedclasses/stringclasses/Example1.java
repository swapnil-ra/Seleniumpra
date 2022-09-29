package day18.predefinedclasses.stringclasses;
class Demo {
	void Display () {
		System.out.println("I am display()..");
	}
}


public class Example1 extends Demo {
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Example1()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		Demo d1=new Demo ();
		System.out.println(d1);
		Demo d3=new Demo();
		System.out.println(d3.toString());		
		System.out.println("*************************************");
		Example1 s = new Example1();
		System.out.println(s);
		System.out.println(s.toString());//string representation of an object
		System.out.println("***********************************");
		Demo d2=new Example1();
		System.out.println(d2);
	}

}
