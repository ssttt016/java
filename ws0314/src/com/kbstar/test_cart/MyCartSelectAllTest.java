package com.kbstar.test_cart;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.ShopService;
import com.kbstar.service.ShopServiceImpl;

public class MyCartSelectAllTest {

	public static void main(String[] args) {
		ShopService<Cust, Cart> service = new ShopServiceImpl();
		List<Cart> list = null;
		try {
			list = service.myCart("낑낑깡깡");
			for (Cart a:list) {
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
