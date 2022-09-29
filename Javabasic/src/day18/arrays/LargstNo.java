package day18.arrays;

public class LargstNo {

	public static void main(String[] args) {
		int numbers[]= {23,25,28,30,34,};
		int size =numbers.length;
		int max = numbers[0];
		for (int i = 1; i <size; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.print("max number in array is: "+max);
	}
	}

