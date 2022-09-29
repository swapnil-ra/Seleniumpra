package day16.typecasting;
class Member {
	long phone ;
	void chat() {
		System.out.println("chating in whatsup group with"+phone);
	}
}
class Admin {
	void AddNumber(){
		System.out.println("adding a new user number in whatsup group");
	}
}
public class DerivedCasting2 {

	public static void main(String[] args) {
		// Creating an object Ad
		Member mem = new Admin();//upcasting -implicit 
		mem.phone = 9876543210l;
		// Calling function
		mem.chat();		
		System.out.println("********** After downcasting ********");
		Admin ad = (Admin) mem; // Downcast to access specific property of subclass
		ad.addNumber();
		ad.chat();
		System.out.println(ad.phone);		
		//Admin a1=new Member();//direct downcasting, invalid or not possible	}

}
