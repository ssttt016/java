package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {
		// 숫자를 4개의 2자릿수를 입력 받는다.
		// 만약 2자릿수가 아니면 프로그램 종료.
		
		Scanner sc = new Scanner(System.in);
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
		
		
		System.out.println("국어성적 입력:");
		ko = Integer.parseInt(sc.next());
		if (ko < 10 || ko >= 100) {sc.close(); return;}
		System.out.println("영어성적 입력:");
		en = Integer.parseInt(sc.next());
		if (en < 10 || en >= 100) {sc.close(); return;} 
		System.out.println("수학성적 입력:");
		ma = Integer.parseInt(sc.next());
		if (ma < 10 || ma >= 100) {sc.close(); return;}
		System.out.println("과학성적 입력:");
		si = Integer.parseInt(sc.next());
		if (si < 10 || si >= 100) {sc.close(); return;}
		
		// 평균과 합계를 구합니다.
		int sum = ko + en + ma + si;
		double ave = sum/4.0;
		String grade = "";

		
		// 평균이 90 이상이면 A
		// 평균이 80 이상이면 B
		// 평균이 70 이상이면 C
		// 평균이 60 이상이면 D
		// 60미만이면 F
		if (ave >= 90) {
			grade = "A";
		}else if (ave >= 80) {
			grade = "B";
		}else if (ave >= 70) {
			grade = "C";
		}else if (ave >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
//		 grade = (ave >= 90) ? "A" : (ave >= 80) ? "B" : (ave >= 70) ? "C" : (ave >= 60) ? "D" : "F";  
			
		// 합계, 평균, 학점을 출력 하시오. 
			System.out.printf("%d, %.2f, %s", sum, ave, grade);
			sc.close();
		
		

		

	}

}
