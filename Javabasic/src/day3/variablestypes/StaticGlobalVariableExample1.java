package day3.variablestypes;

public class StaticGlobalVariableExample1 {

		private static final char A = 0;
		//  static global variable
	   static int age;
	   static boolean res;
	   static char grade;
	   static float roi;
	   static double x;
	   static short y;
	   public static void main (String[]args ) {
		   System.out.println("program strat");
		   System.out.println("defult value of age is:"+age);
		   System.out.println("defult value of age is:"+res);
		   System.out.println("defult value of age is:"+grade);
		   System.out.println("defult value of age is:"+roi);
		   System.out.println("defult value of age is:"+x);
		   System.out.println("defult value of age is:"+y);
		   System.out.println("program ends");
		   //***************************
		   age=25;
		   res=true;
		   grade=A;
		   roi=5.7f;
		   x=56.87;
		   y=6;
		   System.out.println("Update value of age is:"+StaticGlobalVariableExample1.age);
		   System.out.println("Update value of res is:"+StaticGlobalVariableExample1.res);
		   System.out.println("Update value of grade is:"+StaticGlobalVariableExample1.grade);
		   System.out.println("Update value of roi is:"+StaticGlobalVariableExample1.roi);
		   System.out.println("Update value of x is:"+StaticGlobalVariableExample1.x);
		   System.out.println("Update value of y is:"+StaticGlobalVariableExample1.y);
				   
				   
	   
	   

	}

}
