package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
	// CRUD(Create, Read, Update, Delete)
	public void insert(V v) throws Exception;
	public void update(V v) throws Exception;
	public void delete(K k) throws Exception;
	public V select(K k) throws Exception;  // Key 값을 부르면 V 타입으로 반환하라는 의미
	public List<V> select() throws Exception; // 전부 List<V>로 담아서 반환해라
}
