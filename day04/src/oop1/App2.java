package oop1;

public class App2 {

	public static void main(String[] args) {
		Car car1 = new Car("k2","blue", 2000);  // 오른쪽에 입력한 k2, blue, 2000 이 Car 클래스의 갈색 name color size 로 치환된다.
		// 왼쪽부터 : Car 객체에 의해서 car1을 선언합니다. new라는 변수에 의해서 Car() constructor 를 실행합니다.
		car1.go();
		car1.stop();
		System.out.println("----------------------------------");
		Car car2 = new Car("k3","white",3000);
		car2.go();
		car2.stop();
	}

}
