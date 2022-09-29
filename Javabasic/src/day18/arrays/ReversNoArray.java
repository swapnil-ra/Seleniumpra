package day18.arrays;

public class ReversNoArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,};
		System.out.println("orignal arry");
		for (int i = 0; i < a.length; i++) {  
        System.out.print(a[i] + " ");  
    }  
        System.out.println();  
        System.out.println("Array in reverse order: ");  
        for (int i = a.length-1; i >= 0; i--) {  
            System.out.print(a[i] + " ");  
        }
	}
}