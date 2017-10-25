import java.util.Random;

public class PrintBoolean1_1_11 {
	public static void formate(boolean a[][]) {
		Random r = new Random();
//		boolean [][] a = new boolean [10][10];
		int k=r.nextInt(1);
		for (int i=0; i<a.length; i++) {
			for(int j =0; j<a[i].length; j++) {
				if (k<0.5) 
					a[i][j]= true;
				else a[i][j]=false;
			    
			}
		}
	}
	public static void Print(boolean a[][]) {
		for (int i=0; i<a.length; i++) {
			for(int j =0; j<a[i].length; j++) {
				System.out.print(""+i+j+" "+a[i][j]);
			
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		boolean [][] a = new boolean [10][10];
        formate(a);
        Print(a);
	}

}
