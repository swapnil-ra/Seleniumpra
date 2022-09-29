package day10;

public class Cons4 {
int roll;
double salery;
Cons4(int r,double s) {
	roll=r;
	salery=s;
}
void display() {
System.out.println(roll+" "+salery);
}	
public static void main(String[] args) {
 Cons4 r1= new Cons4(1234,3456.87); 
 r1.display();
 Cons4 r2=new Cons4(345,678.89);
 r2.display();
  }

	}


