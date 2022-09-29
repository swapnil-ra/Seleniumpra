package day18.arrays;

import java.util.Arrays;

public class M_Array3 {

	public static void main(String[] args) {
		int []copyFrom = {1,2,3,4,5,6,7,8};
		int [] copyTo=Arrays.copyOf(copyFrom, copyFrom.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]+" ");
		}
		System.out.println("\n************Copy using range****************");
		int [] copyWithRange=Arrays.copyOfRange(copyFrom, 2, copyFrom.length);
		for(int i=0;i<copyWithRange.length;i++) {
			System.out.print(copyWithRange[i]+" ");
	}
		System.out.println("\n****************After Sorting********************");
		Arrays.sort(copyFrom);
		for(int c: copyFrom) {
			System.out.print(c+" ");
	}
	
}
}