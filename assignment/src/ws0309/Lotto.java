package ws0309;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
//	private int winningNum;
//	private double prizeMoney;

	HashSet<Integer> num = new HashSet<Integer>();
	ArrayList<Integer> myNum = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	Random r = new Random();

	public Lotto() {
		num = new HashSet<Integer>();
	}

	public ArrayList<Integer> makeNum() throws Exception {
		System.out.println("1~25까지 숫자 3개를 입력하세요");
		for (int i = 0; i<3; i++) {
			int r1 = Integer.parseInt(sc.next());
			myNum.add(r1);
			if(r1 > 25 || r1 < 1) {
				throw new Exception("1~25까지의 숫자를 입력하세요");
			}
		}
		System.out.printf("내가 고른 숫자는 : ");
		System.out.println(myNum);
		return myNum;
	}

	public void makeWinningNumberMoney() {
		while (num.size() < 3) {
			num.add(r.nextInt(24) + 1);
		}
		System.out.printf("행운의 숫자는 : ");
		System.out.println(num);
	}

	public double prizeMoney() {
		double money = r.nextInt(1999999999) + 1;

		double grade1 = money * 0.7;
		double grade2 = money * 0.2;
		double grade3 = money * 0.1;
		System.out.printf("총 당첨금 : %.0f\n1등 당첨금 : %.0f\n2등 당첨금 : %.0f\n3등 당첨금 : %.0f\n", money, grade1, grade2, grade3);
		return money;
	}

	int cnt = 0;

	public void checkRanking() {
		for (int my : myNum) {
			for (int goal : num) {
				if (my == goal) {
					cnt++;
				}
			}
		}
			switch (cnt) {
			case 1:
				System.out.println("3등입니다.");
				break;
			case 2:
				System.out.println("2등입니다.");
				break;
			case 3:
				System.out.println("1등입니다.");
				break;
			default:
				System.out.println("꽝!");
			}
			return;
	}

}
