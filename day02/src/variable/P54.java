package variable;

public class P54 {

	public static void main(String[] args) {
		int d = 10;
//		변수의 선언 방식
		//		int Aa = 10; //가능하지만 하지는 말자
//		int 1a = 10; //숫자로 먼저 시작하면 안 됨
//		int a b = 10; //띄어쓰기가 들어가면 안됨
		
		boolean b1 = 10 > 5;  //boolean 은 true 혹은 false만 올 수 있다.
           
           
           // 정수
           int n1 = 10;   // 자바에서는 정수의 기본형은 int 다.
           long n2 = 0L; // 뒤에 L을 붙여줌 소문자여도 상관없으나 대문자가 더 잘 보임
           n2 = 2222222222222L;
           
           // 실수
           double d1 = 1.0;  // 자바에서의 실수의 기본형은 double 이다.
           float f1 = 1.0F; // 뒤에 F 를 붙여준다 소문자여도 상관없음
           
           double  d2 = 1/2;  // 정수와 정수가 연산이 되면 정수가 나온다. 0.5는 실수여서 나오지 않음
           System.out.println(d2);
           
           double d3 = 10/3.0;  // 하나만 실수여도 되는듯? 
           System.out.println(d3);
           
           
           float f2 = 10.0f/3.0f;    // float는 소숫점 자리수가 double보다 작음 
           System.out.println(f2);

           //char   : 문자 하나면 char로 표현
           char c1 = 'A';
           System.out.println(c1);
           
           char c2 = 65;  // = 'A'
           System.out.println(c2);
           
           
           int n3 = 10;
           double n4 = 10.0;
//           int result = n3 + n4;

	}

}
