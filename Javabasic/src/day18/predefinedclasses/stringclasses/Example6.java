package day18.predefinedclasses.stringclasses;
class Print extends Object{	
	int a=10;
	//@Override
	public int hashCode() {
		return 101;
	}
	//@Override
	public String toString() {
		return "I am Print Class toString";
	}
	//@Override
	public boolean equals(Object obj) {//Object obj = p2 = new Print();--> Object obj = new Print();//Auto up casting
		Print p=(Print)obj;//down casting
		return (this.a==p.a);
	}	
}
public class Example6{

	static int last_roll = 100;
	int roll_no;
	Example6()
    {
        roll_no = last_roll;
        last_roll++;
    }	

	public static void main(String[] args) {

	}
}


