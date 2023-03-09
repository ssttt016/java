package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.TransactionDAO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class TransactionService implements CRUDService<String,TransactionDTO> {

	DAO<String,TransactionDTO> tranDao;
	
	public TransactionService() {
		tranDao = new TransactionDAO();
	}
	
	@Override
	public void register(TransactionDTO v) throws Exception {
		try {
		tranDao.insert(v);
		} catch (Exception e) {
			System.out.println("오류1");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		
	}

	@Override
	public void modify(TransactionDTO v) throws Exception {
		
	}

	@Override
	public TransactionDTO get(String k) throws Exception {
		TransactionDTO obj = null;
		try {
		obj = tranDao.select(k);
		} catch (Exception e) {
			System.out.println("오류2");
		}
		return obj;
	}

	@Override
	public List<TransactionDTO> get() throws Exception {
		List<TransactionDTO> list = new ArrayList<TransactionDTO>();
		list = tranDao.select();
		return list;
	}

}
