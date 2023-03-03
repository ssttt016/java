package inherit2;

public class Manager extends Employee {
	private double bonus;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	
	// 함수의 재정의(overriding)
	@Override    // 오버라이드가 되었다는 정보성 의미   (언오페이션?)
	public double getAnnSalary() {
		double result = 0.0;
//		result = (this.getSalary() + this.bonus) * 12;
		result = super.getAnnSalary() + (this.bonus * 12);  // 이렇게도 가능
		return result;
	}

	@Override
	public String toString() {
		return super.toString() + " " + bonus;
	} 
	// ", toString()=" + super.toString()
	
	
	
}
