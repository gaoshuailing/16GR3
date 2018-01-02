
/**
 * 
 */
package com.qhit.lh.gr3.jin.t8.service.impl;

import java.util.List;

import com.qhit.lh.gr3.jin.t8.bean.Emp;
import com.qhit.lh.gr3.jin.t8.dao.BaseDao;
import com.qhit.lh.gr3.jin.t8.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.jin.t8.service.BaseService;

/**
 * @author 高帅领
 * 2017年12月11日
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		return baseDao.getAll(fromObject);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		return baseDao.getObjectById(clazz, id);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.wj.t4.servcie.BaseService#getEmpByName(java.lang.String)
	 */
	@Override
	public List<Emp> getEmpByName(String name) {
		return baseDao.getEmpByName(name);
	}

}