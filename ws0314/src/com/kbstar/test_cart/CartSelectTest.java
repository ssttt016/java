package com.kbstar.test_cart;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> service = new CartCRUDServiceImpl();
		
		Cart cart = null;
		
		
		try {
			cart = service.get("2023314294100");
			System.out.println(cart);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
