package com.qhit.t4.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.qhit.t4.bean.User;
import com.qhit.t4.dao.UserDao;
import com.qhit.t4.utils.DBManager;

public class UserDaoImpl implements UserDao {
	private	Connection con;
	private PreparedStatement ps;
	
	@Override
	public int addUser(User user) {
		// TODO 添加
		con = DBManager.getConnection();
		String sql = "insert into t_user values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getSex());
			ps.setString(4, user.getEducation());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
