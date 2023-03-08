package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

import bank.MakeMessage;

public class App {

	public static void main(String[] args) {
		
	
		// 인터페이스도 객체 생성 못 함
		Service<String,UserDTO> service = new UserService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			}else if (cmd.equals("i")) {
				System.out.println("Input ID");
				String id = sc.next();
				System.out.println("Input PWD");
				String pwd = sc.next();
				System.out.println("Input NAME");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					service.register(user);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMassage(e.getMessage()));
				}
			}else if (cmd.equals("d")) {
				System.out.println("Input ID");
				String id = sc.next();
				try {
					service.remove(id);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMassage(e.getMessage()));
				}
			}else if (cmd.equals("u")) {
				System.out.println("Input ID");
				String id = sc.next();
				System.out.println("Input PWD");
				String pwd = sc.next();
				System.out.println("Input NAME");
				String name = sc.next();
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					service.modify(user);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMassage(e.getMessage()));
				}
			}
		}
		sc.close();
	}

}

//		Service<String,UserDTO> service = new UserService();
//		UserDTO user = new UserDTO("id01", "pwd01", "james");
//		service.register(user);
