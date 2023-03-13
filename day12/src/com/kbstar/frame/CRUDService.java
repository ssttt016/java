package com.kbstar.frame;

import java.util.List;

public interface CRUDService<K,V> {
	//화면을 중점으로 설계
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
	
}
