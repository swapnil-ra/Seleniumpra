package day11.overridings;
	class Animal1{
	public void move() {
		System.out.println("Animals can move");
	}
}
	class dog extends Animal1{
	dog(){
		super();
		}
	public void move() {
	System.out.println("dogs can walk and run");
}
	public void bark() {
		System.out.println("dogs is bark");
		super.move();
	}
}
	public class Overriding1 {

	public static void main(String[] args) {
		//Animal1 r1=new Animal1();
		//r1.move();
		dog r2=new dog();
		r2.move();
		r2.bark();
		Animal1 r3=new dog();
		r3.move();
		

	}

}
