package day18.arrays;

public class SortAscOrd {

	public static void main(String[] args) {
		int swa []= {11,44,87,13,15,17,23,33,56,76,};
		int temp=0;
		for(int i=0;i<swa.length;i++) {
			for(int j=i;j<swa.length;j++) {
				if(swa[i]<swa[j]) {
				
				temp=swa[i];
				
				swa[i]=swa[j];
				
				swa[j]=temp;
				
			}
			}	
		}
	    for(int i=0;i<swa.length;i++) {
		System.out.print(" " +swa[i]+" ");
		//break;
	}
	}
	}
