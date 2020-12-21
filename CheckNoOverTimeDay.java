package poly.kansai.enshu;

import java.util.Calendar;

public class CheckNoOverTimeDay {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] noOvertimeDays = {Calendar.MONDAY,Calendar.WEDNESDAY};
//2,4

		String[] weeks = {"日","月","火","水","木","金","土"};
		int[] today = getToday();
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String dayoftheweek = getWeeks(noOvertimeDays,week);
		//boolean is Day = isNoOvertimeDay(noOvertimeDays);

		showResult(today,weeks,week,dayoftheweek);

	}



		static int[] getToday() {
			Calendar cal = Calendar.getInstance();
			int year = cal.get(Calendar.YEAR);
			int month =cal.get(Calendar.MONTH)+1;
			int date = cal.get(Calendar.DATE);
			int[]today = {year,month,date};


		return today;

	}
		static String getWeeks(int[]noOvertimeDays,int week) {
			
			String dayoftheweek = "";
			if(week==(noOvertimeDays[0])) {
				 dayoftheweek = ("ノー残業日です");

			}else if(week==(noOvertimeDays[1])) {
				 dayoftheweek = ("ノー残業日です");

			}else {
				 dayoftheweek = ("残業日です");
				}

			     return dayoftheweek;
		}
			static void showResult(int[]today,String[]weeks,int week,String dayoftheweek) {
				System.out.println(today[0]+"年"+today[1]+"月"+today[2]+"日"+"("+weeks[week-1]+")");
				System.out.println(dayoftheweek);
			}

		}






