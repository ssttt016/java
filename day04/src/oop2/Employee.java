package oop2;

import java.util.Calendar;
import java.util.Random;

public class Employee {
	private String id;
	private String name;
	private int salary;

	public Employee() {
		this.id = "temp0001";
		this.name = "temp";
		this.salary = 10000000;
	}

	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
	    if(salary <0) {
	    	this.salary = 0;
	    }else {
	    	this.salary = salary;
	    }
	}

	public Employee(String name, int salary) {
		this("10000",name,salary);
	}
//		Random r = new Random();
//		this.id = String.valueOf(r.nextInt(100)+1);
////		this.id = Calendar.DAY_OF_YEAR + "" + Calendar.MILLISECOND;
////			Date d = new Date();
////			Calendar.DAY_OF_YEAR + "" + Calendar.MILLISECOND;    // 숫자 + 문자 + 숫자 = 문자가 되버림
//		this.name = name;
//		this.salary = salary;

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
	
	public int getAnnSalary() {
		return this.salary * 12;
	}

	public double getTax() {
		return this.salary * 0.175;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
