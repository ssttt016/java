package ws0309;


public class App {

	public static void main(String[] args) throws Exception {
		Lotto lotto = new Lotto();
		System.out.println("로또 3/25 시작 !");
		lotto.makeNum();
		lotto.makeWinningNumberMoney();
		lotto.prizeMoney();
		lotto.checkRanking();
	}

}
