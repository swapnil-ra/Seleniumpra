package day18.predefinedclasses.stringclasses;

public class Example2 extends Demo {
	static int last_roll = 100;
	int roll_no;
	// Constructor
	Example2()
    {
        roll_no = last_roll;
        last_roll++;
    }
	public static void main(String[] args) {
		Example2 s=new Example2 ();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println(s.hashCode());
		Demo d1=new Demo();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());


	}

}
