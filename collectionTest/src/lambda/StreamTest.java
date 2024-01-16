package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
		HashMap<String, Integer> chinaTown = new HashMap<>();
		
		chinaTown.put("짜장면", 4500);
		chinaTown.put("짬뽕", 5000);
		chinaTown.put("탕수육", 14500);
		
//		forEach() 
		
//		여러 개를 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다
//		forEach 메소드에는 Consumer 인터페이스 타입의 값을 전달해야한다
//		Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다
		
//		매개변수에는 컬렉션 객체 안에 들어있는 값들이 순서대로 담기고
//		화살표 뒤에서는 구현하고 싶은 문장을 작성한다
		
//		chinaTown.values().stream().forEach(v -> System.out.println(v));
//		chinaTown.values().forEach(v -> System.out.println(v));
		
//		전달받은 매개변수를 그대로 메소드에 사용할 경우에는 참조형 문법을 사용할 수 있다
//		소속::메소드명 --> 전달받은 값을 메소드의 매개변수로 바로 전달해준다
//		String::toString --> 전달받은 값에 바로 toString 메소드를 사용해준다
//		String::toUpperCase --> 전달받은 값을 바로 toUpperCase 메소드에 전달해준다
		
		chinaTown.values().forEach(System.out::println);
		
//		IntStream.range(start, end) : start부터 end-1까지
//		IntStream.rangeClosed(start, end) : start부터 end까지
		
		IntStream.range(0, 10).forEach(System.out::print);
		
//		chars() : 문자열을 문자 stream으로 변경
		String data = "ABC";
//		data.chars().forEach(System.out::print);
		data.chars().forEach(c -> System.out.print((char)c));
		
//		map() : 기존 값을 원하는 값으로 변경
		String data2 = "ABC";
		data.chars().map(c -> c+3).forEach(c -> System.out.print((char)c));
		
//		filter() : 조건식을 작성하여 false일 경우 제외시킨다.
		IntStream.range(1, 11).filter(i -> i % 2 == 0).forEach(System.out::print);
		
//		오름차순
		ArrayList<Integer> datas3  = new ArrayList<>(Arrays.asList(10, 40, 30, 20));
		datas3.stream().sorted().forEach(System.out::println);
		
//		내림차순
		datas3.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		
//		joining("구분점") :  문자열 요소들을 구분점으로 연결하여 문자열로 리턴한다.
		System.out.println(datas3.stream().map(String::valueOf).collect(Collectors.joining(" ")));
	}
}