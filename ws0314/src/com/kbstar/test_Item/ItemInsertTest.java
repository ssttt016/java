package com.kbstar.test_Item;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service = new ItemCRUDServiceImpl();
		
		Item obj = new Item("watch", 120, 1.0);
		try {
			service.register(obj);
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
