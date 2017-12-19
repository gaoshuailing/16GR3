/**
 * 
 */
package com.qhit.lh.gr3.jin.t4;

import org.junit.Test;


import com.qhit.lh.gr3.jin.t4.bean.Dept;
import com.qhit.lh.gr3.jin.t4.bean.Emp;
import com.qhit.lh.gr3.jin.t4.servcie.BaseService;
import com.qhit.lh.gr3.jin.t4.servcie.impl.BaseServiceImpl;

/**
 * @author
 * 2017年12月14日
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add(){
		//创建部门
		Dept dept = new Dept();
		dept.setDname("军事部");
		//没有员工
		
		//有新员工
		Emp gsl = new Emp();
		gsl.setEname("高帅领");
		gsl.setSex("M");
		
		Emp jin = new Emp();
		jin.setEname("高大神");
		jin.setSex("M");
		
		dept.getEmps().add(gsl);
		dept.getEmps().add(jin);
		//do
		baseService.add(dept);
	}
	
	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 7);
		
		baseService.delete(dept);
	}
	
	@Test
	public void update(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 6);
		dept.setDname("华夏帝国");
		
		baseService.update(dept);
	}
	
	@Test
	public void query(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 5);
		
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
}