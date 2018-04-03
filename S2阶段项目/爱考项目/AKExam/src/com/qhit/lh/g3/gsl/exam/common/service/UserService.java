/**
 * 
 */
package com.qhit.lh.g3.gsl.exam.common.service;

import com.qhit.lh.g3.gsl.exam.common.bean.User;

/**
 * @author admin
 */
public interface UserService {

	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
