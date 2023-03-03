package inherit2;

public class Sales extends Employee {
	private String loc;
	private double rate;

	// 생성자 Constructor
	public Sales() {
	}
	
	public Sales(String id, String name, double salary) {
		super(id, name, salary);
	}

	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}

	
	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive() * 12);
	    return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + loc + " " + rate;
	}
	
	@Override
	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}
	
}
