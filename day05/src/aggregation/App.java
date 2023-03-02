package aggregation;

public class App {

	public static void main(String[] args) {
		Human human = new Human("James");
		System.out.println(human);
		
		Car car = new Car("k1","red",1000);
		human.setCar(car); //휴먼에 car에 대한 정보를 삽입  (set+생성자)
		// 차가 2대면 어떻게 구현하지?
		System.out.println(human);
		
		human.drive();
		human.stopCar();
		
	}

}
