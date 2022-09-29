package day18.predefinedclasses.stringclasses;

import java.util.Scanner;

public class ScannerClassExample1 {

	public static void main(String[] args) {
		String s=" Hello.i m bosss ";
		Scanner a=new Scanner(s);
		System.out.println("Boolean Result: " + a.hasNext());
		System.out.println("String: " + a.nextLine());
		a.close();
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age: ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.print("Enter your salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: " + d);
		in.close();
	}

}
