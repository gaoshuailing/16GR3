/**
 * 
 */
package com.qhit.lh.gr3.jin.t5.servcie.impl;

import java.util.List;

import com.qhit.lh.gr3.jin.t5.dao.BaseDao;
import com.qhit.lh.gr3.jin.t5.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.jin.t5.servcie.BaseService;
/**
 * @author 高帅领
 *TODO
 * 2017年12月12日下午7:01:10
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.liu.hb.servcie.BaseService#getObjectById(java.lang.Object, int)
	 */
	@Override
	public Object getObjectById(Object obj, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(obj, id);
	}

}
