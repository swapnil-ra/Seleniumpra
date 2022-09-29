package day3.variablestypes;
public class StaticGlobalVariableExample2 {
//  static global variable
    static int age; 
    static boolean res;
    static char grade;
    static float roi;
    public static void main(String[] args) {
      System.out.println("Program Strats");
      //
      System.out.println("defult value of age is:"+age);
      System.out.println("defult value of res is:"+res);
      System.out.println("defult value of grade is:"+grade);
      System.out.println("defult value of roi is:"+roi);
      System.out.println("*************************************");
      // Initialization static global variable value
      age=25;
      res=true;
      grade='A';
      roi=6.5f;
      System.out.println("defult value of age is:"+age);
      System.out.println("defult value of res is:"+res);
      System.out.println("defult value of grade is:"+grade);
      System.out.println("defult value of roi is:"+roi);
      System.out.println("Program Ends");
    }
    		  
      

	

}
