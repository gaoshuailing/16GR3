/**
 * 
 */
package com.qhit.lh.g3.gsl.exam.common.service;

import com.qhit.lh.g3.gsl.exam.common.bean.User;
import com.qhit.lh.g3.gsl.exam.common.dao.UserDao;
import com.qhit.lh.g3.gsl.exam.common.dao.UserDaoImpl;

/**
 * @author admin
 * 2017年12月27日
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
