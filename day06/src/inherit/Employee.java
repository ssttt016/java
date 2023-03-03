package inherit;

public class Employee {
	private String id;
	private String name;
	private double salary;
	
	// 객체 생성자
	public Employee() {
	}
	
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//객체 메소드 (오퍼레이션)
	public double getAnnSalary() {
		double result = 0.0;
		result = this.salary * 12;
		return result;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}

	public double getSalary() {
		return salary;
	}
	
	
	
}
