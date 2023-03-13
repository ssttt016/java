package com.kbstar.frame;

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
		case "EX0004":
			result = "생성 오류입니다.(UserDAO)";
			break;
		case "EX0005":
			result = "삭제 오류입니다.(UserDAO)";
			break;
		case "EX0006":
			result = "수정 오류입니다.(UserDAO)";
			break;
		case "EX0007":
			result = "오류입니다.(ItemDAO)";
			break;
		default:
			result = "고객센터에 문의 하세요.";
		}
		return result;
	}
}
