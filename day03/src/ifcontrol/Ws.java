package ifcontrol;

public class Ws {

	public static void main(String[] args) {
		// 1 ~ 100까지의 숫자 중
		// 1. 3의 배수의 합과 평균을 구하시오
		// 1. 4의 배수의 합과 평균을 구하시오
		// 1. 7의 배수의 합과 평균을 구하시오

		int sum3 = 0;
		int sum4 = 0;
		int sum7 = 0;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt7 = 0;
		double avg3 = 0.0;
		double avg4 = 0.0;
		double avg7 = 0.0;
		for(int i = 1; i <= 100; i++) {
			if(i%3 == 0) {
				sum3 += i;
				cnt3++;		
			}
		}
		avg3 = sum3*1.0 / cnt3;
		System.out.printf("%d, %.2f \n", sum3 ,avg3);
		
		for(int b = 1; b <= 100; b++) {
			if(b%4 == 0) {
				sum4 += b;
				cnt4++;		
			}
		}
		avg4 = sum4*1.0 / cnt4;
		System.out.printf("%d, %.2f \n", sum4,avg4);
		
		for(int c = 1; c <= 100; c++) {
			if(c%7 == 0) {
				sum7 += c;
				cnt7++;		 
			}
		}
		avg7 = sum7*1.0 / cnt7;
		System.out.printf("%d, %.2f \n", sum7,avg7);
	}

}
