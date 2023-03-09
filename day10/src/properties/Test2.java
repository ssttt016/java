package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		try(FileInputStream in = new FileInputStream(fileName)) {
			props.load(in);
		} catch (IOException e) {
			System.out.println("문제 발생");
			return; // return 이 없을 경우 함수가 끝나지 않아서 서버 과부하됨.   return이 없으면 null로 나옴 서버가 돌아가고 있다는 뜻
		}

		String ip = props.getProperty("IP_ADDR");
		int port = Integer.parseInt(props.getProperty("PORT"));
		System.out.printf("%s 서버로 %d 포트로 접속",ip,port);

	}

}
