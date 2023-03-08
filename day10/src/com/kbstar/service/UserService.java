package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {

	DAO<String,UserDTO> dao;
	
	public UserService() {
		dao = new UserDAO();
	}
	
	@Override
	public void register(UserDTO v) throws Exception { // 서비스에서 진행되는것이기 때문에 DB에 insert 가 아닌 register 등록
		System.out.println("Security Check");   // 여기서 try catch 를 하면 App 즉, 고객이 보는 화면에서 보이지 않고 내부에서 처리되고 끝남.
		dao.insert(v); // DB에 반영
		System.out.println("Send mail");
		System.out.println("Send SMS");
	}

	@Override
	public void remove(String k) throws Exception {
		try {  
		dao.delete(k); //DB에 반영
		}catch (Exception e) {
			throw e;  // try catch를 해서 다시 던지겠다. - > 던지면 App 으로 간다는데 잘 모르겠음
		} // 위 처럼 해서 깔끔한 것보다 이것처럼 throw를 하면 log를 볼 수 있음
		System.out.println("Send SMS");
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		dao.update(v); // DB에 반영
		System.out.println("Send SMS");
	}

}
