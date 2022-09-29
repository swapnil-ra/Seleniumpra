package day18.arrays;

public class SmallNo {

	public static void main(String[] args) {
		int []code= {11,22,33,44,55};
		int size=code.length;
		int min= code[0];
		
		for(int i=2;i< size;i++) {
			if (min > code[i]) {
				min = code[i];
			}
		
		System.out.println("Min number in array is: "+min);
	
	}
		
	}
}
