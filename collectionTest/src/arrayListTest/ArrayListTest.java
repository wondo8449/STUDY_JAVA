package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
//		<?> : 제네릭(이름이 없는)
//		임시로 타입을 선언하여 임시 타입으로 설계한다.
//		따로 다운 캐스팅을 할 필요가 없다.
//		지정할 타입에 제한을 둘 수 있다.
		
		ArrayList<Integer> datas = new ArrayList<>();
		
		datas.add(10);
		datas.add(20);
		datas.add(70);
		datas.add(40);
		datas.add(30);
		datas.add(60);
		datas.remove(1);
		datas.set(3, 25);
		datas.add(2, 30);
		if(datas.contains(60)) {
			datas.set(datas.indexOf(60), 11);
		}
		
		System.out.println(datas.size());
		
		
//		for (int i = 0; i < datas.size(); i++) {
//			System.out.println(datas.get(i));
//		}
		
//		빠른 for문 = for(하나씩 담을 데이터 : 전체 데이터)
		for(int data : datas) {
			System.out.println(data);
		}
		
		System.out.println(datas);
//		주소를 직접 전달하여 sort메소드에서 정렬이 되었기 때문에
//		전달한 datas의 값들이 정렬된 값으로 변경되어 있다.
		Collections.sort(datas); // 순서대로 정렬
		System.out.println(datas);
		
		Collections.reverse(datas); // 가운데 기준을 좌우반전
												// 이것만 써서는 내림차순 X
		System.out.println(datas);
		
//		Collections.shuffle(datas); //랜덤으로 섞기
//		System.out.println(datas);
		
		//추가(삽입)
		//삭제
		//수정
	}
}
