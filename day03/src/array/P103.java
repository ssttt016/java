package array;

public class P103 {

	public static void main(String[] args) {
		int a = 100;
		
//		int arr[] = new int[3];  괄호의 위치는 상관없음
//		int []arr = new int[3];
//		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
		int arr[] = {10, 20, 30};  //해당 줄의 방식은 쓸 일은 없음 공부하기 위한 양식 이런게 있다 정도
		System.out.println(arr);
		
		for(int i = 0; i < arr.length; i++ ) {
			System.out.printf("%d \t", arr[i]);	
		}
		System.out.println("\nType 2 ");
		for (int data:arr) {
			System.out.printf("%d \t", data);
			
		}
	}

}
