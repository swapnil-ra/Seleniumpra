package day18.arrays;

public class ArrayOodno {

	public static void main(String[] args) {
		int roll[]= {11,12,13,14,15,16,17,18,19,20};
		int size=roll.length;
		for(int i=0;i<size;i++) {
			if(roll[i]%2!=0)
	System.out.print(roll[i]+" ");
		}
	}

}
