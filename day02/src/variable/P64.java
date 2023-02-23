package variable;

public class P64 {

	public static void main(String[] args) {
		int a = 10;
		double d = 10.2345;
		String str1 = "abc";
		String str2 = "abc";
		str1 = "def";
		System.out.printf("%d\t%2.2f\t%s \n",a,d,str1); // 앞은 출력되는 형식, 출력되어지는 순서대로 넣어라   d는 정수 f는 실수 s는 문자
		if(str1 == str2) {
			System.out.println("OK");
		}
		if(str1.equals(str2)) {
			System.out.println("OK2");
		}
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		
	}

}
