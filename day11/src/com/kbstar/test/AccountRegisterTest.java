package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;

public class AccountRegisterTest {

	public static void main(String[] args) {
		
		CRUDService<String, AccountDTO> service = new AccountService();
		AccountDTO obj1 = new AccountDTO("1234", 10000, "james");
		AccountDTO obj2 = new AccountDTO("12345", 105000, "james");
		
		
		// 등록 테스트
		try {
			service.register(obj1);
			System.out.println(obj1);
			service.register(obj2);
			System.out.println(obj2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		// 조회 테스트
		System.out.println("===============조회 테스트");
		AccountDTO user = null;
		try {
			user = service.get("1234");
			System.out.println(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//  전체 조회 테스트
		System.out.println("======================== 전체 조회 테스트");
		List<AccountDTO> list = null;
		try {
			list = service.get();
			for (AccountDTO a:list) {
				System.out.println(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// remove 테스트
		System.out.println("====================remove 테스트");
		try {
			service.remove("12334");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("====================");
		try {
			list = service.get();
			for (AccountDTO a:list) {
				System.out.println(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
