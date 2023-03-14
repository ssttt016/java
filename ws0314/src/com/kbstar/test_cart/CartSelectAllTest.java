package com.kbstar.test_cart;

import java.util.List;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectAllTest {

	public static void main(String[] args) {
		CRUDService<String,Cart> service = new CartCRUDServiceImpl();
		List<Cart> list = null;
		try {
			list = service.get();
			for (Cart a:list) {
				System.out.println(a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
