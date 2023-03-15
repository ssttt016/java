package com.kbstar.test_cart;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeItemNumber;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> service = new CartCRUDServiceImpl();
		
		Cart cart = new Cart(MakeItemNumber.makeCartNum(), "id0231", "0010", 50);
		
		try {
			service.register(cart);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
