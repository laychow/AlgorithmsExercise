package Exercise1_1;

public class Value {
	public static String exR1(int n) {
		if(n<=0) return "";
		return exR1(n-3)+n+exR1(n-2)+n;
	}
	public static int mystery(int a,int b) {
		if(b==0) return 1;
		if(b%2==0) return mystery(a+a,b/2);
		return mystery(a+a,b/2)+a;
	}
	
	
	
	public static long factorial(int n) {
		if(n==1||n==0) return 1;
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //System.out.println((char)('b'+4));
		
		
		
//		int[] a = new int[10];
//		for (int i = 0 ; i<10; i++)
//			a[i]=9-i;
//		for (int i = 0 ; i<10; i++)
//			a[i]=a[a[i]];
//		for (int i = 0 ; i<10; i++)
//			System.out.println(i);
		
		
		System.out.println(factorial(4));
	}

}
