package Exercise1_2;

import edu.princeton.cs.algs4.Date;

public class Transaction {
    private String name;
    private Date ymd;    
    private double amount;
    
    private Transaction(String name,Date ymd,double amount) {
    		this.name=name;
    		this.ymd=ymd;
    		this.amount=amount;
    }
    
    public String ShowName() {
    		return name;
    }
    public Date ShowDate() {
    		return ymd;
    }
    public double ShowAmount(){
    		return amount;
    }
    @Override
    public boolean equals(Object o) {
    		if(this==o) return true;
    		if(o==null) return false;
		Transaction that=(Transaction)o;
		if(!this.name.equals(that.name)) return false;
		if(!this.ymd.equals(that.ymd)) return false;
		if(this.amount!=(that.amount)) return false;
		return true;
    	
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction t1=new Transaction("Lay",new Date(1,2,1994),1);
		Transaction t2=new Transaction("Lays",new Date(1,2,1994),1);
		System.out.println(t1.equals(t2));
	}

}
