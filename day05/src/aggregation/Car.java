package aggregation;

public class Car {
	//속성
	public String name;
	public String color;
	public int size;
	
	// 생성자. (constructor)
	public Car() {
		name = "k1";    
		color = "red";  
		size = 1000;    
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
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + "]";
	}
	
	
}
