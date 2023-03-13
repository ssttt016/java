package ifcontrol;

public class P86 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 90.0;
		
		System.out.println("Start....");
		
		gender = (gender.equals("M")) ? "Male...." : "Female....";
//		if(gender.equals("M")) {
//			System.out.println("Male....");
//		}else {
//			System.out.println("Female....");
//		}
		
		
		grade = (sum >= 90.0) ? "VIP" : (sum >= 70.0) ? "GOLD" : "SILVER";
//		if(sum >= 90.0) {
//			grade = "VIP";
//		}else if(sum >= 70.0) {
//			grade = "GOLD";
//		}else {
//			grade = "SILVER";
//		}
		
		if(grade.equals("VIP")) {
			System.out.println("VIP 혜택....");
			//return;  //행위를 더 이상 진행하지 말고 끝내라
		}
		
			System.out.printf("%s, %s, %.1f \n", grade, gender, sum);
			
			
		System.out.println("End....");

	}

}
