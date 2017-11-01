package Exercise1_2;

public class Ex1_2_6 {
	public static boolean check(String s1,String s2) {
		if(s1.length()!=s2.length()) return false;
		if(s2.indexOf(s1.charAt(0))==-1) return false;
		int i=-1;
		int j=0;
		while(i<s1.length()) {
			
			char s1_0=s1.charAt(0);//s1的第一个字符
			j=s2.indexOf(s1_0,i+1);
			if(j==-1) return false;
			String temp1=s2.substring(j,s2.length());
			String temp2=s2.substring(0,j);
			String temp3=temp1.concat(temp2);
			if(temp3.equals(s1)) return true;
			i=j;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		if(check("ACTGACG","TGACGAC")==true) {
//			System.out.println("true");
//			
//		}
//		if(check("ACTGACG","TGACGAC")==false) {
//			System.out.println("false");
		System.out.println(check("ACTGACG","TGACGAC"));
		//}
		
	}

}
