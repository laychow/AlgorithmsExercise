import java.util.Scanner;

public class Logtwo1_1_14 {
    public static int log2(int N) {
    		int a=1;
		int num=0;
    		for (int i=0;true;i++) {
    			
    			a*=2;
    			
    			if(a>N) {
    				return num;
    			}
    			num++;
    		}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new  Scanner(System.in);
        System.out.println("请输入要求的整数N：");
        int N=input.nextInt();
       
        System.out.print("log2 "+N+":");
        System.out.println(log2(N));
	}

}
