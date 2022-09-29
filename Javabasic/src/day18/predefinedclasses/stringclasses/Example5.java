package day18.predefinedclasses.stringclasses;
class print {
	int a=10;
	//@Override
	public int hashcode() {
		return 505;
	}
	//@Override
	public String toString() { 
		return "I am Print12 Class toString";
	}
}

public class Example5 {
		static int last_roll = 100;
		int roll_no;
		Example5()
	    {
	        roll_no = last_roll;
	        last_roll++;
	    }	

	public static void main(String[] args) {
		Example5 s1 = new Example5();
		System.out.println(s1);
		System.out.println(s1.hashCode());
		Example5 s2 = new Example5();
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println("s1 & s2 compare: "+s1.equals(s2));
		Example5 s3=s2;
		System.out.println("s2 & s3 Compare; "+s2.equals(s3));
		print p1= new print();
		System.out.println(p1);
		System.out.println(p1.hashcode());
		print p2 = new print ();
		System.out.println(p2);
		System.out.println(p2.hashcode());
		System.out.println("Comparing Print class object p1 & p2 with overriden equals() :"
				+p1.equals(p2));


		

		
	}
}
