package Exercise1_2;

import edu.princeton.cs.algs4.Point2D;
//import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Point2DTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println("请输入任意整数N:");
		int N = StdIn.readInt();
		Point2D[] points=new Point2D[N];
		for(int i=0;i<N;i++) {
			double x = Math.random();
			double y = Math.random();
			points[i]=new Point2D(x,y);
			points[i].draw();
		}
		double [] distances = new double [((N-1)*N)/2];
		for(int k=0;k<((N-1)*N)/2;k++) {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N-i;j++) {
					distances[k]=points[i].distanceTo(points[i+j]);
					StdOut.println("点"+i+"和点"+(i+j)+":"+distances[k]);
				}
				
			}
		}
	

	}

	

}
