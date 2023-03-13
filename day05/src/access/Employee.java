package access;

import java.util.Calendar;

public class Employee {
	private String id;
	protected String name;
	int salary;
	
	public Employee() {
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// getter and setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public int getSalary() {
		return salary;
	}
	// getter and setter 끝
	
	public double getTax() {
		double result = 0.0;
		result = this.salary * 0.17;
		return result;
	}
	

	private int getAnnSalary() {  
		//private 는 동일 클래스에서만 사용가능하기 때문에 다른 함수의 계산을 위한(이 안에서만 사용) 함수로 보면 됨
		int result = 0;
		result = this.salary * 12;
		return result;
	}
	
	protected double getAnnTax() {
		double result = 0.0;
        result = this.getAnnSalary() * 0.17;
		return result;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
