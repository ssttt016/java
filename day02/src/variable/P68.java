package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s1 = "10";
		int s2 = Integer.parseInt(s1); // String 을 int 로 변경
		int a = 10;
		System.out.println(s2 + a);

		int n1 = 10;
		String n2 = String.valueOf(n1); // String으로 변환하는 방법
//		String n2 = n1+"";  //String으로 변환하는 방법

		Random r = new Random();
		int randomNumber = r.nextInt(10)+1;  //0부터 9까지 괄호 안 숫자 미만   뒤에 +1을 붙이면 나온값에 +1
        System.out.println(randomNumber);
		
	}

}
