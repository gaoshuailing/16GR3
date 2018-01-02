
package com.qhit.lh.gr3.jin.t8;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.jin.t8.bean.Dept;
import com.qhit.lh.gr3.jin.t8.bean.Emp;
import com.qhit.lh.gr3.jin.t8.bean.User;
import com.qhit.lh.gr3.jin.t8.service.BaseService;
import com.qhit.lh.gr3.jin.t8.service.impl.BaseServiceImpl;

/**
 * @author S01
 * 2017年12月20日
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEname("袁帅");
		User user = new User();
		user.setUname("admin");
		user.setUpwd("123456");
		//部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		//1-1
		emp.setUser(user);
		user.setEmp(emp);
		//n-1
		emp.setDept(dept);
		
		baseService.add(emp);
		
	}
	//根据名字模糊查
	@Test
	public void sel(){
		List<Emp> list=baseService.getEmpByName("%帅%");
		for(Emp emp : list){
			System.out.println(emp.getDid()+"："+emp.getEname());
			
		}
	}
}