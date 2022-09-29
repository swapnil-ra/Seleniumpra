package day18.arrays;

public class Find3LrNOAr {

	public static void main(String[] args) {
		int [] o= {22,33,43,54,32,60,};
		int temp;
		for(int i=0;i<o.length;i++) {
			for(int j=i;j<o.length;j++) {
				if(o[i]<o[j]) {
					temp=o[i];
					o[i]=o[j];
					o[j]=temp;
				}
			}
			
		}
		for(int i=2;i<o.length;i++) {
			System.out.println("Third largest no:"+o[i]+"  ");
			break;
		}
		for(int i=1;i<o.length;i++) {
			System.out.println("Secound largest no:"+o[i]+"  ");
			break;
	}
		for(int i=0;i<o.length;i++) {
			System.out.println("Higest no:"+o[i]+"  ");
			break;
		}
		for(int i=5;i<o.length;i++) {
			System.out.println("Smallest no:"+o[i]+"  ");
			break;
		}

}
}