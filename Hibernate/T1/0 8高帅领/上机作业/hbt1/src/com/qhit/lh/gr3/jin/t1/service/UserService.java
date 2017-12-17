/**
 * 
 */
package com.qhit.lh.gr3.jin.t1.service;

import java.util.List;

import com.qhit.lh.gr3.jin.t1.bean.User;

/**
 * @author 高帅领
 * TODO
 * 2017-12-12下午15:25:40
 */
public interface UserService {
	//添加
	public void add(Object obj);
	//删除
	public void delete(Object obj);
	//修改
	public void update(Object obj);
	//查询
	public List<User> getAll(String fromObject);
}
