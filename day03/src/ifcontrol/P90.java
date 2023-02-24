package ifcontrol;

public class P90 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 15;
		
		// 세 수의 최대 값과 최소 값을 구하시오
		int max = 0;
		int min = 0;
		
//		if(a > b && a > c) {max = a;
//				if(b > c) {min = c;}
//				else {min = b;}
//			}
//		else if (b > a && b > c) {max = b;
//					if(a > c) {min = c;}
//					else {min = a;	}
//					}
//		else if (c > a && c > b) {max = c;
//					if(a > b) {min = b;}
//					else {min = a;}
//				}
//			}
	
	max = (a > b && a > c) ? a : (b > a && b > c) ? b : c;
	min = (a < b && a < c) ? a : (b < a && b < c) ? b : c;
	
//	max = (a > b)? ((a > c) ? a : c) : (b > c) ? b : c;  //강사님의 삼항연산자
//	max = (a < b)? ((a < c) ? a : c) : (b < c) ? b : c;

//	if(a > b) {    //강사님의 if문
//		max = a;
//		min = b;
//		if(a < c) {
//			max = c;
//		}else {
//			if(b > c) {
//				min = c;
//			}
//		}
//	}else {
//		max = b;
//		min = a;
//		if(b < c) {
//			max = c;
//		}else {
//			if(a > c) {
//				min = c;
//			}
//		}
//		}

//	if(a > b) {
//		max = Math.max(a, c);
//		min = Math.min(b, c);
//	}else {
//		max = Math.max(b, c);
//		min = Math.min(a, c);
//	}
	
	System.out.printf("MAX: %d, MIN: %d",max,min);}

}
