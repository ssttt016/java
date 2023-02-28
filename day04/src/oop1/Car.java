package oop1;

public class Car {
	//속성
	public String name;
	public String color;
	public int size;
	
	// 생성자. (constructor)
	public Car() {
		name = "k1";    //각 항목의 앞에 this. 가 생략되어있는 의미이다.
		color = "red";  //각 항목의 앞에 this. 가 생략되어있는 의미이다.
		size = 1000;    //각 항목의 앞에 this. 가 생략되어있는 의미이다.
	}
	public Car(String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
	}
	
	//오퍼레이션
	public void go() {
		System.out.printf("%s, %s Go Car ...",this.name,this.color);
	}
	public void stop() {
		System.out.printf("%s, %s Stop Car ...",this.name,this.color);
	}
}
