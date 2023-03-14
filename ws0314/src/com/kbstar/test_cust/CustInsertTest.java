package com.kbstar.test_cust;

import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
		
		Cust cust = new Cust("id26", "pwd20", "tom", 30);
		try {
			crudService.register(cust);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		try {
//			crudService.remove("id04");
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		Cust cust1 = new Cust("id77", "pwdpwd", "동동동", 01);
//		
//		try {
//			crudService.modify(cust1);
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			
//		}
//		
//		try {
//			crudService.get("id01");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		
//		try {
////			crudService.get();
//			List<Cust> list = null;
//			list = crudService.get();
//			for(Cust c:list) {
//				System.out.println(c);
//			}
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

}
