package ifcontrol;

public class P84 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "FM";
		double sum = 90.0;
		
		System.out.println("Start....");
		
		if(gender.equals("M")) {
			System.out.println("Male....");
		}else {
			System.out.println("Female....");
		}
		
		if (gender.equals("M")) {
			if(sum >= 90) {
				grade = "MVIP";
			}else if (sum >= 80) {
				grade = "MGOLD";
			}else {
				grade = "MNORMAL";
			}
		}else {
			if(sum >= 90) {
				grade = "FVIP";
			}else if (sum >= 80) {
				grade = "FGOLD";
			}else {
				grade = "FNORMAL";
			}
		}
		// 위의 구조가 더 깔끔함
//		if(gender.equals("M") && sum >= 90) {
//			grade = "MVIP";
//		}else if (gender.equals("FM") && sum >= 90) {
//			grade = "FVIP";
//		}else if (gender.equals("M") && sum >= 80) {
//			grade = "MGOLD";
//		}else if (gender.equals("FM") && sum >= 80) {
//			grade = "MGOLD";
//		}else if (gender.equals("M") && sum < 80) {
//			grade = "MNORMAL";
//		}else if (gender.equals("FM") && sum < 80) {
//			grade = "FNORMAL";
//		}
		
		
		switch(grade) {
		case "FVIP" :
//			sum += 100;
//			break;      //지우면 아래의 MVIP와 공통으로 사용됨
		case "MVIP" :
			sum += 100;
			break;
		case "FGOLD" :
//			sum += 90;
//			break;
		
		case "MGOLD" :
			sum += 90;
			break;
		default :
			sum += 10;  //마지막은 굳이 break 안 써도 됨 , 실수는 못 들어간다
		}  
		
		
			System.out.printf("%s, %s, %.1f \n", grade, gender, sum);
			
			
		System.out.println("End....");

	}

}
