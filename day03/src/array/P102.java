package array;

public class P102 {

	public static void main(String[] args) {
		int a = 100;
		
		int arr[] = new int[3];  // new라고 쓰는건 참조자료형(Reference)임
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
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
