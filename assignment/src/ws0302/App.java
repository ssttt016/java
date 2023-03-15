package ws0302;

public class App {

	public static void main(String[] args) {
		
	Account accarr[] = new Account[6];
	
	Account account1 = new Account("james1",10000,0.35,"VIP");
	Account account2 = new Account("james2",10000,0.45,"GOLD");
	Account account3 = new Account("james3",10000,0.55,"SILVER");
	Account account4 = new Account("james4",10000,0.15,"GOLD");
	Account account5 = new Account("james5",10000,0.28,"SILVER");
	Account account6 = new Account("james6",10000,0.31,"VIP");
	
	accarr[0] = account1;
	accarr[1] = account2;
	accarr[2] = account3;
	accarr[3] = account4;
	accarr[4] = account5;
	accarr[5] = account6;

	// 2. 6개의 계좌정보를 출력하시오.
	// 3. 모든 계좌의 잔액과 이자금액을 출력하시오.
	for (Account a :accarr) {
		System.out.println(a);
		System.out.printf("현재 잔액은:%.2f, 현재 이자금액은:%.2f\n",a.getBalance(),a.getInterest());
	}
	System.out.println("-----------------------------");
	
	// 4. VIP들의 잔액의 합과 평균을 출력하시오.
	double sum = 0.0;
	double avg = 0.0;
	int cnt = 0;
	for(Account b : accarr) {
		if(b.getGrade().equals("VIP")) {
			sum += b.getBalance();
			cnt++;
		}avg = sum / (cnt*1.0);
	}
	System.out.printf("VIP들의 잔액의 합은:%.2f 평균은:%.2f", sum,avg);
}
}
