package day18.stringclasses;

import java.util.Scanner;

public class StringClass2 {

	public static void main(String[] args) {
		String s1= "dhanoripune";
		char c=s1.charAt(0);
		System.out.println("Char at index 0:"+c);
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
			
		}
		System.out.println("***********************");
		for(int i= s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
			
		}
		String tem="";
		for(int i=s1.length()-1;i>=0;i--) {
			tem=tem+ s1.charAt(i);
		}
		System.out.println("str1: " + s1);
		System.out.println("temp: " + tem);
		System.out.println(reverseString("DhanoriPune"));
		
		String s2="Bangalore";
		System.out.println(reverseString(s2));
		
		Scanner scn=new Scanner(System.in);
		String s3;
		System.out.println("Enter String to be reverse: ");
		s2=scn.next();
		System.out.println("Reverse String is: "+reverseString(s3));
		}
	
	}


