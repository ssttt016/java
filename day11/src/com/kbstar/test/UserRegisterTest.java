package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserRegisterTest {

	public static void main(String[] args) {
		CRUDService<String, UserDTO> service = new UserService();
		UserDTO obj1 = new UserDTO("id01", "pwd01", "james", "james@gmail.com", "010-1234-5678");
		UserDTO obj2 = new UserDTO("id02", "pwd02", "james2", "james2@gmail.com", "010-2234-5678");
		UserDTO obj3 = new UserDTO("id03", "pwd03", "james3", "james3@gmail.com", "010-3234-5678");
				
		// register test =========
				try {
					service.register(obj1);
					service.register(obj2);
					service.register(obj3);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				// get(k) test =====
				UserDTO user = null;
				try {
					user = service.get("id01");
					System.out.println(user);
				} catch (Exception e) {
				}
				
				// get() test =================
				List<UserDTO> list = null;
				try {
					list = service.get();
//					System.out.println(list); //얘는 줄 나누기가 안됨
					for(UserDTO u:list) {
						System.out.println(u);
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
				// remove() test ====================
				try {
					service.remove("id04");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
	}

}
