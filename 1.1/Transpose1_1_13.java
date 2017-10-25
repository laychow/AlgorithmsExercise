import java.util.Random;

public class Transpose1_1_13 {
	public static void transpose(int a[][]) {
		for (int i=0 ; i<a.length ;i++) {
			for (int j = 0 ; j<i; j++) {
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] a = new int[10][10];
        Random r = new Random();
        System.out.println("当前矩阵：");
        for (int i=0 ; i<a.length ;i++) {
			for (int j = 0 ; j<a[i].length; j++) {
				a[i][j]=r.nextInt(100);
				System.out.printf("%4d",a[i][j]);    //格式化输出
			}
			System.out.println("");
        }
        transpose(a);
        System.out.println("转置后：");
        for (int i=0 ; i<a.length ;i++) {
			for (int j = 0 ; j<a[i].length; j++) {
				
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println("");
        }
        
        
        
	}

}