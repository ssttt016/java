package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class AccountService implements CRUDService<String, AccountDTO> {

	DAO<String, AccountDTO> accDao;
	Notification notification;
	
	public AccountService() {
		accDao = new AccountDAO();
		notification = new NotificationImpl();
	}
	
	@Override
	public void register(AccountDTO v) throws Exception {
		try {
		accDao.insert(v);
		} catch (Exception e) {
			System.out.println("중복오류");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
		accDao.delete(k);
		} catch (Exception e) {
			System.out.println("없는 정보입니다.");
		}
	}

	@Override
	public void modify(AccountDTO v) throws Exception {
		accDao.update(v);
	}

	@Override
	public AccountDTO get(String k) throws Exception {
		AccountDTO obj = null;
		try {
		obj = accDao.select(k);
		} catch (Exception e) {
			System.out.println("없는 정보입니다.");
		}
		return obj;
	}

	@Override
	public List<AccountDTO> get() throws Exception {
		List<AccountDTO> list = new ArrayList<AccountDTO>();
		list = accDao.select();
		return list;
	}

}
