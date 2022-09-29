package day18.predefinedclasses.stringclasses;
 class TestSample{
	 void callme(){
		 System.out.println("Hello");		 
	 }
 }
public class Example4 extends TestSample {
	static int last_roll=505;
	int roll_no;
	Example4(){
		roll_no =last_roll ;
		last_roll++;
	}
	public int hashcode() {
		return 505;
	
	}
    public String toString()
    {
        return "BasicCoreJava";
    }
	public static void main(String[] args) {
		Example4 s= new Example4();
		System.out.println(s);
		System.out.println(s.hashcode());
		TestSample t1 = new TestSample();
		 System.out.println(t1);
		 System.out.println(t1.hashCode());



	}

}
