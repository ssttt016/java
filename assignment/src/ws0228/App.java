package ws0228;

public class App {

	public static void main(String[] args) {		
		// Manager App
		Manager manarr[] = new Manager[5];
		Manager manager1 = new Manager("001","Alex",2500000,100000);
		Manager manager2 = new Manager("002","Bob",3000000,200000);
		Manager manager3 = new Manager("003","Cyndra",3500000,300000);
		Manager manager4 = new Manager("004","Dale",4000000,400000);
		Manager manager5 = new Manager("005","Emily",4500000,500000);
		
		manarr[0] = manager1;
		manarr[1] = manager2;
		manarr[2] = manager3;
		manarr[3] = manager4;
		manarr[4] = manager5;
		
		int sum = 0;
		for(Manager m:manarr) {
			System.out.println(m.toString());
			System.out.printf("AnnSalary = %d, Tax = %f\n",m.getAnnSalary(),m.getTax());
			sum += m.getAnnSalary();
		}System.out.printf("manager AnnSalary sum =%d",sum);
		
	}

}
