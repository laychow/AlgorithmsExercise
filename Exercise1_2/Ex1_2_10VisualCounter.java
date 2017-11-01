package Exercise1_2;

import java.awt.Color;

import edu.princeton.cs.algs4.StdDraw;

public class Ex1_2_10VisualCounter {
	private int N=0;
	private int max=0;
	private int count=0;
	private int n=0;
	
	private Ex1_2_10VisualCounter(int N,int max) {
			this.N=N;
			this.max=max;
			Color c =new Color(500);
			StdDraw.setXscale(0,N);
			StdDraw.setYscale(-max,max);
			StdDraw.point(0,0);
			StdDraw.setPenRadius(0.03);
			StdDraw.setPenColor(c);
		}
	private void increament() {
		if(n>N) {
			System.out.println("超出操作次数！");
			return;
		}
		if(count<=max) {
			count++;
			n++;
			StdDraw.point(n, count);
		}
		else {
			System.out.println("Out of upperbound!");
			return;
		}
		
	}
	private void decreament() {
		if(n+1>N) {
			System.out.println("超出操作次数！");
			return;
		}
		else if(count>=-max) {
			count--;
			n++;
			StdDraw.point(n, count);
			} 
		else {
			System.out.println("Out of lowwerbound!");
			return;
		}
	}
	private int GetCount() {
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1_2_10VisualCounter v=new Ex1_2_10VisualCounter(20,10);
		for(int i =0;i<8;i++) {
			v.increament();
		}
		for(int i =0 ;i<6;i++) {
			v.decreament();
		}
	}

}
