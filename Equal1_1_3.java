import java.util.Scanner;

public class Equal1_1_3 {
	public static boolean equal() {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		boolean result=true;
		for (int i = 0; i<2; i++) {
			if(a!= in.nextInt())
				result=false;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//		//int [] a = new int [3];
//        for (int i = 0;i<3 ;i++) {
//        		if(a==in.nextInt())
		System.out.println(equal());
        			
        
        
	}
}


