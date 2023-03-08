package bank;

public class Atm {

	public static void main(String[] args) {
		Account acc1 = null;
		try {
			acc1 = new Account(-1);
			System.out.println(acc1);
			acc1.widthrow(-1);
		} catch (Exception e) {
			System.out.println(MakeMessage.makeMassage(e.getMessage()));
		}

	}

}
