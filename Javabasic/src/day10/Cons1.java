package day10;

public class Cons1 {

	Cons1() {
	System.out.println("this is a zero oere cons"); 
	}
	public Cons1 (char c) {
	System.out.println("this is a sigle per cons");
	}
	Cons1(int num1,int num2){
		System.out.println("this is a int int pere cons");
	}
	Cons1(double num1,int num2){
		System.out.println("this is double int pere cons");
	}
	Cons1(int num1,double num2){
		System.out.println("this is int double perea cons");
	}
	public static void main (String[] args) {
	Cons1 r1=new Cons1();
	 Cons1 r2=new Cons1(10, 20);
	 Cons1 r3=new Cons1('d');
	 Cons1 r4=new Cons1(23.5 ,45);
	 Cons1 r5=new Cons1(26,56);
}
}

	
