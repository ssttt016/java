package bank;

public class MakeMessage {
	public static String makeMassage(String code) {
		String result = "";
		switch (code) {
		case "ER0001":
			result = "계좌개설 실패";
			break;
		case "EX0002":
			result = "1이상의 숫자를 기입하세요";
			break;
		case "EX0003":
			result = "잔액이 부족합니다.";
			break;
		default:
			result = "고객센터에 문의 하세요.";
		}
		return result;
	}
}
