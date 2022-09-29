package day3.variablestypes;

public class NonStaticGlobalVariableExample3 {
	//non static global variable
	int age;
	boolean res;
	char grade;
	float roi;
	public static void main(String[] args) {
		System.out.println("Program strat");
		NonStaticGlobalVariableExample3 ref1= new NonStaticGlobalVariableExample3();
		System.out.println("default, Non-static variable age: "+ref1.age);
		System.out.println("default, Non-static variable res: "+ref1.res);
		System.out.println("default, Non-static variable grade: "+ref1.grade);
		System.out.println("default, Non-static variable roi: "+ref1.roi);
		System.out.println("********updating value****");
		ref1.age=25;
		ref1.res=true;
		ref1.grade='B';
		ref1.roi=7.5f;
		System.out.println("updated, Non-static variable age: "+ref1.age);
		System.out.println("updated, Non-static variable res: "+ref1.res);
		System.out.println("updated, Non-static variable grade: "+ref1.grade);
		System.out.println("updated, Non-static variable roi: "+ref1.roi);
	}

}
 