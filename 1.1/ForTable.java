import java.util.Scanner;

public class ForTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("请输入姓名和两个整数：（以空格分开）");
		String name = in.next();
		int a = in.nextInt();
		int b = in.nextInt();
		double c = (double)a/b;
		System.out.printf("%5s%5d%5d%5.3f",name,a,b,c);
		//System.out.println(c);
	}

}