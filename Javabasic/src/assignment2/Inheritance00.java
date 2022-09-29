package assignment2;
class dog{
	dog(){
		this(444);
		this.love(77.7,897);
		System.out.println("1 constructor of class dog");
	}
	dog (int c){
		System.out.println("2 constructorof class dog");
		System.out.println("value of c "+c);
}
	public void love(int a) {
		System.out.println("first methoad of class dog");
		System.out.println("value of a"+a);
	}
	public void love(int k,double r) {
		System.out.println("secound methoad of class dog");
		System.out.println("value of k"+k);
		System.out.println("value of r"+r);
		}
	public void love(double d,int v) {
		System.out.println("third methoad of class dog");
		System.out.println("value of d"+d);
		System.out.println("value of v"+v);	
	}
		
}
class cat{
	cat(){
		this(110);
		this.swap(44);
		System.out.println("1 constructorof class cat");
	}
	cat(int m){
		super.love(90);
		System.out.println("2 constructorof class cat");	
	}
	cat(double z,int o){
		System.out.println("3 constructorof class cat");
	}
	public void swap() {
		System.out.println("first methoad of class cat");
		
	}
	public void swap(int g) {
		System.out.println("secound methoad of class cat");
		System.out.println("value of g"+g);
	}
	public void swap(double n,int m) {
		System.out.println("third methoad of class cat");
		System.out.println("value of n "+n);
		System.out.println("value of m "+m);
		
	}
}
public class Inheritance00 {

	public static void main(String[] args) {
		dog r1=new dog();
		dog r2 =new dog(51);
		cat c1=new cat ();

	}

}
