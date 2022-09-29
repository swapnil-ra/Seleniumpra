package day11.inheritances;
//parent calss
class fruti{
	fruti(){ System.out.println("fruti class cons");
		}
	public void teste() {
		System.out.println("fruti is sewwt ");
		
	}
		}
//chalid class of fruti
class apple extends fruti{
	apple(){System.out.println("aaple class cons");
	}
	public void shape() {
		System.out.println("aaple is round");	
		}
}
public class Inheritance2 {

	public static void main(String[] args) {
		apple r1 =new apple();
		r1.teste();
		r1.shape();
		
		// TODO Auto-generated method stub

	}

}
