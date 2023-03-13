package ifcontrol;

public class P88 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 91;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("Male....");
		}else {
			System.out.println("Female....");
		}
		
		if((sum <= 100 && sum >= 95) || (sum <= 90 && sum >= 85)) {
			grade = "VIP";
		}else if ((sum <= 80 && sum >= 75) || (sum <= 60 && sum >= 65)) {
			grade = "GOLD";
		}
		
//		if(sum >= 95) {
//			grade = "VIP";
//		}else if (sum >= 91) {
//			grade = "";
//		}else if (sum >= 85) {
//			grade = "VIP";
//		}else if (sum >= 81) {
//			grade = "";
//		}else if (sum >= 75) {
//			grade = "GOLD";
//		}else if (sum >= 66) {
//			grade = "";
//		}else if (sum >= 65) {
//			grade = "GOLD";
//		}else {
//			grade = "NORMAL";
//		}
		
		if(grade.equals("VIP")) {
			System.out.println("VIP 혜택....");
			//return;  //행위를 더 이상 진행하지 말고 끝내라
		}
		
			System.out.printf("%s, %s, %.1f \n", grade, gender, sum);
			
			
		System.out.println("End....");

	}

}
