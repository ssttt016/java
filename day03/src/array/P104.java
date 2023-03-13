package array;

import java.util.Arrays;
import java.util.Random;

public class P104 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = r.nextInt(99)+1;
//			int data = r.nextInt(99)+1;    1부터 99까지 난수를 저장(입력)
//			arr[i] = data;  두 줄을 한 줄로 줄이면 위
		}
		
		System.out.println(Arrays.toString(arr));  //배열 정보 출력
		
		
		// 배열의 합과 평균을 구하시오
		int sum = 0;
		
		for (int a:arr) {
			sum += a;
			
		}
		double avg = 0.0;
		avg = sum/(arr.length*1.0);
		System.out.printf("%d, %.2f", sum,avg);
	}

}
