package poly.kansai.enshu;
import java.util.Calendar;
public class TodayWeek {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Calendar cal = Calendar.getInstance();
          int week = cal.get(Calendar.DAY_OF_WEEK);
          switch(week){
        	  case 1:
        		  System.out.println("日曜日です");
        		  break;

        	  case 2:
        		  System.out.println("月曜日です");
        		  break;

        	  case 3:
        		  System.out.println("火曜日です");
        		  break;

        	  case 4:
        		  System.out.println("水曜日です");
        		  break;

        	  case 5:
        		  System.out.println("木曜日です");
        		  break;

        	  case 6:
        		  System.out.println("金曜日です");
        		  break;
        	  case 7:
        		  System.out.println("土曜日です");
        		  break;
          }




	}

}
