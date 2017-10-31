package Exercise1_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class Ex1_2_2Interval1DTest{
	public static void main(String[] args){
		int N=Integer.parseInt(args[0]);
		Interval1D[] intervals = new Interval1D[N];
		for(int i=0;i<N;i++){
			intervals[i]=new Interval1D(StdIn.readDouble(),StdIn.readDouble());
		}
		if(N>2){
			for(int i=0;i<N;i++){
				for(int j=1;j<N-i;j++){
					if(intervals[i].intersects(intervals[i+j]))
						System.out.println(intervals[i]+"与"+intervals[i+j]+"相交");
				}
			}
		}
	}
}