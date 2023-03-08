package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{

	HashMap<Integer, ItemDTO> db2 = null;
	
	public ItemDAO() {
		db2 = new HashMap<>();
	}
	@Override
	public void insert(ItemDTO v) throws Exception {
		if(db2.containsKey(v.getItemNo())) {
			throw new Exception();
		}
		db2.put(v.getItemNo(), v);
		
	}

	@Override
	public void update(ItemDTO v) throws Exception {
		if(!db2.containsKey(v.getItemNo())) {
			throw new Exception();
		}
		db2.put(v.getItemNo(), v);
		
	}

	@Override
	public void delete(Integer k) throws Exception {
		if(!db2.containsKey(k)) {
			throw new Exception();
		}
		db2.remove(k);
		
	}

	@Override
	public ItemDTO select(Integer k) throws Exception {
		if(!db2.containsKey(k)) {
			throw new Exception();
		}
		return db2.get(k);
	}

	@Override
	public List<ItemDTO> select() throws Exception {
		ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();
		
		Collection<ItemDTO> col = db2.values();
		for (ItemDTO u : col) {
			list.add(u);
		}
		return list;
	}

}
