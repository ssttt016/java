package remote;

public class Human {

	public static void main(String[] args) {
		Remote remote = new Audio();
//		Remote remote = new Tv();
		remote.turnOn();
		remote.turnOff();
	}

}
