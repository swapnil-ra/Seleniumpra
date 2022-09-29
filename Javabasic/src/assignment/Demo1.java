package assignment;

public class Demo1 {
	static double x=88;
	void display(final int a) {
		//final int a=25;
		System.out.println(a);
				
	}
	 void display(int a,int b) {
		a=56;b=55;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b); 
	}
	 void display( double a,int b  ) {
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		System.out.println("value of x "+x);
	}

	public static void main(String[] args) {
        Demo1 r1=new Demo1();
		r1.display(23,67);
		r1.display(45.6,67);
		//System.out.println(r1.a);
		r1.display(45);
		System.out.println(r1.x);
	}

}
// methoad 