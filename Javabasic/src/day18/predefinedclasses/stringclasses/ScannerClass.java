package day18.predefinedclasses.stringclasses;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		//int age =34;
		//double salry=3456.77;
	//	String name =vaijapur;
		 Scanner s1= new Scanner(System.in);
		 int age;
		 double salary;
		 String name;
		 boolean valid;
		 System.out.println("Enter age value from console");
		 age = s1.nextInt();
		 System.out.println("Enter salary");
		 salary=s1.nextDouble();
		 System.out.println("Enter city name");
		 name=s1.next();
		 System.out.println("Enter true/false value from console\"");
		 valid=s1.nextBoolean();
		 System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("name: " + name);
		System.out.println("valid: " + valid);
		System.out.println("*****");
		int num1,num2;
		System.out.println("enter num1 value");
		num1=s1.nextInt();
		System.out.println("enter num2 value");
		num2=s1.nextInt();
		char op;
		System.out.println("Enter operator: ");
		op=s1.next().charAt(0);
		System.out.println("Addition of two numbers: " + addnumber(op, num1, num2));
		System.out.println("*****************************************");
	
		 }

	static int addnumber(char op, int num1, int num2) {
		 if (op == '-') {return num1 -num2;
			} else  {
				return 0;
			}
		
	}
	
	

}
