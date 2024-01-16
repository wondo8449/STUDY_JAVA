package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		date.setYear(121); // 1900년부터 시작점이기 때문에 전달할 정수와 더하여 년도가 설정된다
		date.setMonth(11); // 월은 0부터 시작한다
		date.setDate(4); // 그냥 지정한대로 된다
		
		System.out.println(date);
		
//		Date today = new Date();
////		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		
////		System.out.println(today);
//		System.out.println(sdf2.format(today));
//	
//		try {
//			System.out.println(sdf2.parse("2002/04/20 13:55:25") instanceof Date);
//		} catch (ParseException e) {;}
	}
}
