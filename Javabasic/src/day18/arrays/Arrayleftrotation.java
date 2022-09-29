package day18.arrays;

import java.util.Arrays;

public class Arrayleftrotation {

	public static void main(String[] args) {
		int [] num =  {1, 2, 3, 4, 5};  
		 int first=num[0];
		 int last=num[4];
		int size= num.length;
		
		for (int j=0;j<size-1;j++) {
			num[j]=num[j+1]	; }
		
		for (int j=0;j<size-1;j++) {
			num[j]=num[j+1]	;
	}
		num [size-1]=first;
		System.out.println(Arrays.toString(num));
	
	}
	
	
		}