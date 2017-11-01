package Exercise1_2;

public class Ex1_2_12 {
	private int year;
	private int month;
	private int day;	
	
	private Ex1_2_12(int y,int m,int d) {
		while(true) {
		if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
			if(d>0&&d<=31) {
				year=y;
				month=m;
				day=d;
			}
			else throw new IllegalArgumentException("日期非法");
			break;
		}
		if(m==2) {
			if(y%400==0) {
				if(d>0&&d<=29){
					year=y;
					month=m;
					day=d;
				}
				else throw new IllegalArgumentException("日期非法");
			}
			else if((y%100!=0)&&y%4==0) {
				if(d>0&&d<=29){
					year=y;
					month=m;
					day=d;
				}
				else throw new IllegalArgumentException("日期非法");
			}
			else {
				if(d>0&&d<=28){
					year=y;
					month=m;
					day=d;
				}
				else throw new IllegalArgumentException("日期非法");
			}
			break;
		}
		if(m==4||m==6||m==9||m==11) {
			if(d>0&&d<=30) {
				year=y;
				month=m;
				day=d;
			}
			else throw new IllegalArgumentException("日期非法");
			break;
		}
		
		else throw new IllegalArgumentException("月份非法");
		}
	}
	public int ShowYear() {
		return year;
	}
	public int ShowMonth() {
		return month;
	}
	public int ShowDay() {
		return day;
	}
	public String dayOfTheWeek() {
		if(month==1||month==2) {
			month+=12;
			year--;
		}
		int week=(day+2*month+3*(month+1)/5+year+year/4-year/100+year/400)%7; //基姆拉尔森计算公式
		switch(week) {
		case 0:return "Monday";
		case 1:return "Tuesday";
		case 2:return "Wednesday";
		case 3:return "Thursday";
		case 4:return "Friday";
		case 5:return "Saturday";
		case 6:return "Sunday";
		//default return null;
		}
		return null;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int day=Integer.parseInt(args[2]);
		try {
			Ex1_2_12 SD = new Ex1_2_12(year,month,day);
			System.out.println("输入日期为: "+SD.ShowYear()+"年 "+SD.ShowMonth()+"月 "+SD.ShowDay()+"日"+SD.dayOfTheWeek());
	
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

		
	}

}
