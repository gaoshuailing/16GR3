/**
 * 
 */
package com.qhit.lh.gr3.jin.t7;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.jin.t7.bean.Dept;
import com.qhit.lh.gr3.jin.t7.bean.Type;
import com.qhit.lh.gr3.jin.t7.bean.User;
import com.qhit.lh.gr3.jin.t7.servcie.BaseService;
import com.qhit.lh.gr3.jin.t7.servcie.impl.BaseServiceImpl;

/**
 * @author 高帅领
 *TODO
 * 2017年12月14日下午5:18:20
 */
public class test {
	private BaseService baseser = new BaseServiceImpl();
	@Test
	public void add() {
	
			User user = new User();
			
			user.setUname("aaa");
			user.setPwd("123456");
			user.setBirthday("2013-09-07");
			user.setSex("m");
			
	User user1 = new User();
			
			user1.setUname("cccc");
			user1.setPwd("123456");
			user1.setDeptid(1);
			user1.setBirthday("2013-09-07");
			user1.setSex("s");
			
			Dept dept=new Dept();
			dept.setDeptname("组装部");
			dept.setAddress("漯河");
			
			dept.getUsers().add(user1);
			dept.getUsers().add(user);
			
			baseser.add(dept);
	}

}
