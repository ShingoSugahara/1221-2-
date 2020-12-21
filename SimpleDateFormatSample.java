package poly.kansai.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM");


		String text = sdf.format(date);

		System.out.println(text);


	}

}
