package day3.variablestypes;

public class NonStaticGlobalVariableExample4 {

	private String age;
	private String res;
	private String grade;
	private String roi;

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
		NonStaticGlobalVariableExample4 ref2= new NonStaticGlobalVariableExample4();
		System.out.println("default with ref2, Non-static variable age: "+ref2.age);
		System.out.println("default with ref2, Non-static variable res: "+ref2.res);
		System.out.println("default with ref2, Non-static variable grade: "+ref2.grade);
		System.out.println("default with ref2, Non-static variable roi: "+ref2.roi);
		System.out.println("Program ends");



	}

}
