package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dao.ItemDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.dto.Item;
import com.kbstar.frame.DAO;
import com.kbstar.frame.ShopService;

public class ShopServiceImpl implements ShopService<Cust, Cart>{

	DAO<String, String, Cust> custDao;
	DAO<String, String, Item> itemDao;
	DAO<String, String, Cart> cartDao;
	
	public ShopServiceImpl() {
		custDao = new CustDaoImpl();
		itemDao = new ItemDaoImpl();
		cartDao = new CartDaoImpl();
	}
	
	@Override
	public Cust login(String id, String pwd) throws Exception{
		Cust cust = null;
		cust = custDao.select(id);
		if(cust != null) {
			if(cust.getPwd().equals(pwd)) {
				System.out.println("OK");
			}else {
				throw new Exception("ID 혹은 비밀번호가 틀립니다.");
			}
		}else {
			throw new Exception("로그인 실패(없는 ID)");
		}
		return cust;
	}

	@Override
	public void register(Cust v) throws Exception{
		try {
			custDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록 오류");
		}
//		notification.sendEmail(v.getEmail(), " 축하합니다.");
//		notification.sendSMS(v.getContact(), "축하드립니다.");
	}

	@Override
	public List<Cart> myCart(String id) throws Exception{
		List<Cart> list = null;
		list = cartDao.search(id);
		return list;
	}

}
