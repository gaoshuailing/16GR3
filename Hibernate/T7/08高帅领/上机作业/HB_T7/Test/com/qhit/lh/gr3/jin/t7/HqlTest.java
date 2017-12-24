/**
 * 
 */
package com.qhit.lh.gr3.jin.t7;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.jin.t7.bean.User;
import com.qhit.lh.gr3.jin.t7.servcie.BaseService;
import com.qhit.lh.gr3.jin.t7.servcie.impl.BaseServiceImpl;

/**
 * @author 高帅领
 *TODO
 * 2017年12月24日下午8:51:53
 */
public class HqlTest {   
	
	private BaseService baseser = new BaseServiceImpl();
	@Test    
	public void hql(){
		List<User> list =  baseser.getEmpByName( "from User" );
			for (Object object : list) {
			User user = (User) object;
			System.out.println(user.toString());
	}

	}
}
