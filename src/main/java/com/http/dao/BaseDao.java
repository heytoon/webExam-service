package com.http.dao;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
	
	void insert(T t);
	void insert(Map<String, Object> map);
	 
	int delete(Object id); 
	int deleteBatch(Object[] ids); 
	int delete(Map<String, Object> map);
	  
	int update(T t);
	int update(Map<String, Object> map);
	
	T queryById(Object id);
	
	int queryCount(Map<String, Object> param);
	 
    List<T> queryList(Map<String, Object> param);  
}
