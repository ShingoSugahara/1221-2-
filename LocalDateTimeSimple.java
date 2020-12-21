package poly.kansai.sample;
import java.time.LocalDateTime;
import java.time.Month;
public class LocalDateTimeSimple {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		LocalDateTime ldf = LocalDateTime.now();
		
		int year = ldf.getYear();
		int month = ldf.getMonthValue();
		int date = ldf.getDayOfMonth();
		Month mmonth = ldf.getMonth();//列挙型
		
		System.out.printf("%d/%d/%d\n",year,month,date);
		System.out.println(mmonth);
	}

}
