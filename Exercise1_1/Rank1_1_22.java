package Exercise1_1;

public class Rank1_1_22 {
    public static int rank(int key, int[] a ,int lo, int hi,int depth) {
    	    if(lo>hi) return -1;
    		else if(lo==hi && a[lo]==key) return a[lo];
    		int mid =lo + (hi-lo)/2;
    		System.out.println("lo="+lo+" "+"mid="+mid+" "+"hi="+hi+" "+"depth="+depth);
    		if (key<a[mid]) return rank(key,a,lo,mid-1,depth+1);
    		else if(key>a[mid]) return rank(key,a,mid+1,hi,depth+1);
    		else return a[mid];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = {1,3,4,6,8,9,11,24};
        System.out.println(rank(90,a,0,a.length-1,0));
        
	}

}

