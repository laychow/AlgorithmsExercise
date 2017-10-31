package Exercise1_1;

import edu.princeton.cs.algs4.StdIn;

public class Gcd1_1_24 {
	public static int Euclid(int p ,int q) {
		System.out.println("p="+" "+p+"q= "+q);
		if(q==0) return p;
		int r=p%q;
		return Euclid(q,r);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入两个整数：（以空格键隔开）");
//      StdIn.readLine();
		String [] num=StdIn.readLine().split(" ");
		System.out.println(num.length);
		//int [] para = new int[2];
		//for(int i = 0;i<num.length;i++) {
		int p=Integer.parseInt(num[0]);
		int q=Integer.parseInt(num[1]);
		//System.out.println(p);
		//System.out.println(q);
		System.out.println("最大公约数为："+Euclid(p,q));
	}

}
