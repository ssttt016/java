package variable;

import java.util.Random;
import java.util.Scanner;

public class P75 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
//		a++;
//		++b;
		System.out.printf("%d,%d\n",a,b);
		
		int result = ++a + b++;  // ++a 는 11이됨 , b++는 이 라인이 끝나고 11이 된다.
		System.out.printf("%d,%d\n",a,b);
		System.out.println(result);
		
		System.out.println(5 == 5);
		
		int aa = 10;
		int bb = 10;
		
		System.out.println( (aa++ >= 0) || (bb++ >= 0) ); 
		// | 가 1개와 2개의 차이는 1개일 경우는 앞 연산만 이루어지고 뒷 연산은 보지 않는다.
		
		System.out.printf("%d,%d\n",aa,bb);
			}

}
