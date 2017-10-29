package Exercise1_1;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch1_1_23 {
	public static int rank(int key, int[]a) {
		int lo=0;
		int hi=lo+a.length-1;
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2;
			if(key<a[mid]) hi=mid-1;
			else if(a[mid]<key) lo=mid+1;
			else return mid;
		}
		return -1;
	}
//	public static int rank(int key, int[] a) {
//		return rank(key, a, 0, a.length - 1);
//	}
//
//	public static int rank(int key, int[] a, int lo, int hi) {
//		if (lo > hi) {
//			return -1;
//		}
//		int mid = lo + (hi - lo) / 2;
//		if (key < a[mid]) {
//			return rank(key, a, lo, mid - 1);
//		} else if (key > a[mid]) {
//			return rank(key, a, mid + 1, hi);
//		} else {
///			return mid;
//		}
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,4,6,8,9,11,24};
		System.out.println("请输出符号“+”or“-”：（其中“+”表示打印非该名单中的值，“-”表示打印存在于该名单中的值");
		char cha=StdIn.readChar();
		System.out.println("请输入key：（以空格隔开）");
		StdIn.readLine();
		String[] keys=StdIn.readLine().split(" ");
		//System.out.println(keys.length);
		for(int i = 0;i<keys.length;i++) System.out.println(keys[i]);
		for(int i=0;i<keys.length;i++) {
			if(rank(Integer.parseInt(keys[i]),a)!=-1&&cha=='-') {
				System.out.printf("%3s" , keys[i]);
			}
			else if (rank(Integer.parseInt(keys[i]),a)==-1&&cha=='+') {
				System.out.printf("%3s" , keys[i]);
			}
		}
		System.out.println();
		
	}

}
