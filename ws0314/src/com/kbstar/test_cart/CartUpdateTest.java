package com.kbstar.test_cart;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartUpdateTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> service = new CartCRUDServiceImpl();
		
		Cart cart = new Cart("202331453210011", 4000);
		
		try {
			service.modify(cart);
			System.out.println("성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
