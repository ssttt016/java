package whilecontrol;

public class P92 {

	public static void main(String[] args) {
		// 합과 평균을 구하시오
		
		int cnt = 0;
		int sum = 0;
		double avg = 0.0;
		System.out.println("Start ...");
		for(int i = 1 ; i <= 116 ; i++) {
			sum += i;
			cnt++;
				
		}
		avg = sum/(cnt*1.0);	//*1.0은 실수로 바꾸기 위함 왼쪽부터의 순서이기때문에 괄호를 씌워줘야함
		System.out.printf("%d, %f",sum, avg);
		System.out.println("End ..."+cnt);
	}

}
