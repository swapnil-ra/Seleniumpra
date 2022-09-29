package day18.arrays;

public class DesOrdArray {

	public static void main(String[] args) {
		int a[]= {63,45,12,16,25,28,48,42,};
		int temp;
		for(int i=0;i< a.length;i++) {
			for(int j=i+1;j< a.length;j++) {
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.print("Desa"+a[i]+" "); 
	}
	}
}
