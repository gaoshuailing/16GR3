/**
 * 
 */
package com.qhit.lh.gr3.jin.t1.service.impl;

import java.util.List;

import com.qhit.lh.gr3.jin.t1.bean.User;
import com.qhit.lh.gr3.jin.t1.dao.UserDao;
import com.qhit.lh.gr3.jin.t1.dao.impl.UserDaoImpl;
import com.qhit.lh.gr3.jin.t1.service.UserService;

/**
 * @author 高帅领
 * TODO
 * 2017-12-12下午15:24:12
 */
public class UserServiceImpl implements UserService {
	private UserDao ud = new UserDaoImpl();

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#add(java.lang.Object)
	 */
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		ud.add(obj);
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		ud.delete(obj);
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#update(java.lang.Object)
	 */
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		ud.update(obj);
		
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.hm.service.UserService#getall(java.lang.String)
	 */
	@Override
	public List<User> getAll(String fromObject) {
		// TODO Auto-generated method stub
		List list = ud.getAll(fromObject);
		return list;
	}

}
