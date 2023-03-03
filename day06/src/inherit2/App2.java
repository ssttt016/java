package inherit2;

public class App2 {

	public static void main(String[] args) {
		// Manager is a Employee
		Employee e = new Manager("100","james", 500, 50);
		// Manager m = new Employee("100", "james", 550);  는 틀린것
		
//		System.out.println(e);
//		System.out.println(e.getAnnSalary());
		
		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "james", 500);
		ea[1] = new Employee("101", "james", 500);
		// 이건 가능
		ea[2] = new Manager("102","james", 500, 50);
		ea[3] = new Manager("103","james", 500, 50);
		ea[4] = new Sales("104", "james", 500, "Seoul", 0.35);
		
		for(Employee em :ea) {
			System.out.println(em); // 이것이 다형성 : 클래스에 따른 toString 이 불러와짐
			System.out.println(em.getAnnSalary());
//			if(em instanceof Sales) {  // em에서 Sales 타입이면
//				Sales s = (Sales)em;  // Employee 가 아닌 Sales 타입으로 바꾸겠다.
				System.out.println(em.getIncentive());
				
//			}
		}
		System.out.println("-----------------------------");
		TaxCal t = new TaxCal();
		double result = t.getTax(ea[4]);
		System.out.println(result);
	}

}
