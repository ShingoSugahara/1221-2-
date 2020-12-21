package poly.kansai.sample;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String text = date.format(formatter);
		
		System.out.println(text);
		
	}

}
