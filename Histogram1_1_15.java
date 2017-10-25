
public class Histogram1_1_15 {
	public static int[] histogram(int a[],int M) {
		int [] b = new int[M];
		for (int i =0;i<b.length;i++) {
			int num=0;
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) 
					num++;
				
				
			}
			b[i]=num;
		}
		
		
		return b;
	}
//	public static int 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M=10;
		int []a ={1,2,2,1,4,5,3,5,2,3,5,9};
		int []b = new int[M];
		b=histogram(a,M);
		for(int i=0; i<b.length;i++) {
			System.out.printf("%2d\t", b[i]);
		}
		
				
				
				
	}

}
