package com.qhit.lh.gr3.jin.t4.dao;

import java.util.List;

public interface BaseDao {
	
	public void add(Object obj);
	
	public void delete(Object obj);
	
	public void update(Object obj);
	
	public List<Object> getAll(String fromObject);
	
	public Object getObjectById(Class clazz, int id);
}
