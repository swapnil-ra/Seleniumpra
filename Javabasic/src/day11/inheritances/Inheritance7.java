package day11.inheritances;
//parent class
class fruits{
	int fruitAge;
	fruits() {
		System.out.println("fruit class cons..");
		fruitAge = 7;
	}
	public void taste() {
		System.out.println("Fruits are sweet");
	}
}
//child class of fruit
class orange extends fruits {
	int fruitAge;
	orange() {
		// super(); //java compiler will write default super()
		System.out.println("orange class Cons..");
		fruitAge = 5;

	
	}
	public void taste() {
		System.out.println("orange are sweet");
	}
	public void shape() {
		System.out.println("orange is round");
		System.out.println("Orange fruitAge: "+fruitAge);
		System.out.println("Fruits fruitAge: "+super.fruitAge);
		taste();//calling orange class taste method
		super.taste();//parent class fruit taste method
	}
}

public class Inheritance7 {

	public static void main(String[] args) {
		orange r1=new orange();
		r1.shape();
	}

}
