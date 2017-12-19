/**
 * 
 */
package com.qhit.lh.gr3.jin.t4.bean;

import com.qhit.lh.gr3.jin.t4.bean.Emp;

/**
 * @author 高帅领
 *TODO
 * 2017年12月14日下午5:55:34
 */
public class Emp implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String uname;
	private String password;
	
	//1-1
	private Emp emp;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(String uname, String password) {
		this.uname = uname;
		this.password = password;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

}