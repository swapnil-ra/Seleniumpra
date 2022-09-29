package day18.arrays;

public class SumOfArray {

	public static void main(String[] args) {
		int []numbers = {1,3,7,-9,9,8,6};
		
		int sum=0;
		double average;
		for(int num:numbers) {
			sum +=  num; 
			int arrayLength = numbers.length;
			average = sum /arrayLength;
			average=((double)sum/(double)arrayLength);
			System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
		}
	}

}
