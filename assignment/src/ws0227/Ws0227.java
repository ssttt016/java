package ws0227;

import java.util.Random;
import java.util.Scanner;

public class Ws0227 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command[q,a1,a2,a3,a4]");
			String cmd = sc.next();
			
			if(cmd.equals("q")) {
				System.out.println("Quit");
				break;
			} else if(cmd.equals("a1")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력 한다.
				
				int sumA1 = 0;
				double avgA1 = 0.0;
				
				
				System.out.println("Input Number[5~9]");
				// 입력받은 숫자를 int로 변환하여 그 갯수만큼 배열 생성
				int arrA1[] = new int[Integer.parseInt(sc.next())];
							
				
				//랜덤한 숫자 생성하여 배열에 넣는다
				Random r = new Random();
				for(int i : arrA1) {
					arrA1[i] = r.nextInt(9)+1;
					sumA1 += arrA1[i];
					//배열 정보 출력
					System.out.printf("%d \t",arrA1[i]);
				}
				//평균 계산
				avgA1 = sumA1/ (arrA1.length * 1.0);
				
				//합과 평균 출력
				System.out.printf("\n합: %d, 평균: %4.2f\n", sumA1, avgA1);
						
				
			} else if(cmd.equals("a2")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수 번째 숫자들의 합과 평균을 출력 한다.
				
			} else if(cmd.equals("a3")) {
				// 5~9까지의 숫자를 입력 받는다.
				// 입력 받은 숫자만큼 배열을 생성하고
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 짝수 값만의 합과 평균을 출력 한다.
				
			} else if(cmd.equals("a4")) {
				// 5~9까지의 숫자를 2개 입력 받는다.
				// 2차원 배열을 만든다.
				// 1~9까지의 랜덤한 숫자를 배열에 넣는다.
				// 배열 정보를 출력한다.
				// 배열의 합과 평균을 출력 한다.
				System.out.println("Bye!");
				sc.close();
				System.out.println("5~9까지의 숫자를 두 번 입력하세요");
				Scanner sca41 = new Scanner(System.in);
				Scanner sca42 = new Scanner(System.in);
				String cmda41 = sca41.next();
				String cmda42 = sca42.next();
				
				int a41 = Integer.parseInt(cmda41);
				int a42 = Integer.parseInt(cmda42);
				int arr[][] = new int [a41][a42];
				
				
				Random ra4 = new Random();
				int suma4 = 0;
				double avga4 = 0.0;
				
				for(int i = 0; i < arr.length; i++) { 
					for(int j = 0;j < arr[i].length; j++) {
						arr[i][j] = ra4.nextInt(9)+1;
						System.out.printf("%d\t", arr[i][j]);
						suma4 += arr[i][j];
						avga4 = suma4/((i*j)*1.0);
					}
					System.out.println("");
				}
				System.out.printf("합계:%d\t 평균:%.2f\n", suma4, avga4);
				

			} else {
				System.out.println("Invalid Command");
				System.out.println("Try Again");
			}
		} // end while


	}

}
