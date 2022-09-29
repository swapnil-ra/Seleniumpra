package day18.arrays;

import java.util.Arrays;

public class Arrayrightrotation {

	public static void main(String[] args) {
		int [] num =  {1, 2, 3, 4, 5};
		
		 int size=num.length;
		 int last=num[size-1];
		
		for(int i=size-1;i>0;i--) {
			num[i]=num[i=1];
		}
		num[0]=last;
		System.out.println(Arrays.toString(num));
	}
	
	}
