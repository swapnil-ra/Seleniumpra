package day18.arrays;

public class CopyArray1 {

	public static void main(String[] args) {
		int[] OldArray= {1,2,3,4,5,6,7,8};
		int[] newArray=new int [OldArray.length];
		for(int i=0;i<OldArray.length;i++){
			newArray[i]=OldArray[i];
			
	}
		System.out.println("new Array");
		for(int i=0;i<OldArray.length;i++)
			System.out.print(newArray[i]+" ");
	
	}
	
	
}
