package Exercise1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;

public class Ex1_2_9 {
	
		public static int rank(int key, int[]a,Counter c) {
			int lo=0;
			int hi=lo+a.length-1;
			while(lo<=hi) {
				
				int mid = lo+(hi-lo)/2;
				if(key<a[mid]) hi=mid-1;
				else if(a[mid]<key) lo=mid+1;
				
				else {
					c.increment();
					return mid;
				}
				
				
			}
			return -1;
		}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c=new Counter("counter1");
		//System.out.println(c.tally());
		int[] a = {1,23,53,65,75};
		System.out.println("请输入需要查找的数字：");
		int key=StdIn.readInt();
		if(rank( key, a,c)==-1) {
			System.out.println("Not Found");
			System.out.println(c.tally());
		}
		else {
			System.out.println("The rank is "+rank(key, a,c));
			System.out.println(c.tally());
		}
		
	}

}
