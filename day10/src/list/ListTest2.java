package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); // List 는 인터페이스여서 객체 생성이 불가 그래서 ArrayList를 부르는 것
		
//		ArrayList<Integer> list = new ArrayList<Integer>(); 이렇게도 가능은 함 (인터페이스를 거치지 않기)
		// 1 ~ 10까지의 숫자를 20개 입력 한다.
		// 단 while 문을 이용한다.
		Random r = new Random();
		while(true) {
			list.add(r.nextInt(10)+1);
			if(list.size() == 20) {
				break;
			}
		}
//		while(list.size() < 20) {    강사님의 솔루션
//			int num = r.nextInt(20)+1;
//			list.add(num);
//		}
		for(int data:list) {
			System.out.println(data);
		}
	}

}
