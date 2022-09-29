package dayy7method;

public class MethodWithX_ReturnType3 {


		static int x = 10, y = 20, z = 30;

		public static void main(String[] args) {
			System.out.println("Input the first number: " + x);
			System.out.println("Input the second number: " + y);
			System.out.println("Input the third number: " + z);
			System.out.println("The average value is " + avarage(z, y, x));
			
			System.out.println("The average value is " + avarage(25, 65, 80));
			System.out.println("The average value is " + avarage(20, 30, 50));
			System.out.println("The average value is " + avarage(50, 10, 30));
			int a=25,b=75,c=50;
			double avg=avarage(a,b,c);
			double result=avg+100;
			System.out.println("Final number: "+result);
	}
public static int avarage(int p,int q,int r) {
  return (p+q+r)/3;
}
}