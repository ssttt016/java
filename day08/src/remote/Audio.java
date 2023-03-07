package remote;

public class Audio implements Remote {

	@Override
	public void turnOn() {
		System.out.println("Tunr On Audio");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tunr Off Audio");
		
	}

}
